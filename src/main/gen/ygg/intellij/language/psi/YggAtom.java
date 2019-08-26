// This is a generated file. Not intended for manual editing.
package ygg.intellij.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface YggAtom extends PsiElement {

  @Nullable
  YggBranchMark getBranchMark();

  @Nullable
  YggExpr getExpr();

  @Nullable
  YggFieldMark getFieldMark();

  @Nullable
  YggFunctionCall getFunctionCall();

  @Nullable
  YggValue getValue();

}
