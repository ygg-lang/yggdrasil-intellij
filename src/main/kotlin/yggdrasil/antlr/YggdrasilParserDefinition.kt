package yggdrasil.antlr

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.impl.source.tree.CompositeElement
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet
import yggdrasil.language.file.YggdrasilFileNode
import org.antlr.intellij.adaptor.lexer.PSIElementTypeFactory
import org.antlr.intellij.adaptor.parser.ANTLRParserAdaptor
import org.antlr.intellij.adaptor.psi.ANTLRPsiNode
import yggdrasil.language.YggdrasilLanguage

class YggdrasilParserDefinition : ParserDefinition {
    override fun createLexer(project: Project): Lexer {
        return YggdrasilLexer()
    }


    override fun createParser(project: Project): PsiParser {
        return YggdrasilParser(YggdrasilAntlrParser(null))
    }

    /**
     * "Tokens of those types are automatically skipped by PsiBuilder."
     */
    override fun getWhitespaceTokens(): TokenSet {
        return PSIElementTypeFactory.createTokenSet(YggdrasilLanguage, YggdrasilAntlrLexer.WHITE_SPACE)
    }

    override fun getCommentTokens(): TokenSet {
        return YggdrasilLexer.Comments
    }

    override fun getStringLiteralElements(): TokenSet {
        return YggdrasilLexer.Strings
    }


    /**
     * What is the IFileElementType of the root parse tree node? It
     * is called from [.createFile] at least.
     */
    override fun getFileNodeType(): IFileElementType {
        return IFileElementType(YggdrasilLanguage)
    }

    /**
     * Create the root of your PSI tree (a PsiFile).
     *
     *
     * From IntelliJ IDEA Architectural Overview:
     * "A PSI (Program Structure Interface) file is the root of a structure
     * representing the contents of a file as a hierarchy of elements
     * in a particular programming language."
     *
     *
     * PsiFile is to be distinguished from a FileASTNode, which is a parse
     * tree node that eventually becomes a PsiFile. From PsiFile, we can get
     * it back via: [PsiFile.getNode].
     */
    override fun createFile(viewProvider: FileViewProvider): PsiFile {
        return YggdrasilFileNode(viewProvider)
    }

    /**
     * Convert from *NON-LEAF* parse node (AST they call it)
     * to PSI node. Leaves are created in the AST factory.
     * Rename re-factoring can cause this to be
     * called on a TokenIElementType since we want to rename ID nodes.
     * In that case, this method is called to create the root node
     * but with ID type. Kind of strange, but we can simply create a
     * ASTWrapperPsiElement to make everything work correctly.
     *
     *
     * RuleIElementType.  Ah! It's that ID is the root
     * IElementType requested to parse, which means that the root
     * node returned from parsetree->PSI conversion.  But, it
     * must be a CompositeElement! The adaptor calls
     * rootMarker.done(root) to finish off the PSI conversion.
     * See [ANTLRParserAdaptor.parse]
     *
     *
     * If you don't care to distinguish PSI nodes by type, it is
     * sufficient to create a [ANTLRPsiNode] around
     * the parse tree node
     */
    override fun createElement(node: ASTNode): PsiElement {
        return if (node is CompositeElement) {
            YggdrasilParser.extractCompositeNode(node)
        } else {
            println("create element of ${node.javaClass.name}: ${node.elementType}(${node.text})")
            ASTWrapperPsiElement(node)
        }
    }

    override fun spaceExistenceTypeBetweenTokens(left: ASTNode?, right: ASTNode?): ParserDefinition.SpaceRequirements {
        return super.spaceExistenceTypeBetweenTokens(left, right)
    }

    @Suppress("CompanionObjectInExtension", "DEPRECATION")
    companion object {
        init {
            PSIElementTypeFactory.defineLanguageIElementTypes(
                YggdrasilLanguage, YggdrasilAntlrParser.tokenNames, YggdrasilAntlrParser.ruleNames
            )
        }
    }
}


