// This is a generated file. Not intended for manual editing.
package yggdrasil.psi.node;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.codeInsight.lookup.LookupElement;

public interface YggdrasilDefineFunction extends PsiElement {

    @NotNull
    YggdrasilAnnotations getAnnotations();

    @Nullable
    YggdrasilFunctionBlock getFunctionBlock();

    @Nullable
    YggdrasilFunctionParameter getFunctionParameter();

    @Nullable
    YggdrasilIdentifier getIdentifier();

    void createLookup(@NotNull List<LookupElement> completions);

}
