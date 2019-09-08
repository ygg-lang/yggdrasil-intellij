// This is a generated file. Not intended for manual editing.
package ygg.intellij.language.psi_node;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static ygg.intellij.language.psi.YggTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import ygg.intellij.language.psi.*;

public class YggExprNode extends ASTWrapperPsiElement implements YggExpr {

  public YggExprNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull YggVisitor visitor) {
    visitor.visitExpr(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YggVisitor) accept((YggVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<YggInfix> getInfixList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YggInfix.class);
  }

  @Override
  @NotNull
  public YggRuleTerm getRuleTerm() {
    return findNotNullChildByClass(YggRuleTerm.class);
  }

  @Override
  @NotNull
  public List<YggTerm> getTermList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YggTerm.class);
  }

}
