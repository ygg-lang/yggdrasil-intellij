// This is a generated file. Not intended for manual editing.
package yggdrasil.psi.node;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yggdrasil.psi.YggdrasilElement;

public class YggdrasilUnionTermNode extends YggdrasilElement implements YggdrasilUnionTerm {

    public YggdrasilUnionTermNode(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull YggdrasilVisitor visitor) {
        visitor.visitUnionTerm(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof YggdrasilVisitor) accept((YggdrasilVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @NotNull
    public YggdrasilExpression getExpression() {
        return findNotNullChildByClass(YggdrasilExpression.class);
    }

    @Override
    @Nullable
    public YggdrasilTagBranch getTagBranch() {
        return findChildByClass(YggdrasilTagBranch.class);
    }

}
