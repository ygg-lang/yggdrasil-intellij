// This is a generated file. Not intended for manual editing.
package yggdrasil.psi.node;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static yggdrasil.psi.YggdrasilTypes.*;

public class YggdrasilAtomicNode extends YggdrasilExpressionNode implements YggdrasilAtomic {

  public YggdrasilAtomicNode(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull YggdrasilVisitor visitor) {
    visitor.visitAtomic(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YggdrasilVisitor) accept((YggdrasilVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public YggdrasilCategory getCategory() {
    return findChildByClass(YggdrasilCategory.class);
  }

  @Override
  @Nullable
  public YggdrasilIdentifier getIdentifier() {
    return findChildByClass(YggdrasilIdentifier.class);
  }

  @Override
  @Nullable
  public YggdrasilRegex getRegex() {
    return findChildByClass(YggdrasilRegex.class);
  }

  @Override
  @Nullable
  public YggdrasilString getString() {
    return findChildByClass(YggdrasilString.class);
  }

}
