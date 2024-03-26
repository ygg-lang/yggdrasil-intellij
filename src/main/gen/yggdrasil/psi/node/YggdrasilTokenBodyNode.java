// This is a generated file. Not intended for manual editing.
package yggdrasil.psi.node;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;
import yggdrasil.psi.YggdrasilElement;

import java.util.List;

public class YggdrasilTokenBodyNode extends YggdrasilElement implements YggdrasilTokenBody {

    public YggdrasilTokenBodyNode(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull YggdrasilVisitor visitor) {
        visitor.visitTokenBody(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof YggdrasilVisitor) accept((YggdrasilVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @NotNull
    public List<YggdrasilTokenTerm> getTokenTermList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, YggdrasilTokenTerm.class);
    }

}