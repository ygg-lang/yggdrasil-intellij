package ygg.intellij.language.file

import com.intellij.openapi.project.Project
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFileFactory
import com.intellij.psi.util.PsiTreeUtil
import ygg.intellij.language.YggdrasilLanguage
import ygg.intellij.language.psi_node.YggIdentifierNode

class YggdrasilFactory {
    private val project: Project

    constructor(project: Project) {
        this.project = project
    }


    constructor(element: PsiElement) {
        this.project = element.project
    }

    fun createFile(text: String): YggdrasilFileNode {
        val factory = PsiFileFactory.getInstance(project)
        return factory.createFileFromText("factory.vk", YggdrasilLanguage, text) as YggdrasilFileNode
    }

    fun createIdentifier(text: String): YggIdentifierNode {
        val file = createFile("class $text {}")
        return PsiTreeUtil.findChildOfType(file, YggIdentifierNode::class.java)!!
    }
}