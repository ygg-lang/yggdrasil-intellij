// This is a generated file. Not intended for manual editing.
package yggdrasil.psi.node;

import java.util.List;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface YggdrasilTerm extends YggdrasilExpression {

    @NotNull
    YggdrasilExpression getExpression();

    @NotNull
    List<YggdrasilPrefix> getPrefixList();

    @NotNull
    List<YggdrasilSuffix> getSuffixList();

}
