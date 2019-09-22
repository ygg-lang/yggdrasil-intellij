// This is a generated file. Not intended for manual editing.
package ygg.intellij.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface YggRuleAtom extends PsiElement {

  @Nullable
  YggBranchMark getBranchMark();

  @Nullable
  YggCharset getCharset();

  @Nullable
  YggFieldMark getFieldMark();

  @Nullable
  YggFunctionCall getFunctionCall();

  @Nullable
  YggNamepath getNamepath();

  @Nullable
  YggNumberSuffix getNumberSuffix();

  @Nullable
  YggRuleExpr getRuleExpr();

  @Nullable
  YggStringLiteral getStringLiteral();

}
