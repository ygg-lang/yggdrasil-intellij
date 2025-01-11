// This is a generated file. Not intended for manual editing.
package yggdrasil.psi.node;

import org.jetbrains.annotations.Nullable;

public interface YggdrasilAtomic extends YggdrasilExpression {

    @Nullable
    YggdrasilEscape getEscape();

    @Nullable
    YggdrasilFunctionCall getFunctionCall();

    @Nullable
    YggdrasilIdentifier getIdentifier();

    @Nullable
    YggdrasilNumber getNumber();

    @Nullable
    YggdrasilRegex getRegex();

    @Nullable
    YggdrasilString getString();

}
