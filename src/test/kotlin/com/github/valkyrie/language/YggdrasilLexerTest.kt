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
        doTest("empty.ygg")
    }

    fun testWhitespace() {
        doTest("whitespace.ygg")
    }

    fun testComments() {
        doTest("comments.ygg")
    }

    fun testStringLiterals() {
        doTest("string-literals.ygg")
    }

    fun testNumberLiterals() {
        doTest("number-literals.ygg")
    }
}