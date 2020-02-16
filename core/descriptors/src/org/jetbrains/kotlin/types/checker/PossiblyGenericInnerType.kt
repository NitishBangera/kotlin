/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.types.checker

import org.jetbrains.kotlin.descriptors.PossiblyInnerType
import org.jetbrains.kotlin.types.model.PossiblyGenericInnerType
import org.jetbrains.kotlin.types.model.TypeArgumentMarker
import org.jetbrains.kotlin.types.model.TypeParameterMarker

class PossiblyGenericInnerTypeImpl(
    private val possiblyInnerType: PossiblyInnerType
) : PossiblyGenericInnerType {
    override val arguments: List<TypeArgumentMarker>
        get() = possiblyInnerType.arguments

    override val parameters: List<TypeParameterMarker>
        get() = possiblyInnerType.classifierDescriptor.declaredTypeParameters

    override val outerType: PossiblyGenericInnerType?
        get() = possiblyInnerType.outerType?.let { PossiblyGenericInnerTypeImpl(it) }
}