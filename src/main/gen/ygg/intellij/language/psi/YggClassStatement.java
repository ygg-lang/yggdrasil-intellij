// This is a generated file. Not intended for manual editing.
package ygg.intellij.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface YggClassStatement extends PsiElement {

  @NotNull
  YggIdentifier getIdentifier();

  @NotNull
  YggModifiers getModifiers();

  @NotNull
  YggRuleBody getRuleBody();

  @Nullable
  YggRuleType getRuleType();

}
