// This is a generated file. Not intended for manual editing.
package com.github.ygg_lang.ygg_intellij.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface YggSymbolPath extends PsiElement {

  @NotNull
  List<YggKeySymbol> getKeySymbolList();

  @NotNull
  List<YggStringInline> getStringInlineList();

}
