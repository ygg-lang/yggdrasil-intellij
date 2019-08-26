// This is a generated file. Not intended for manual editing.
package ygg.intellij.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface YggRuleStatement extends PsiElement {

  @NotNull
  YggDefine getDefine();

  @NotNull
  YggExpr getExpr();

  @NotNull
  YggIdentifier getIdentifier();

  @NotNull
  YggModifiers getModifiers();

  @Nullable
  YggRuleArgument getRuleArgument();

  @Nullable
  YggRuleType getRuleType();

}
