package yggdrasil.psi

import com.intellij.lang.ASTNode
import com.intellij.lang.LightPsiParser
import com.intellij.lang.PsiBuilder
import com.intellij.lang.PsiParser
import com.intellij.psi.tree.IElementType

class YggdrasilParser: PsiParser, LightPsiParser {
    override fun parse(root: IElementType, builder: PsiBuilder): ASTNode {
        TODO("Not yet implemented")
    }

    override fun parseLight(root: IElementType?, builder: PsiBuilder?) {
        TODO("Not yet implemented")
    }


}