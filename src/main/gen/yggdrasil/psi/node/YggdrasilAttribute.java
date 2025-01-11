// This is a generated file. Not intended for manual editing.
package yggdrasil.psi.node;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import valkyrie.ide.highlight.NodeHighlighter;

public interface YggdrasilAttribute extends PsiElement {

    @NotNull
    YggdrasilIdentifier getIdentifier();

    @Nullable
    YggdrasilTuple getTuple();

    void highlight(@NotNull NodeHighlighter visitor);

}
