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

public class YggRuleTermNode extends ASTWrapperPsiElement implements YggRuleTerm {

  public YggRuleTermNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull YggVisitor visitor) {
    visitor.visitRuleTerm(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YggVisitor) accept((YggVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<YggPrefix> getPrefixList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YggPrefix.class);
  }

  @Override
  @NotNull
  public YggRuleAtom getRuleAtom() {
    return findNotNullChildByClass(YggRuleAtom.class);
  }

  @Override
  @NotNull
  public List<YggSuffix> getSuffixList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YggSuffix.class);
  }

}
