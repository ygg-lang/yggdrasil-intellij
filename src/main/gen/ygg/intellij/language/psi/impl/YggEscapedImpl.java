// This is a generated file. Not intended for manual editing.
package ygg.intellij.language.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static ygg.intellij.language.psi.YggTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.github.ygg_lang.ygg_intellij.language.psi.*;
import ygg.intellij.language.psi.YggEscaped;
import ygg.intellij.language.psi.YggTypes;
import ygg.intellij.language.psi.YggVisitor;

public class YggEscapedImpl extends ASTWrapperPsiElement implements YggEscaped {

  public YggEscapedImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull YggVisitor visitor) {
    visitor.visitEscaped(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YggVisitor) accept((YggVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PsiElement getNonEscape() {
    return findChildByType(YggTypes.NON_ESCAPE);
  }

}
