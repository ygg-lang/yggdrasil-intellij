// This is a generated file. Not intended for manual editing.
package ygg.intellij.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface YggTerm extends PsiElement {

  @NotNull
  YggAtom getAtom();

  @NotNull
  List<YggPrefix> getPrefixList();

  @NotNull
  List<YggSuffix> getSuffixList();

}