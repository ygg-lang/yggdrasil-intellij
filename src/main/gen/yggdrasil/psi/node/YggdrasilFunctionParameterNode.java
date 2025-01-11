// This is a generated file. Not intended for manual editing.
package yggdrasil.psi.node;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;
import yggdrasil.psi.YggdrasilElement;

import java.util.List;

public class YggdrasilFunctionParameterNode extends YggdrasilElement implements YggdrasilFunctionParameter {

    public YggdrasilFunctionParameterNode(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull YggdrasilVisitor visitor) {
        visitor.visitFunctionParameter(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof YggdrasilVisitor) accept((YggdrasilVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @NotNull
    public List<YggdrasilParameter> getParameterList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, YggdrasilParameter.class);
    }

}
