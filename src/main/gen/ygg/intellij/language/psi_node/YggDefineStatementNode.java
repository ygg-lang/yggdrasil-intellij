// This is a generated file. Not intended for manual editing.
package ygg.intellij.language.psi_node;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static ygg.intellij.language.psi.YggTypes.*;
import ygg.intellij.language.mixin.MixinDefineStatement;
import ygg.intellij.language.psi.*;

public class YggDefineStatementNode extends MixinDefineStatement implements YggDefineStatement {

  public YggDefineStatementNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull YggVisitor visitor) {
    visitor.visitDefineStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YggVisitor) accept((YggVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public YggDefineParameters getDefineParameters() {
    return findChildByClass(YggDefineParameters.class);
  }

  @Override
  @NotNull
  public YggIdentifier getIdentifier() {
    return findNotNullChildByClass(YggIdentifier.class);
  }

  @Override
  @NotNull
  public YggModifiers getModifiers() {
    return findNotNullChildByClass(YggModifiers.class);
  }

  @Override
  @Nullable
  public YggRuleBody getRuleBody() {
    return findChildByClass(YggRuleBody.class);
  }

  @Override
  @Nullable
  public YggRuleType getRuleType() {
    return findChildByClass(YggRuleType.class);
  }

}
