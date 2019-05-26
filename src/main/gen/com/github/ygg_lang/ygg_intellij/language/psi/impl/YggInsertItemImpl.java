// This is a generated file. Not intended for manual editing.
package com.github.ygg_lang.ygg_intellij.language.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.github.ygg_lang.ygg_intellij.language.psi.YggTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.github.ygg_lang.ygg_intellij.language.psi.*;

public class YggInsertItemImpl extends ASTWrapperPsiElement implements YggInsertItem {

  public YggInsertItemImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull YggVisitor visitor) {
    visitor.visitInsertItem(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YggVisitor) accept((YggVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public YggInsertStar getInsertStar() {
    return findNotNullChildByClass(YggInsertStar.class);
  }

  @Override
  @NotNull
  public YggValue getValue() {
    return findNotNullChildByClass(YggValue.class);
  }

}
