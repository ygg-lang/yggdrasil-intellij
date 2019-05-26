// This is a generated file. Not intended for manual editing.
package com.github.voml.voml_intellij.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface VomlValue extends PsiElement {

  @Nullable
  VomlAnnotation getAnnotation();

  @Nullable
  VomlNumberSuffix getNumberSuffix();

  @Nullable
  VomlRef getRef();

  @Nullable
  VomlStringInline getStringInline();

  @Nullable
  VomlStringMulti getStringMulti();

  @Nullable
  VomlStringPrefix getStringPrefix();

  @Nullable
  VomlTable getTable();

  @Nullable
  PsiElement getBoolean();

  @Nullable
  PsiElement getByte();

  @Nullable
  PsiElement getDecimal();

  @Nullable
  PsiElement getInteger();

  @Nullable
  PsiElement getSign();

}
