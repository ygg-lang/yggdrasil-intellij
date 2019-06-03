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

public class YggScopeNode extends ASTWrapperPsiElement implements YggScope {

  public YggScopeNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull YggVisitor visitor) {
    visitor.visitScope(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YggVisitor) accept((YggVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<YggRuleSymbol> getRuleSymbolList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YggRuleSymbol.class);
  }

  @Override
  @Nullable
  public YggScopeMark getScopeMark() {
    return findChildByClass(YggScopeMark.class);
  }

  @Override
  @NotNull
  public List<YggStringInline> getStringInlineList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YggStringInline.class);
  }

}
