// This is a generated file. Not intended for manual editing.
package com.github.voml.voml_intellij.language.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.github.voml.voml_intellij.language.psi.VomlTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.github.voml.voml_intellij.language.psi.*;

public class VomlIncludeStatementImpl extends ASTWrapperPsiElement implements VomlIncludeStatement {

  public VomlIncludeStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VomlVisitor visitor) {
    visitor.visitIncludeStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VomlVisitor) accept((VomlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public VomlKeySymbol getKeySymbol() {
    return findChildByClass(VomlKeySymbol.class);
  }

  @Override
  @Nullable
  public VomlPaired getPaired() {
    return findChildByClass(VomlPaired.class);
  }

  @Override
  @NotNull
  public VomlStringInline getStringInline() {
    return findNotNullChildByClass(VomlStringInline.class);
  }

  @Override
  @Nullable
  public VomlStringPrefix getStringPrefix() {
    return findChildByClass(VomlStringPrefix.class);
  }

}
