// This is a generated file. Not intended for manual editing.
package yggdrasil.psi.node;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.codeInsight.lookup.LookupElement;
import valkyrie.ide.highlight.NodeHighlighter;

public interface YggdrasilGroupItem extends PsiElement {

  @NotNull
  List<YggdrasilAttribute> getAttributeList();

  @NotNull
  YggdrasilExpression getExpression();

  @NotNull
  List<YggdrasilIdentifier> getIdentifierList();

  void highlight(@NotNull NodeHighlighter highlighter);

  void createLookup(@NotNull List<LookupElement> completions);

}
