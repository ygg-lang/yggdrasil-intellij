// This is a generated file. Not intended for manual editing.
package yggdrasil.psi.node;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static yggdrasil.psi.YggdrasilTypes.*;
import yggdrasil.psi.mixin.MixinGroupItem;

public class YggdrasilGroupItemNode extends MixinGroupItem implements YggdrasilGroupItem {

    public YggdrasilGroupItemNode(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull YggdrasilVisitor visitor) {
        visitor.visitGroupItem(this);
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
