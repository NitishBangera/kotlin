/*
 * Copyright 2010-2014 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.jet.completion;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.jet.JUnit3RunnerWithInners;
import org.jetbrains.jet.JetTestUtils;
import org.jetbrains.jet.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.jet.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("idea/testData/completion/smart")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class JvmSmartCompletionTestGenerated extends AbstractJvmSmartCompletionTest {
    @TestMetadata("AfterAs.kt")
    public void testAfterAs() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/AfterAs.kt");
        doTest(fileName);
    }

    @TestMetadata("AfterAs2.kt")
    public void testAfterAs2() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/AfterAs2.kt");
        doTest(fileName);
    }

    @TestMetadata("AfterAs3.kt")
    public void testAfterAs3() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/AfterAs3.kt");
        doTest(fileName);
    }

    @TestMetadata("AfterExclSign.kt")
    public void testAfterExclSign() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/AfterExclSign.kt");
        doTest(fileName);
    }

    public void testAllFilesPresentInSmart() throws Exception {
        JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/completion/smart"), Pattern.compile("^(.+)\\.kt$"), true);
    }

    @TestMetadata("AnonymousObject1.kt")
    public void testAnonymousObject1() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/AnonymousObject1.kt");
        doTest(fileName);
    }

    @TestMetadata("AnonymousObject2.kt")
    public void testAnonymousObject2() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/AnonymousObject2.kt");
        doTest(fileName);
    }

    @TestMetadata("AnonymousObjectForJavaInterface.kt")
    public void testAnonymousObjectForJavaInterface() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/AnonymousObjectForJavaInterface.kt");
        doTest(fileName);
    }

    @TestMetadata("AnonymousObjectWithPrefix.kt")
    public void testAnonymousObjectWithPrefix() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/AnonymousObjectWithPrefix.kt");
        doTest(fileName);
    }

    @TestMetadata("AnyExpected.kt")
    public void testAnyExpected() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/AnyExpected.kt");
        doTest(fileName);
    }

    @TestMetadata("AutoNotNullType.kt")
    public void testAutoNotNullType() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/AutoNotNullType.kt");
        doTest(fileName);
    }

    @TestMetadata("AutoNotNullType2.kt")
    public void testAutoNotNullType2() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/AutoNotNullType2.kt");
        doTest(fileName);
    }

    @TestMetadata("AutoNotNullTypeForConstructorParameter.kt")
    public void testAutoNotNullTypeForConstructorParameter() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/AutoNotNullTypeForConstructorParameter.kt");
        doTest(fileName);
    }

    @TestMetadata("AutoNotNullTypeWithQualifier.kt")
    public void testAutoNotNullTypeWithQualifier() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/AutoNotNullTypeWithQualifier.kt");
        doTest(fileName);
    }

    @TestMetadata("BeforeArgumentWithBinaryOperation.kt")
    public void testBeforeArgumentWithBinaryOperation() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/BeforeArgumentWithBinaryOperation.kt");
        doTest(fileName);
    }

    @TestMetadata("BeforeArgumentWithBinaryOperation2.kt")
    public void testBeforeArgumentWithBinaryOperation2() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/BeforeArgumentWithBinaryOperation2.kt");
        doTest(fileName);
    }

    @TestMetadata("BeforeArgumentWithBinaryOperation3.kt")
    public void testBeforeArgumentWithBinaryOperation3() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/BeforeArgumentWithBinaryOperation3.kt");
        doTest(fileName);
    }

    @TestMetadata("BooleanExpected.kt")
    public void testBooleanExpected() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/BooleanExpected.kt");
        doTest(fileName);
    }

    @TestMetadata("ChainedCall.kt")
    public void testChainedCall() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/ChainedCall.kt");
        doTest(fileName);
    }

    @TestMetadata("ClassObjectMembers.kt")
    public void testClassObjectMembers() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/ClassObjectMembers.kt");
        doTest(fileName);
    }

    @TestMetadata("ClassObjectMembersForNullable.kt")
    public void testClassObjectMembersForNullable() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/ClassObjectMembersForNullable.kt");
        doTest(fileName);
    }

    @TestMetadata("ClassObjectMembersWithPrefix.kt")
    public void testClassObjectMembersWithPrefix() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/ClassObjectMembersWithPrefix.kt");
        doTest(fileName);
    }

    @TestMetadata("Constructor.kt")
    public void testConstructor() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/Constructor.kt");
        doTest(fileName);
    }

    @TestMetadata("ConstructorForGenericJavaClass.kt")
    public void testConstructorForGenericJavaClass() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/ConstructorForGenericJavaClass.kt");
        doTest(fileName);
    }

    @TestMetadata("ConstructorForGenericType.kt")
    public void testConstructorForGenericType() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/ConstructorForGenericType.kt");
        doTest(fileName);
    }

    @TestMetadata("ConstructorForJavaClass.kt")
    public void testConstructorForJavaClass() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/ConstructorForJavaClass.kt");
        doTest(fileName);
    }

    @TestMetadata("ConstructorForNullable.kt")
    public void testConstructorForNullable() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/ConstructorForNullable.kt");
        doTest(fileName);
    }

    @TestMetadata("ConstructorWithParameters.kt")
    public void testConstructorWithParameters() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/ConstructorWithParameters.kt");
        doTest(fileName);
    }

    @TestMetadata("EmptyPrefix.kt")
    public void testEmptyPrefix() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/EmptyPrefix.kt");
        doTest(fileName);
    }

    @TestMetadata("EnumMembers.kt")
    public void testEnumMembers() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/EnumMembers.kt");
        doTest(fileName);
    }

    @TestMetadata("EqOperator.kt")
    public void testEqOperator() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/EqOperator.kt");
        doTest(fileName);
    }

    @TestMetadata("FunctionReference1.kt")
    public void testFunctionReference1() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/FunctionReference1.kt");
        doTest(fileName);
    }

    @TestMetadata("FunctionReference10.kt")
    public void testFunctionReference10() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/FunctionReference10.kt");
        doTest(fileName);
    }

    @TestMetadata("FunctionReference12.kt")
    public void testFunctionReference12() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/FunctionReference12.kt");
        doTest(fileName);
    }

    @TestMetadata("FunctionReference3.kt")
    public void testFunctionReference3() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/FunctionReference3.kt");
        doTest(fileName);
    }

    @TestMetadata("FunctionReference4.kt")
    public void testFunctionReference4() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/FunctionReference4.kt");
        doTest(fileName);
    }

    @TestMetadata("FunctionReference7.kt")
    public void testFunctionReference7() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/FunctionReference7.kt");
        doTest(fileName);
    }

    @TestMetadata("FunctionReference9.kt")
    public void testFunctionReference9() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/FunctionReference9.kt");
        doTest(fileName);
    }

    @TestMetadata("GenericFunction1.kt")
    public void testGenericFunction1() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/GenericFunction1.kt");
        doTest(fileName);
    }

    @TestMetadata("GenericFunction2.kt")
    public void testGenericFunction2() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/GenericFunction2.kt");
        doTest(fileName);
    }

    @TestMetadata("GenericFunction3.kt")
    public void testGenericFunction3() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/GenericFunction3.kt");
        doTest(fileName);
    }

    @TestMetadata("GenericFunction4.kt")
    public void testGenericFunction4() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/GenericFunction4.kt");
        doTest(fileName);
    }

    @TestMetadata("GenericFunction5.kt")
    public void testGenericFunction5() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/GenericFunction5.kt");
        doTest(fileName);
    }

    @TestMetadata("GenericMethodArgument.kt")
    public void testGenericMethodArgument() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/GenericMethodArgument.kt");
        doTest(fileName);
    }

    @TestMetadata("GroupBySubstitutor.kt")
    public void testGroupBySubstitutor() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/GroupBySubstitutor.kt");
        doTest(fileName);
    }

    @TestMetadata("IfCondition.kt")
    public void testIfCondition() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/IfCondition.kt");
        doTest(fileName);
    }

    @TestMetadata("IfValue1.kt")
    public void testIfValue1() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/IfValue1.kt");
        doTest(fileName);
    }

    @TestMetadata("IfValue2.kt")
    public void testIfValue2() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/IfValue2.kt");
        doTest(fileName);
    }

    @TestMetadata("IfValue3.kt")
    public void testIfValue3() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/IfValue3.kt");
        doTest(fileName);
    }

    @TestMetadata("IfValue4.kt")
    public void testIfValue4() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/IfValue4.kt");
        doTest(fileName);
    }

    @TestMetadata("IfValueInBlock1.kt")
    public void testIfValueInBlock1() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/IfValueInBlock1.kt");
        doTest(fileName);
    }

    @TestMetadata("IfValueInBlock2.kt")
    public void testIfValueInBlock2() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/IfValueInBlock2.kt");
        doTest(fileName);
    }

    @TestMetadata("ImmediateExtensionMembers.kt")
    public void testImmediateExtensionMembers() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/ImmediateExtensionMembers.kt");
        doTest(fileName);
    }

    @TestMetadata("ImmediateMembers.kt")
    public void testImmediateMembers() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/ImmediateMembers.kt");
        doTest(fileName);
    }

    @TestMetadata("ImplicitlyTypedFunBody.kt")
    public void testImplicitlyTypedFunBody() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/ImplicitlyTypedFunBody.kt");
        doTest(fileName);
    }

    @TestMetadata("ImplicitlyTypedValInitializer1.kt")
    public void testImplicitlyTypedValInitializer1() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/ImplicitlyTypedValInitializer1.kt");
        doTest(fileName);
    }

    @TestMetadata("ImplicitlyTypedValInitializer2.kt")
    public void testImplicitlyTypedValInitializer2() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/ImplicitlyTypedValInitializer2.kt");
        doTest(fileName);
    }

    @TestMetadata("InElvisOperator1.kt")
    public void testInElvisOperator1() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/InElvisOperator1.kt");
        doTest(fileName);
    }

    @TestMetadata("InElvisOperator2.kt")
    public void testInElvisOperator2() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/InElvisOperator2.kt");
        doTest(fileName);
    }

    @TestMetadata("InElvisOperator3.kt")
    public void testInElvisOperator3() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/InElvisOperator3.kt");
        doTest(fileName);
    }

    @TestMetadata("InElvisOperator4.kt")
    public void testInElvisOperator4() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/InElvisOperator4.kt");
        doTest(fileName);
    }

    @TestMetadata("InElvisOperator5.kt")
    public void testInElvisOperator5() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/InElvisOperator5.kt");
        doTest(fileName);
    }

    @TestMetadata("InElvisOperator6.kt")
    public void testInElvisOperator6() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/InElvisOperator6.kt");
        doTest(fileName);
    }

    @TestMetadata("InaccessibleConstructor.kt")
    public void testInaccessibleConstructor() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/InaccessibleConstructor.kt");
        doTest(fileName);
    }

    @TestMetadata("InaccessibleDeclarations.kt")
    public void testInaccessibleDeclarations() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/InaccessibleDeclarations.kt");
        doTest(fileName);
    }

    @TestMetadata("InfixCall.kt")
    public void testInfixCall() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/InfixCall.kt");
        doTest(fileName);
    }

    @TestMetadata("Inheritors1.kt")
    public void testInheritors1() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/Inheritors1.kt");
        doTest(fileName);
    }

    @TestMetadata("Inheritors2.kt")
    public void testInheritors2() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/Inheritors2.kt");
        doTest(fileName);
    }

    @TestMetadata("Inheritors3.kt")
    public void testInheritors3() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/Inheritors3.kt");
        doTest(fileName);
    }

    @TestMetadata("InsideIdentifier.kt")
    public void testInsideIdentifier() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/InsideIdentifier.kt");
        doTest(fileName);
    }

    @TestMetadata("InvokeFunctionVariable.kt")
    public void testInvokeFunctionVariable() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/InvokeFunctionVariable.kt");
        doTest(fileName);
    }

    @TestMetadata("JavaEnumMembers.kt")
    public void testJavaEnumMembers() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/JavaEnumMembers.kt");
        doTest(fileName);
    }

    @TestMetadata("JavaEnumMembersAfterQualifier.kt")
    public void testJavaEnumMembersAfterQualifier() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/JavaEnumMembersAfterQualifier.kt");
        doTest(fileName);
    }

    @TestMetadata("JavaEnumMembersForNullable.kt")
    public void testJavaEnumMembersForNullable() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/JavaEnumMembersForNullable.kt");
        doTest(fileName);
    }

    @TestMetadata("JavaStaticFields.kt")
    public void testJavaStaticFields() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/JavaStaticFields.kt");
        doTest(fileName);
    }

    @TestMetadata("JavaStaticFieldsForNullable.kt")
    public void testJavaStaticFieldsForNullable() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/JavaStaticFieldsForNullable.kt");
        doTest(fileName);
    }

    @TestMetadata("JavaStaticMethods.kt")
    public void testJavaStaticMethods() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/JavaStaticMethods.kt");
        doTest(fileName);
    }

    @TestMetadata("kt5873.kt")
    public void testKt5873() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/kt5873.kt");
        doTest(fileName);
    }

    @TestMetadata("Lambda1.kt")
    public void testLambda1() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/Lambda1.kt");
        doTest(fileName);
    }

    @TestMetadata("Lambda2.kt")
    public void testLambda2() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/Lambda2.kt");
        doTest(fileName);
    }

    @TestMetadata("Lambda3.kt")
    public void testLambda3() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/Lambda3.kt");
        doTest(fileName);
    }

    @TestMetadata("Lambda4.kt")
    public void testLambda4() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/Lambda4.kt");
        doTest(fileName);
    }

    @TestMetadata("Lambda5.kt")
    public void testLambda5() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/Lambda5.kt");
        doTest(fileName);
    }

    @TestMetadata("MethodCallArgument.kt")
    public void testMethodCallArgument() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/MethodCallArgument.kt");
        doTest(fileName);
    }

    @TestMetadata("MultipleArgsItem1.kt")
    public void testMultipleArgsItem1() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/MultipleArgsItem1.kt");
        doTest(fileName);
    }

    @TestMetadata("MultipleArgsItem10.kt")
    public void testMultipleArgsItem10() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/MultipleArgsItem10.kt");
        doTest(fileName);
    }

    @TestMetadata("MultipleArgsItem11.kt")
    public void testMultipleArgsItem11() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/MultipleArgsItem11.kt");
        doTest(fileName);
    }

    @TestMetadata("MultipleArgsItem2.kt")
    public void testMultipleArgsItem2() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/MultipleArgsItem2.kt");
        doTest(fileName);
    }

    @TestMetadata("MultipleArgsItem3.kt")
    public void testMultipleArgsItem3() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/MultipleArgsItem3.kt");
        doTest(fileName);
    }

    @TestMetadata("MultipleArgsItem4.kt")
    public void testMultipleArgsItem4() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/MultipleArgsItem4.kt");
        doTest(fileName);
    }

    @TestMetadata("MultipleArgsItem5.kt")
    public void testMultipleArgsItem5() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/MultipleArgsItem5.kt");
        doTest(fileName);
    }

    @TestMetadata("MultipleArgsItem6.kt")
    public void testMultipleArgsItem6() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/MultipleArgsItem6.kt");
        doTest(fileName);
    }

    @TestMetadata("MultipleArgsItem7.kt")
    public void testMultipleArgsItem7() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/MultipleArgsItem7.kt");
        doTest(fileName);
    }

    @TestMetadata("MultipleArgsItem8.kt")
    public void testMultipleArgsItem8() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/MultipleArgsItem8.kt");
        doTest(fileName);
    }

    @TestMetadata("MultipleArgsItem9.kt")
    public void testMultipleArgsItem9() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/MultipleArgsItem9.kt");
        doTest(fileName);
    }

    @TestMetadata("NoConstructorWithQualifier.kt")
    public void testNoConstructorWithQualifier() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/NoConstructorWithQualifier.kt");
        doTest(fileName);
    }

    @TestMetadata("NoExtensionMethodFromClassObject.kt")
    public void testNoExtensionMethodFromClassObject() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/NoExtensionMethodFromClassObject.kt");
        doTest(fileName);
    }

    @TestMetadata("NoFunctionReferenceAfterQualifier.kt")
    public void testNoFunctionReferenceAfterQualifier() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/NoFunctionReferenceAfterQualifier.kt");
        doTest(fileName);
    }

    @TestMetadata("NoNothing.kt")
    public void testNoNothing() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/NoNothing.kt");
        doTest(fileName);
    }

    @TestMetadata("NoPrivateOverload.kt")
    public void testNoPrivateOverload() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/NoPrivateOverload.kt");
        doTest(fileName);
    }

    @TestMetadata("NoQualifiedThisOfAnonymousObject.kt")
    public void testNoQualifiedThisOfAnonymousObject() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/NoQualifiedThisOfAnonymousObject.kt");
        doTest(fileName);
    }

    @TestMetadata("NoSillyAssignment.kt")
    public void testNoSillyAssignment() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/NoSillyAssignment.kt");
        doTest(fileName);
    }

    @TestMetadata("NotEqOperator.kt")
    public void testNotEqOperator() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/NotEqOperator.kt");
        doTest(fileName);
    }

    @TestMetadata("NotSillyAssignment.kt")
    public void testNotSillyAssignment() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/NotSillyAssignment.kt");
        doTest(fileName);
    }

    @TestMetadata("Null.kt")
    public void testNull() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/Null.kt");
        doTest(fileName);
    }

    @TestMetadata("NullableThis.kt")
    public void testNullableThis() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/NullableThis.kt");
        doTest(fileName);
    }

    @TestMetadata("Object.kt")
    public void testObject() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/Object.kt");
        doTest(fileName);
    }

    @TestMetadata("ObjectsFromType.kt")
    public void testObjectsFromType() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/ObjectsFromType.kt");
        doTest(fileName);
    }

    @TestMetadata("OverloadedConstructorArgument.kt")
    public void testOverloadedConstructorArgument() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/OverloadedConstructorArgument.kt");
        doTest(fileName);
    }

    @TestMetadata("OverloadedMethodCallArgument1.kt")
    public void testOverloadedMethodCallArgument1() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/OverloadedMethodCallArgument1.kt");
        doTest(fileName);
    }

    @TestMetadata("OverloadedMethodCallArgument2.kt")
    public void testOverloadedMethodCallArgument2() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/OverloadedMethodCallArgument2.kt");
        doTest(fileName);
    }

    @TestMetadata("OverloadedMethodCallArgument3.kt")
    public void testOverloadedMethodCallArgument3() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/OverloadedMethodCallArgument3.kt");
        doTest(fileName);
    }

    @TestMetadata("ParameterWithDefaultValue.kt")
    public void testParameterWithDefaultValue() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/ParameterWithDefaultValue.kt");
        doTest(fileName);
    }

    @TestMetadata("PrivateConstructorForAbstract.kt")
    public void testPrivateConstructorForAbstract() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/PrivateConstructorForAbstract.kt");
        doTest(fileName);
    }

    @TestMetadata("ProtectedConstructorForAbstract.kt")
    public void testProtectedConstructorForAbstract() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/ProtectedConstructorForAbstract.kt");
        doTest(fileName);
    }

    @TestMetadata("QualifiedOverloadedMethodCallArgument1.kt")
    public void testQualifiedOverloadedMethodCallArgument1() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/QualifiedOverloadedMethodCallArgument1.kt");
        doTest(fileName);
    }

    @TestMetadata("QualifiedOverloadedMethodCallArgument2.kt")
    public void testQualifiedOverloadedMethodCallArgument2() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/QualifiedOverloadedMethodCallArgument2.kt");
        doTest(fileName);
    }

    @TestMetadata("QualifiedThis.kt")
    public void testQualifiedThis() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/QualifiedThis.kt");
        doTest(fileName);
    }

    @TestMetadata("QualifiedThisOfExtensionFunction.kt")
    public void testQualifiedThisOfExtensionFunction() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/QualifiedThisOfExtensionFunction.kt");
        doTest(fileName);
    }

    @TestMetadata("QualifiedThisOfExtensionLambda1.kt")
    public void testQualifiedThisOfExtensionLambda1() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/QualifiedThisOfExtensionLambda1.kt");
        doTest(fileName);
    }

    @TestMetadata("QualifiedThisOfExtensionLambda2.kt")
    public void testQualifiedThisOfExtensionLambda2() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/QualifiedThisOfExtensionLambda2.kt");
        doTest(fileName);
    }

    @TestMetadata("QualifiedThisOfExtensionLambda3.kt")
    public void testQualifiedThisOfExtensionLambda3() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/QualifiedThisOfExtensionLambda3.kt");
        doTest(fileName);
    }

    @TestMetadata("SAMExpected1.kt")
    public void testSAMExpected1() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/SAMExpected1.kt");
        doTest(fileName);
    }

    @TestMetadata("SkipDeclarationsOfType.kt")
    public void testSkipDeclarationsOfType() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/SkipDeclarationsOfType.kt");
        doTest(fileName);
    }

    @TestMetadata("SkipUnresolvedTypes.kt")
    public void testSkipUnresolvedTypes() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/SkipUnresolvedTypes.kt");
        doTest(fileName);
    }

    @TestMetadata("SmartCastType.kt")
    public void testSmartCastType() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/SmartCastType.kt");
        doTest(fileName);
    }

    @TestMetadata("SmartCastTypeWithQualifier.kt")
    public void testSmartCastTypeWithQualifier() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/SmartCastTypeWithQualifier.kt");
        doTest(fileName);
    }

    @TestMetadata("This.kt")
    public void testThis() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/This.kt");
        doTest(fileName);
    }

    @TestMetadata("UnresolvedExpectedType.kt")
    public void testUnresolvedExpectedType() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/UnresolvedExpectedType.kt");
        doTest(fileName);
    }

    @TestMetadata("VariableAsFunction1.kt")
    public void testVariableAsFunction1() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/VariableAsFunction1.kt");
        doTest(fileName);
    }

    @TestMetadata("VariableAsFunction3.kt")
    public void testVariableAsFunction3() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/VariableAsFunction3.kt");
        doTest(fileName);
    }

    @TestMetadata("VariableInitializer.kt")
    public void testVariableInitializer() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/VariableInitializer.kt");
        doTest(fileName);
    }

    @TestMetadata("WhenEntryValue1.kt")
    public void testWhenEntryValue1() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/WhenEntryValue1.kt");
        doTest(fileName);
    }

    @TestMetadata("WhenEntryValue2.kt")
    public void testWhenEntryValue2() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/WhenEntryValue2.kt");
        doTest(fileName);
    }

    @TestMetadata("WhenEntryValue3.kt")
    public void testWhenEntryValue3() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/WhenEntryValue3.kt");
        doTest(fileName);
    }

    @TestMetadata("WhenEntryValue4.kt")
    public void testWhenEntryValue4() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/WhenEntryValue4.kt");
        doTest(fileName);
    }

    @TestMetadata("WhenEntryValue5.kt")
    public void testWhenEntryValue5() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/WhenEntryValue5.kt");
        doTest(fileName);
    }

    @TestMetadata("WhenEntryValue6.kt")
    public void testWhenEntryValue6() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/WhenEntryValue6.kt");
        doTest(fileName);
    }

    @TestMetadata("WhenEntryValue7.kt")
    public void testWhenEntryValue7() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/WhenEntryValue7.kt");
        doTest(fileName);
    }

    @TestMetadata("WhenEntryValue8.kt")
    public void testWhenEntryValue8() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/WhenEntryValue8.kt");
        doTest(fileName);
    }

    @TestMetadata("WhenEntryValue9.kt")
    public void testWhenEntryValue9() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/WhenEntryValue9.kt");
        doTest(fileName);
    }

    @TestMetadata("WhenWithNoSubjectEntryValue1.kt")
    public void testWhenWithNoSubjectEntryValue1() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/WhenWithNoSubjectEntryValue1.kt");
        doTest(fileName);
    }

    @TestMetadata("WhenWithNoSubjectEntryValue2.kt")
    public void testWhenWithNoSubjectEntryValue2() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/WhenWithNoSubjectEntryValue2.kt");
        doTest(fileName);
    }

    @TestMetadata("WithPrefix.kt")
    public void testWithPrefix() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/WithPrefix.kt");
        doTest(fileName);
    }

    @TestMetadata("WithQualifier.kt")
    public void testWithQualifier() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/WithQualifier.kt");
        doTest(fileName);
    }

    @TestMetadata("WrongNumberOfTypeArguments.kt")
    public void testWrongNumberOfTypeArguments() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/WrongNumberOfTypeArguments.kt");
        doTest(fileName);
    }

    @TestMetadata("WrongReceiver.kt")
    public void testWrongReceiver() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/smart/WrongReceiver.kt");
        doTest(fileName);
    }
}
