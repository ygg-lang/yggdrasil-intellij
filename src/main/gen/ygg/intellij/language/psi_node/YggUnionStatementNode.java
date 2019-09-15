// This is a generated file. Not intended for manual editing.
package ygg.intellij.language.psi_node;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static ygg.intellij.language.psi.YggTypes.*;
import ygg.intellij.language.mixin.MixinUnionStatement;
import ygg.intellij.language.psi.*;

public class YggUnionStatementNode extends MixinUnionStatement implements YggUnionStatement {

  public YggUnionStatementNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull YggVisitor visitor) {
    visitor.visitUnionStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YggVisitor) accept((YggVisitor)visitor);
    else super.accept(visitor);
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
