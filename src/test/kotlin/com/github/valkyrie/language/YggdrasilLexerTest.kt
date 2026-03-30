package com.github.valkyrie.language

import yggdrasil.psi.YggdrasilLexer
import com.intellij.lexer.Lexer
import com.intellij.testFramework.LexerTestCase

class YggdrasilLexerTest : LexerTestCase() {
    override fun getDirPath(): String {
        return "lexer"
    }

    override fun createLexer(): Lexer {
        return YggdrasilLexer()
    }

    fun testEmpty() {
        doTest("empty.yggdrasil")
    }

    fun testWhitespace() {
        doTest("whitespace.yggdrasil")
    }

    fun testComments() {
        doTest("comments.yggdrasil")
    }

    fun testStringLiterals() {
        doTest("string-literals.yggdrasil")
    }

    fun testNumberLiterals() {
        doTest("number-literals.yggdrasil")
    }
}