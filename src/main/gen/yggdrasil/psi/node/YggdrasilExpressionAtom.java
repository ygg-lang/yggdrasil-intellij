// This is a generated file. Not intended for manual editing.
package yggdrasil.psi.node;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface YggdrasilExpressionAtom extends YggdrasilExpression {

  @Nullable
  YggdrasilCategory getCategory();

  @Nullable
  YggdrasilIdentifier getIdentifier();

  @Nullable
  YggdrasilRange getRange();

  @Nullable
  YggdrasilRegex getRegex();

}