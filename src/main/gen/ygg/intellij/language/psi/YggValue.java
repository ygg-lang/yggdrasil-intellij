// This is a generated file. Not intended for manual editing.
package ygg.intellij.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface YggValue extends PsiElement {

  @Nullable
  YggAnnotation getAnnotation();

  @Nullable
  YggNumberSuffix getNumberSuffix();

  @Nullable
  YggRef getRef();

  @Nullable
  YggStringInline getStringInline();

  @Nullable
  YggStringMulti getStringMulti();

  @Nullable
  YggStringPrefix getStringPrefix();

  @Nullable
  YggTable getTable();

  @Nullable
  PsiElement getBoolean();

  @Nullable
  PsiElement getByte();

  @Nullable
  PsiElement getDecimal();

  @Nullable
  PsiElement getInteger();

  @Nullable
  PsiElement getSign();

}
