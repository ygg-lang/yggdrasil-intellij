// This is a generated file. Not intended for manual editing.
package yggdrasil.psi.node;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface YggdrasilFunctionDefine extends PsiElement {

    @NotNull
    YggdrasilAnnotations getAnnotations();

    @Nullable
    YggdrasilFunctionBlock getFunctionBlock();

    @Nullable
    YggdrasilFunctionParameter getFunctionParameter();

    @Nullable
    YggdrasilIdentifier getIdentifier();

}
