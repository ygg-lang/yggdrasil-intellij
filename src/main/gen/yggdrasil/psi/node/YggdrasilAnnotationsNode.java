// This is a generated file. Not intended for manual editing.
package yggdrasil.psi.node;

import java.util.List;

import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;

import static yggdrasil.psi.YggdrasilTypes.*;

import yggdrasil.psi.YggdrasilElement;

public class YggdrasilAnnotationsNode extends YggdrasilElement implements YggdrasilAnnotations {

    public YggdrasilAnnotationsNode(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull YggdrasilVisitor visitor) {
        visitor.visitAnnotations(this);
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
    public List<YggdrasilModifier> getModifierList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, YggdrasilModifier.class);
    }

}
