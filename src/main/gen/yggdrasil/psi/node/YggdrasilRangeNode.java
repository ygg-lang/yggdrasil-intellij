// This is a generated file. Not intended for manual editing.
package yggdrasil.psi.node;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yggdrasil.psi.YggdrasilElement;

public class YggdrasilRangeNode extends YggdrasilElement implements YggdrasilRange {

    public YggdrasilRangeNode(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull YggdrasilVisitor visitor) {
        visitor.visitRange(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof YggdrasilVisitor) accept((YggdrasilVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @Nullable
    public YggdrasilRangeLower getRangeLower() {
        return findChildByClass(YggdrasilRangeLower.class);
    }

    @Override
    @Nullable
    public YggdrasilRangeUpper getRangeUpper() {
        return findChildByClass(YggdrasilRangeUpper.class);
    }

}
