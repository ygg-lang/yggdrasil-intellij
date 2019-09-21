package ygg.intellij.ide.navigation

import com.intellij.lang.cacheBuilder.WordsScanner
import com.intellij.lang.findUsages.FindUsagesProvider
import com.intellij.psi.PsiElement
import ygg.intellij.language.psi_node.YggClassStatementNode
import ygg.intellij.language.psi_node.YggUnionStatementNode

class YggdrasilUsageProvider : FindUsagesProvider {
    override fun canFindUsagesFor(psiElement: PsiElement): Boolean {
        return when (psiElement) {
            is YggClassStatementNode, is YggUnionStatementNode -> true
            else -> {
                println("canFindUsagesFor($psiElement)")
                false
            }
        }
    }

    override fun getHelpId(psiElement: PsiElement): String {
        return "getHelpId($psiElement)"
    }

    override fun getType(element: PsiElement): String {
        return when (element) {
            is YggClassStatementNode -> "class"
            is YggUnionStatementNode -> "union"
            else -> {
                println("getType($element)")
                ""
            }
        }
    }

    override fun getDescriptiveName(element: PsiElement): String {
        return when (element) {
            is YggClassStatementNode -> element.name
            is YggUnionStatementNode -> element.name
            else -> {
                "getDescriptiveName($element)"
            }
        }
    }

    override fun getNodeText(element: PsiElement, useFullName: Boolean): String {
        return "getNodeText($element, $useFullName)"
    }
}