// This is a generated file. Not intended for manual editing.
package yggdrasil.psi.node;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;
import yggdrasil.psi.YggdrasilElement;

import java.util.List;

public class YggdrasilTokenItemNode extends YggdrasilElement implements YggdrasilTokenItem {

    public YggdrasilTokenItemNode(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull YggdrasilVisitor visitor) {
        visitor.visitTokenItem(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof YggdrasilVisitor) accept((YggdrasilVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @NotNull
    public List<YggdrasilAttribute> getAttributeList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, YggdrasilAttribute.class);
    }

    @Override
    @NotNull
    public YggdrasilExpression getExpression() {
        return findNotNullChildByClass(YggdrasilExpression.class);
    }

    @Override
    @NotNull
    public List<YggdrasilIdentifier> getIdentifierList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, YggdrasilIdentifier.class);
    }

}
