// This is a generated file. Not intended for manual editing.
package yggdrasil.psi.node;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static yggdrasil.psi.YggdrasilTypes.*;

public class YggdrasilExpressionHardNode extends YggdrasilExpressionNode implements YggdrasilExpressionHard {

    public YggdrasilExpressionHardNode(@NotNull ASTNode node) {
        super(node);
    }

    @Override
    public void accept(@NotNull YggdrasilVisitor visitor) {
        visitor.visitExpressionHard(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof YggdrasilVisitor) accept((YggdrasilVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @NotNull
    public List<YggdrasilExpression> getExpressionList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, YggdrasilExpression.class);
    }

}
