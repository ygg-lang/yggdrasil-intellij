// This is a generated file. Not intended for manual editing.
package ygg.intellij.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface YggAnnotation extends PsiElement {

  @NotNull
  YggAnnotationMark getAnnotationMark();

  @NotNull
  List<YggPair> getPairList();

  @NotNull
  List<YggValue> getValueList();

}
