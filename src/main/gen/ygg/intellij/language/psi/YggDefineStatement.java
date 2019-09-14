// This is a generated file. Not intended for manual editing.
package ygg.intellij.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface YggDefineStatement extends PsiElement {

  @Nullable
  YggDefineParameters getDefineParameters();

  @NotNull
  YggIdentifier getIdentifier();

  @NotNull
  YggModifiers getModifiers();

  @Nullable
  YggRuleBody getRuleBody();

  @Nullable
  YggRuleType getRuleType();

}
