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

public class VomlValueImpl extends ASTWrapperPsiElement implements VomlValue {

  public VomlValueImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VomlVisitor visitor) {
    visitor.visitValue(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VomlVisitor) accept((VomlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public VomlAnnotation getAnnotation() {
    return findChildByClass(VomlAnnotation.class);
  }

  @Override
  @Nullable
  public VomlNumberSuffix getNumberSuffix() {
    return findChildByClass(VomlNumberSuffix.class);
  }

  @Override
  @Nullable
  public VomlRef getRef() {
    return findChildByClass(VomlRef.class);
  }

  @Override
  @Nullable
  public VomlStringInline getStringInline() {
    return findChildByClass(VomlStringInline.class);
  }

  @Override
  @Nullable
  public VomlStringMulti getStringMulti() {
    return findChildByClass(VomlStringMulti.class);
  }

  @Override
  @Nullable
  public VomlStringPrefix getStringPrefix() {
    return findChildByClass(VomlStringPrefix.class);
  }

  @Override
  @Nullable
  public VomlTable getTable() {
    return findChildByClass(VomlTable.class);
  }

  @Override
  @Nullable
  public PsiElement getBoolean() {
    return findChildByType(BOOLEAN);
  }

  @Override
  @Nullable
  public PsiElement getByte() {
    return findChildByType(BYTE);
  }

  @Override
  @Nullable
  public PsiElement getDecimal() {
    return findChildByType(DECIMAL);
  }

  @Override
  @Nullable
  public PsiElement getInteger() {
    return findChildByType(INTEGER);
  }

  @Override
  @Nullable
  public PsiElement getSign() {
    return findChildByType(SIGN);
  }

}
