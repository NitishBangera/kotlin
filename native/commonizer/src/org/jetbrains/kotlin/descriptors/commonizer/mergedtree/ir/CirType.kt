/*
 * Copyright 2010-2019 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.descriptors.commonizer.mergedtree.ir

import org.jetbrains.kotlin.descriptors.ClassDescriptor
import org.jetbrains.kotlin.descriptors.ClassifierDescriptor
import org.jetbrains.kotlin.descriptors.TypeAliasDescriptor
import org.jetbrains.kotlin.descriptors.TypeParameterDescriptor
import org.jetbrains.kotlin.descriptors.commonizer.mergedtree.ir.CirSimpleTypeKind.CLASS
import org.jetbrains.kotlin.descriptors.commonizer.mergedtree.ir.CirSimpleTypeKind.TYPE_ALIAS
import org.jetbrains.kotlin.descriptors.commonizer.utils.declarationDescriptor
import org.jetbrains.kotlin.descriptors.commonizer.utils.fqName
import org.jetbrains.kotlin.descriptors.commonizer.utils.fqNameWithTypeParameters
import org.jetbrains.kotlin.descriptors.commonizer.utils.intern
import org.jetbrains.kotlin.name.FqName
import org.jetbrains.kotlin.types.*

sealed class CirType {
    companion object {
        fun create(type: KotlinType): CirType = type.unwrap().run {
            when (this) {
                is SimpleType -> CirSimpleType(this)
                is FlexibleType -> CirFlexibleType(CirSimpleType(lowerBound), CirSimpleType(upperBound))
            }
        }
    }
}

/**
 * All attributes except for [expandedTypeConstructorId] are read from the abbreviation type: [AbbreviatedType.abbreviation].
 * And [expandedTypeConstructorId] is read from the expanded type: [AbbreviatedType.expandedType].
 *
 * This is necessary to properly compare types for type aliases, where abbreviation type represents the type alias itself while
 * expanded type represents right-hand side declaration that should be processed separately.
 *
 * There is no difference between "abbreviation" and "expanded" for types representing classes and type parameters.
 */
class CirSimpleType(original: SimpleType) : CirType() {
    val annotations: List<CirAnnotation>
    val kind: CirSimpleTypeKind
    val fqName: FqName
    val arguments: List<CirTypeProjection>
    val isMarkedNullable: Boolean
    val isDefinitelyNotNullType: Boolean
    val expandedTypeConstructorId: CirTypeConstructorId

    init {
        val abbreviation = (original as? AbbreviatedType)?.abbreviation ?: original
        val expanded = (original as? AbbreviatedType)?.expandedType ?: original

        annotations = abbreviation.annotations.map(::CirAnnotation)
        kind = CirSimpleTypeKind.determineKind(abbreviation.declarationDescriptor)
        fqName = abbreviation.fqName.intern()
        arguments = abbreviation.arguments.map(::CirTypeProjection)
        isMarkedNullable = abbreviation.isMarkedNullable
        isDefinitelyNotNullType = abbreviation.isDefinitelyNotNullType
        expandedTypeConstructorId = CirTypeConstructorId(expanded)
    }

    inline val isClassOrTypeAlias get() = (kind == CLASS || kind == TYPE_ALIAS)
    val fqNameWithTypeParameters = original.fqNameWithTypeParameters

    override fun equals(other: Any?) = fqNameWithTypeParameters == (other as? CirSimpleType)?.fqNameWithTypeParameters
    override fun hashCode() = fqNameWithTypeParameters.hashCode()
}

enum class CirSimpleTypeKind {
    CLASS,
    TYPE_ALIAS,
    TYPE_PARAMETER;

    companion object {
        fun determineKind(classifier: ClassifierDescriptor) = when (classifier) {
            is ClassDescriptor -> CLASS
            is TypeAliasDescriptor -> TYPE_ALIAS
            is TypeParameterDescriptor -> TYPE_PARAMETER
            else -> error("Unexpected classifier descriptor type: ${classifier::class.java}, $classifier")
        }

        fun areCompatible(expect: CirSimpleTypeKind, actual: CirSimpleTypeKind) =
            expect == actual || (expect == CLASS && actual == TYPE_ALIAS)
    }
}

data class CirTypeConstructorId(val fqName: FqName, val numberOfTypeParameters: Int) {
    constructor(type: SimpleType) : this(type.fqName.intern(), type.constructor.parameters.size)
}

class CirTypeProjection(original: TypeProjection) {
    val projectionKind = original.projectionKind
    val isStarProjection = original.isStarProjection
    val type = CirType.create(original.type)
}

data class CirFlexibleType(val lowerBound: CirSimpleType, val upperBound: CirSimpleType) : CirType()

val CirType.fqNameWithTypeParameters: String
    get() = when (this) {
        is CirSimpleType -> fqNameWithTypeParameters
        is CirFlexibleType -> lowerBound.fqNameWithTypeParameters
    }
