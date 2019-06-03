// This is a generated file. Not intended for manual editing.
package ygg.intellij.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface YggTable extends PsiElement {

  @NotNull
  List<YggPair> getPairList();

  @Nullable
  YggTypeHint getTypeHint();

  @NotNull
  List<YggValue> getValueList();

}
