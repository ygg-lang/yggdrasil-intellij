package valkyrie.ide.hint

//import nexus.language.psi_node.*
import com.intellij.codeInsight.hints.*
import com.intellij.openapi.editor.Editor
import com.intellij.psi.PsiFile
import com.intellij.ui.dsl.builder.panel
import valkyrie.ide.hint.TypeInlayProvider.InlayTypeSetting
import javax.swing.JComponent

@Suppress("UnstableApiUsage", "PropertyName")
class TypeInlayProvider : InlayHintsProvider<InlayTypeSetting> {
    data class InlayTypeSetting(
        var show_obvious_type: Boolean = false,
        var showForLoopType: Boolean = true,
        var showDefineParameterType: Boolean = true,
        var showDefineReturnType: Boolean = true,
        var showDefineEffectType: Boolean = true,
        var showClassFieldType: Boolean = true,
        var showBitFlagType: Boolean = true,
    )

    private val rootKey = "v.type.hints";

    override val name: String = yggdrasil.language.NexusBundle.message("inlay.type.group.name")
    override val group: InlayGroup = InlayGroup.TYPES_GROUP
    override val key: SettingsKey<InlayTypeSetting>
        get() {
            return SettingsKey(rootKey)
        }
    override val description: String?
        get() {
            return super.description
        }

    override fun createSettings(): InlayTypeSetting = InlayTypeSetting()

    /// 显示在
    /// Editor > Inlay Hints > Types
    override val previewText: String = """
        let number = 1;
        let string = "string";
        let boolean = true;
        let array = [1, 2, 3];
        """.trimIndent()


    /// 不知道干嘛的 显示在
    /// Editor > Inlay Hints > Types
    override fun createConfigurable(settings: InlayTypeSetting): ImmediateConfigurable {
        return object : ImmediateConfigurable {
            override val mainCheckboxText: String
                get() = super.mainCheckboxText
            override val cases: List<ImmediateConfigurable.Case>
                get() = listOf(
                    ImmediateConfigurable.Case(
                        "Obvious types",
                        "hints.type.obvious",
                        settings::show_obvious_type,
                        yggdrasil.language.NexusBundle.message("view.PropertiesGrouper")
                    ),
                    ImmediateConfigurable.Case(
                        "For loop types",
                        "hints.type.for",
                        settings::showForLoopType,
                        yggdrasil.language.NexusBundle.message("view.PropertiesGrouper")
                    ),
                    ImmediateConfigurable.Case(
                        "Define return types",
                        "hints.type.define",
                        settings::showDefineReturnType,
                        yggdrasil.language.NexusBundle.message("view.PropertiesGrouper")
                    ),
                    ImmediateConfigurable.Case(
                        "Bitflag types",
                        "hints.type.bitflag",
                        settings::showBitFlagType,
                        yggdrasil.language.NexusBundle.message("view.PropertiesGrouper")
                    ),
                )

            override fun reset() {
                super.reset()
            }

            override fun createComponent(listener: ChangeListener): JComponent {
                return panel {
                    row {
                        checkBox("Show obvious type").applyToComponent {
                            isSelected = settings.show_obvious_type
                            addActionListener {
                                settings.show_obvious_type = isSelected
                                listener.settingsChanged()
                            }
                        }
                    }
                }
            }
        }
    }

    override fun getCollectorFor(file: PsiFile, editor: Editor, settings: InlayTypeSetting, sink: InlayHintsSink): InlayHintsCollector {
        return TypeInlayHint(settings)
    }

    // todo: getCasePreview
    override fun getCaseDescription(case: ImmediateConfigurable.Case): String {
        //return ValkyrieBundle.message(case.id)
        return case.id
    }

    override fun getProperty(key: String): String {
        return "ValkyrieInlayProvider.getProperty"
    }
}


