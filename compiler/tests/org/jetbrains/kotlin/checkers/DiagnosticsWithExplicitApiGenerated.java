/*
 * Copyright 2010-2019 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.checkers;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/diagnostics/testsWithExplicitApi")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class DiagnosticsWithExplicitApiGenerated extends AbstractDiagnosticsWithExplicitApi {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    public void testAllFilesPresentInTestsWithExplicitApi() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/diagnostics/testsWithExplicitApi"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @TestMetadata("annotations.kt")
    public void testAnnotations() throws Exception {
        runTest("compiler/testData/diagnostics/testsWithExplicitApi/annotations.kt");
    }

    @TestMetadata("classes.kt")
    public void testClasses() throws Exception {
        runTest("compiler/testData/diagnostics/testsWithExplicitApi/classes.kt");
    }

    @TestMetadata("companionObject.kt")
    public void testCompanionObject() throws Exception {
        runTest("compiler/testData/diagnostics/testsWithExplicitApi/companionObject.kt");
    }

    @TestMetadata("constructors.kt")
    public void testConstructors() throws Exception {
        runTest("compiler/testData/diagnostics/testsWithExplicitApi/constructors.kt");
    }

    @TestMetadata("inlineClasses.kt")
    public void testInlineClasses() throws Exception {
        runTest("compiler/testData/diagnostics/testsWithExplicitApi/inlineClasses.kt");
    }

    @TestMetadata("interfaces.kt")
    public void testInterfaces() throws Exception {
        runTest("compiler/testData/diagnostics/testsWithExplicitApi/interfaces.kt");
    }

    @TestMetadata("mustBeEffectivelyPublic.kt")
    public void testMustBeEffectivelyPublic() throws Exception {
        runTest("compiler/testData/diagnostics/testsWithExplicitApi/mustBeEffectivelyPublic.kt");
    }

    @TestMetadata("properties.kt")
    public void testProperties() throws Exception {
        runTest("compiler/testData/diagnostics/testsWithExplicitApi/properties.kt");
    }

    @TestMetadata("toplevel.kt")
    public void testToplevel() throws Exception {
        runTest("compiler/testData/diagnostics/testsWithExplicitApi/toplevel.kt");
    }
}
