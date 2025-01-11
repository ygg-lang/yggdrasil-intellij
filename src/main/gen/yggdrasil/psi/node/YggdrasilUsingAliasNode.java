// This is a generated file. Not intended for manual editing.
package yggdrasil.psi.node;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import yggdrasil.psi.YggdrasilElement;

public class YggdrasilUsingAliasNode extends YggdrasilElement implements YggdrasilUsingAlias {

    public YggdrasilUsingAliasNode(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull YggdrasilVisitor visitor) {
        visitor.visitUsingAlias(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof YggdrasilVisitor) accept((YggdrasilVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @NotNull
    public YggdrasilIdentifier getIdentifier() {
        return findNotNullChildByClass(YggdrasilIdentifier.class);
    }

    @Override
    @NotNull
    public YggdrasilKey getKey() {
        return findNotNullChildByClass(YggdrasilKey.class);
    }

}
