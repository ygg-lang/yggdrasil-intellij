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

public class YggRuleAtomNode extends ASTWrapperPsiElement implements YggRuleAtom {

  public YggRuleAtomNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull YggVisitor visitor) {
    visitor.visitRuleAtom(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YggVisitor) accept((YggVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public YggBranchMark getBranchMark() {
    return findChildByClass(YggBranchMark.class);
  }

  @Override
  @Nullable
  public YggCharset getCharset() {
    return findChildByClass(YggCharset.class);
  }

  @Override
  @Nullable
  public YggFieldMark getFieldMark() {
    return findChildByClass(YggFieldMark.class);
  }

  @Override
  @Nullable
  public YggFunctionCall getFunctionCall() {
    return findChildByClass(YggFunctionCall.class);
  }

  @Override
  @Nullable
  public YggNamepath getNamepath() {
    return findChildByClass(YggNamepath.class);
  }

  @Override
  @Nullable
  public YggNumberSuffix getNumberSuffix() {
    return findChildByClass(YggNumberSuffix.class);
  }

  @Override
  @Nullable
  public YggRuleExpr getRuleExpr() {
    return findChildByClass(YggRuleExpr.class);
  }

  @Override
  @Nullable
  public YggStringLiteral getStringLiteral() {
    return findChildByClass(YggStringLiteral.class);
  }

}
