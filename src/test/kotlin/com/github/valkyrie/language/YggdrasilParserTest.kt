package com.github.valkyrie.language

import yggdrasil.psi.YggdrasilParserDefinition
import com.intellij.testFramework.ParsingTestCase

class YggdrasilParserTest : ParsingTestCase("parser", "ygg", YggdrasilParserDefinition) {
    override fun getTestDataPath(): String {
        return "src/test/testData"
    }

    fun testEmpty() {
        doTest(true)
    }

    fun testClassDeclaration() {
        doTest(true)
    }

    fun testFunctionDeclaration() {
        doTest(true)
    }

    fun testExpression() {
        doTest(true)
    }

    fun testStatement() {
        doTest(true)
    }

    fun testImport() {
        doTest(true)
    }

    override fun includeRanges(): Boolean {
        return true
    }
}