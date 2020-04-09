// This is a generated file. Not intended for manual editing.
package yggdrasil.psi.node;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static yggdrasil.psi.YggdrasilTypes.*;
import yggdrasil.psi.mixin.MixinDefineFunction;
import com.intellij.codeInsight.lookup.LookupElement;

public class YggdrasilDefineFunctionNode extends MixinDefineFunction implements YggdrasilDefineFunction {

  public YggdrasilDefineFunctionNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull YggdrasilVisitor visitor) {
    visitor.visitDefineFunction(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YggdrasilVisitor) accept((YggdrasilVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public YggdrasilAnnotations getAnnotations() {
    return findNotNullChildByClass(YggdrasilAnnotations.class);
  }

  @Override
  @Nullable
  public YggdrasilFunctionBlock getFunctionBlock() {
    return findChildByClass(YggdrasilFunctionBlock.class);
  }

  @Override
  @Nullable
  public YggdrasilFunctionParameter getFunctionParameter() {
    return findChildByClass(YggdrasilFunctionParameter.class);
  }

  @Override
  @Nullable
  public YggdrasilIdentifier getIdentifier() {
    return findChildByClass(YggdrasilIdentifier.class);
  }

}
