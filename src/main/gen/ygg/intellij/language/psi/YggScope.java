// This is a generated file. Not intended for manual editing.
package ygg.intellij.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface YggScope extends PsiElement {

  @NotNull
  List<YggRuleSymbol> getRuleSymbolList();

  @Nullable
  YggScopeMark getScopeMark();

  @NotNull
  List<YggStringInline> getStringInlineList();

}
