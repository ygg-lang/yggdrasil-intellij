// This is a generated file. Not intended for manual editing.
package yggdrasil.psi.node;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface YggdrasilAtomic extends YggdrasilExpression {

  @Nullable
  YggdrasilCategory getCategory();

  @Nullable
  YggdrasilFunctionCall getFunctionCall();

  @Nullable
  YggdrasilIdentifier getIdentifier();

  @Nullable
  YggdrasilRegex getRegex();

  @Nullable
  YggdrasilString getString();

}
