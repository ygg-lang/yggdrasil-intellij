// This is a generated file. Not intended for manual editing.
package ygg.intellij.language.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static ygg.intellij.language.psi.YggTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.github.ygg_lang.ygg_intellij.language.psi.*;
import ygg.intellij.language.psi.YggKeySymbol;
import ygg.intellij.language.psi.YggStringInline;
import ygg.intellij.language.psi.YggSymbolPath;
import ygg.intellij.language.psi.YggVisitor;

public class YggSymbolPathImpl extends ASTWrapperPsiElement implements YggSymbolPath {

  public YggSymbolPathImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull YggVisitor visitor) {
    visitor.visitSymbolPath(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YggVisitor) accept((YggVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<YggKeySymbol> getKeySymbolList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YggKeySymbol.class);
  }

  @Override
  @NotNull
  public List<YggStringInline> getStringInlineList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YggStringInline.class);
  }

}
