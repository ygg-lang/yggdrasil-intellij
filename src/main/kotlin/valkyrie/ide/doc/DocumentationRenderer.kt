package valkyrie.ide.doc

//import nexus.language.psi_node.ValkyrieClassStatementNode
//import nexus.language.psi_node.ValkyrieTraitStatementNode
import com.intellij.openapi.editor.colors.EditorColorsManager
import com.intellij.openapi.editor.richcopy.HtmlSyntaxInfoUtil
import com.intellij.psi.PsiElement
import com.intellij.psi.util.elementType
import com.intellij.ui.ColorUtil
import nexus.antlr.NexusLexer
import nexus.language.ast.classes.NexusClassStatement
import valkyrie.ide.highlight.NexusHighlightColor
import valkyrie.ide.highlight.NexusHighlightColor.KEYWORD
import valkyrie.ide.highlight.NexusHighlightColor.SYM_CLASS
import valkyrie.lsp.RequestDocument

class DocumentationRenderer(var element: PsiElement, private var original: PsiElement?) {
    private val doc = StringBuilder()
    fun onHover(): String {
        when {
            NexusLexer.Keywords.contains(element.elementType) -> return RequestDocument.keyword(element.text).send()
            NexusLexer.Operators.contains(element.elementType) -> return RequestDocument.operator(element.text).send()
            else -> {}
        }
        when (element) {
            is NexusClassStatement -> buildShort(element as NexusClassStatement)
            else -> {
                doc.append(element)
                doc.append("<br/>")
                doc.append(original)
                doc.append("<br/>")
                doc.append("onDetail: ${element.text}")
            }
        }
        return doc.toString()
    }

    private fun buildShort(element: NexusClassStatement) {
        append(KEYWORD, "crate ")
        appendNamespace()
        doc.append("<br/>")
        append(KEYWORD, "public ")
        append(KEYWORD, "native ")
        append(KEYWORD, "class ")
        append(SYM_CLASS, element.name ?: "[Unknown]")
//        appendNewline()
//        append(KEYWORD, "implements ")
//        append(SYM_TRAIT, "Eq")
//        appendAdd()
//        append(SYM_TRAIT, "Hash")
    }


    /// get the path relative to the project root
    /// FIXME: get real declare module
    private fun appendNamespace() {
        val file = element.containingFile;
        // fake module path
        val path = file.virtualFile.path.substringAfter("src/").replace("/", "::").replace(".vk", "")
        append(path)
    }

    fun append(text: String) {
        doc.append("<span>${text}</span>")
    }

    fun append(key: NexusHighlightColor, text: String) {
        // HtmlSyntaxInfoUtil.getStyledSpan(key.textAttributesKey, text, 1.0f)
        val attr = EditorColorsManager.getInstance().globalScheme.getAttributes(key.textAttributesKey)
        val color = ColorUtil.toHtmlColor(attr.foregroundColor)
        doc.append("<span style='color:${color}'>${text}</span>")
    }

    private fun appendHighlight(code: String) {
        HtmlSyntaxInfoUtil.appendHighlightedByLexerAndEncodedAsHtmlCodeSnippet(
            doc,
            element.project,
            nexus.language.NexusLanguage,
            code.trimIndent(),
            1.0f,
        )
    }

    private fun appendAdd() {
        doc.append("<span>+</span>")
    }
}


