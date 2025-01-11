// This is a generated file. Not intended for manual editing.
package yggdrasil.psi.node;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class YggdrasilTermNode extends YggdrasilExpressionNode implements YggdrasilTerm {

    public YggdrasilTermNode(@NotNull ASTNode node) {
        super(node);
    }

    @Override
    public void accept(@NotNull YggdrasilVisitor visitor) {
        visitor.visitTerm(this);
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
    @NotNull
    public List<YggdrasilPrefix> getPrefixList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, YggdrasilPrefix.class);
    }

    @Override
    @NotNull
    public List<YggdrasilSuffix> getSuffixList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, YggdrasilSuffix.class);
    }

}
