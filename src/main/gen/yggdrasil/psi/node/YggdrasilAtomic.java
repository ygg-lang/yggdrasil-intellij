// This is a generated file. Not intended for manual editing.
package yggdrasil.psi.node;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface YggdrasilAtomic extends YggdrasilExpression {

  @Nullable
  YggdrasilEscape getEscape();

  @Nullable
  YggdrasilFunctionCall getFunctionCall();

  @Nullable
  YggdrasilIdentifierFree getIdentifierFree();

  @Nullable
  YggdrasilRegex getRegex();

  @Nullable
  YggdrasilString getString();

}
