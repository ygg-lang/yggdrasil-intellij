// This is a generated file. Not intended for manual editing.
package ygg.intellij.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface YggRuleTerm extends PsiElement {

  @NotNull
  List<YggPrefix> getPrefixList();

  @NotNull
  List<YggRange> getRangeList();

  @NotNull
  YggRuleAtom getRuleAtom();

  @NotNull
  List<YggSuffix> getSuffixList();

}