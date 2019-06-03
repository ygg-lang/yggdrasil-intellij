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

public class YggAnnotationNode extends ASTWrapperPsiElement implements YggAnnotation {

  public YggAnnotationNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull YggVisitor visitor) {
    visitor.visitAnnotation(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YggVisitor) accept((YggVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public YggAnnotationMark getAnnotationMark() {
    return findNotNullChildByClass(YggAnnotationMark.class);
  }

  @Override
  @NotNull
  public List<YggPair> getPairList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YggPair.class);
  }

  @Override
  @NotNull
  public List<YggValue> getValueList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YggValue.class);
  }

}
