// This is a generated file. Not intended for manual editing.
package yggdrasil.psi.node;

import java.util.List;

import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;

import static yggdrasil.psi.YggdrasilTypes.*;

import yggdrasil.psi.mixin.MixinGrammar;

public class YggdrasilGrammarNode extends MixinGrammar implements YggdrasilGrammar {

    public YggdrasilGrammarNode(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull YggdrasilVisitor visitor) {
        visitor.visitGrammar(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof YggdrasilVisitor) accept((YggdrasilVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @NotNull
    public YggdrasilAnnotations getAnnotations() {
        return findNotNullChildByClass(YggdrasilAnnotations.class);
    }

    @Override
    @Nullable
    public YggdrasilGrammarBody getGrammarBody() {
        return findChildByClass(YggdrasilGrammarBody.class);
    }

    @Override
    @Nullable
    public YggdrasilIdentifier getIdentifier() {
        return findChildByClass(YggdrasilIdentifier.class);
    }

}
