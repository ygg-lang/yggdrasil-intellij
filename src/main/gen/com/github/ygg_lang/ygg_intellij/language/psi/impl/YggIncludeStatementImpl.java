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

public class YggIncludeStatementImpl extends ASTWrapperPsiElement implements YggIncludeStatement {

  public YggIncludeStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull YggVisitor visitor) {
    visitor.visitIncludeStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YggVisitor) accept((YggVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public YggKeySymbol getKeySymbol() {
    return findChildByClass(YggKeySymbol.class);
  }

  @Override
  @Nullable
  public YggPaired getPaired() {
    return findChildByClass(YggPaired.class);
  }

  @Override
  @NotNull
  public YggStringInline getStringInline() {
    return findNotNullChildByClass(YggStringInline.class);
  }

  @Override
  @Nullable
  public YggStringPrefix getStringPrefix() {
    return findChildByClass(YggStringPrefix.class);
  }

}
