// This is a generated file. Not intended for manual editing.
package ygg.intellij.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface YggRuleExpr extends PsiElement {

  @NotNull
  List<YggInfix> getInfixList();

  @NotNull
  List<YggRuleTerm> getRuleTermList();

}
