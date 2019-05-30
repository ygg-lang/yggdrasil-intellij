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

public class YggExpressionImpl extends ASTWrapperPsiElement implements YggExpression {

  public YggExpressionImpl(@NotNull ASTNode node) {
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
  public YggAnnotation getAnnotation() {
    return findChildByClass(YggAnnotation.class);
  }

  @Override
  @Nullable
  public YggBackTop getBackTop() {
    return findChildByClass(YggBackTop.class);
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

  @Override
  @Nullable
  public YggInsertItem getInsertItem() {
    return findChildByClass(YggInsertItem.class);
  }

  @Override
  @Nullable
  public YggInsertPair getInsertPair() {
    return findChildByClass(YggInsertPair.class);
  }

  @Override
  @Nullable
  public YggScope getScope() {
    return findChildByClass(YggScope.class);
  }

}
