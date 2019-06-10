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

public class YggExpressionNode extends ASTWrapperPsiElement implements YggExpression {

  public YggExpressionNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull YggVisitor visitor) {
    visitor.visitExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YggVisitor) accept((YggVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public YggGrammarStatement getGrammarStatement() {
    return findChildByClass(YggGrammarStatement.class);
  }

  @Override
  @Nullable
  public YggIgnoreStatement getIgnoreStatement() {
    return findChildByClass(YggIgnoreStatement.class);
  }

  @Override
  @Nullable
  public YggImportStatement getImportStatement() {
    return findChildByClass(YggImportStatement.class);
  }

}
