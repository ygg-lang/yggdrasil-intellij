// This is a generated file. Not intended for manual editing.
package com.github.voml.voml_intellij.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface VomlSymbolPath extends PsiElement {

  @NotNull
  List<VomlKeySymbol> getKeySymbolList();

  @NotNull
  List<VomlStringInline> getStringInlineList();

}
