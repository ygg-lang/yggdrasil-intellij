// This is a generated file. Not intended for manual editing.
package yggdrasil.psi.node;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface YggdrasilTokenItem extends PsiElement {

    @NotNull
    List<YggdrasilAttribute> getAttributeList();

    @NotNull
    YggdrasilExpression getExpression();

    @NotNull
    List<YggdrasilIdentifier> getIdentifierList();

}
