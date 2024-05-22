// This is a generated file. Not intended for manual editing.
package yggdrasil.psi.node;

import java.util.List;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

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
