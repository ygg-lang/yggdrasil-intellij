// This is a generated file. Not intended for manual editing.
package com.github.ygg_lang.ygg_intellij.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface YggExpression extends PsiElement {

  @Nullable
  YggAnnotation getAnnotation();

  @Nullable
  YggBackTop getBackTop();

  @Nullable
  YggIgnoreStatement getIgnoreStatement();

  @Nullable
  YggImportStatement getImportStatement();

  @Nullable
  YggInheritStatement getInheritStatement();

  @Nullable
  YggInsertItem getInsertItem();

  @Nullable
  YggInsertPair getInsertPair();

  @Nullable
  YggScope getScope();

}
