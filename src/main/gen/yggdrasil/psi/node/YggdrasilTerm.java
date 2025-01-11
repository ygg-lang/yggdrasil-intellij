// This is a generated file. Not intended for manual editing.
package yggdrasil.psi.node;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface YggdrasilTerm extends YggdrasilExpression {

    @NotNull
    YggdrasilExpression getExpression();

    @NotNull
    List<YggdrasilPrefix> getPrefixList();

    @NotNull
    List<YggdrasilSuffix> getSuffixList();

}
