// This is a generated file. Not intended for manual editing.
package yggdrasil.psi.node;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.codeInsight.lookup.LookupElement;

public interface YggdrasilTokenItem extends PsiElement {

  @NotNull
  List<YggdrasilAttribute> getAttributeList();

  @NotNull
  YggdrasilExpression getExpression();

  @NotNull
  List<YggdrasilIdentifier> getIdentifierList();

  void createLookup(@NotNull List<LookupElement> completions);

}
