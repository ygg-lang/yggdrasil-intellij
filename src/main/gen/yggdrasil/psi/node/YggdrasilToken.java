// This is a generated file. Not intended for manual editing.
package yggdrasil.psi.node;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface YggdrasilToken extends PsiElement {

  @NotNull
  YggdrasilAnnotations getAnnotations();

  @Nullable
  YggdrasilIdentifierFree getIdentifierFree();

  @Nullable
  YggdrasilTokenBody getTokenBody();

  //WARNING: createLookup(...) is skipped
  //matching createLookup(YggdrasilToken, ...)
  //methods are not found in YggdrasilPsiExtension

  @NotNull
  List<YggdrasilTokenItemNode> getTokenList();

}
