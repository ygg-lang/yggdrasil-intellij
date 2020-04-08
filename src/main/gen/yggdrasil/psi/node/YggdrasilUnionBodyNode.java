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

public class YggdrasilUnionBodyNode extends YggdrasilElement implements YggdrasilUnionBody {

  public YggdrasilUnionBodyNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull YggdrasilVisitor visitor) {
    visitor.visitUnionBody(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YggdrasilVisitor) accept((YggdrasilVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<YggdrasilUnionVariant> getUnionVariantList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YggdrasilUnionVariant.class);
  }

}
