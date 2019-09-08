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

public class YggAtomNode extends ASTWrapperPsiElement implements YggAtom {

  public YggAtomNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull YggVisitor visitor) {
    visitor.visitAtom(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YggVisitor) accept((YggVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public YggExpr getExpr() {
    return findChildByClass(YggExpr.class);
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
  public YggValue getValue() {
    return findChildByClass(YggValue.class);
  }

}
