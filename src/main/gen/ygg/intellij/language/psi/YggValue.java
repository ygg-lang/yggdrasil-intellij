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
  YggString getString();

  @Nullable
  YggTable getTable();

}
