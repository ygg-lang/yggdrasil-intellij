package valkyrie.ide.hint

import com.intellij.codeInsight.hints.InlayHintsCollector
import com.intellij.codeInsight.hints.InlayHintsSink
import com.intellij.codeInsight.hints.presentation.PresentationFactory
import com.intellij.openapi.editor.Editor
import com.intellij.psi.PsiElement
import yggdrasil.language.psi.ValkyrieInlayElement

@Suppress("UnstableApiUsage")
class TypeInlayHint(val settings: InlayTypeSetting) : InlayHintsCollector {
    private var _factory: PresentationFactory? = null;
    private var _sink: InlayHintsSink? = null;
    override fun collect(element: PsiElement, editor: Editor, sink: InlayHintsSink): Boolean {
        _factory = PresentationFactory(editor);
        _sink = sink;
        if (element is ValkyrieInlayElement) {
            element.type_hint(this)
        }
        return true
//            settings.showForLoopType && element is ValkyriePatternItemNode -> {
//                inline(element.identifier.textRange.endOffset, "Unknown")
//            }

//            settings.showDefineParameterType && element is ValkyrieDefineItemNode -> {
//                val id = element.identifier ?: return true;
//                if (id.text == "self") {
//                    // skip
//                } else if (element.typeExpression == null) {
//                    id.textRange?.let {
//                        inline(it.endOffset, "Unknown")
//                    }
//                }
//            }

//            settings.showDefineReturnType && element is ValkyrieDefineStatementNode -> {
//                if (element.returnType == null) {
//                    element.defineTuple?.textRange?.let {
//                        inline(it.endOffset, "Unknown", split = "⟶")
//                    }
//                }
//            }
//
//            settings.showClassFieldType && element is ValkyrieClassFieldNode -> {
//                if (element.typeExpression == null) {
//                    inline(element.nameIdentifier.textRange.endOffset, "Unknown", split = ":")
//                }
//            }
//
//            settings.showBitFlagType && element is ValkyrieBitflagStatementNode -> {
//                if (element.typeExpression == null) {
//                    inline(element.identifier.textRange.endOffset, "u32")
//                }
//            }

    }

    fun inline(start: Int, text: String) {
        _sink!!.addInlineElement(
            start, true,
            // click then replace
            _factory!!.roundWithBackgroundAndSmallInset(_factory!!.smallTextWithoutBackground(text)), false
        )
    }
}