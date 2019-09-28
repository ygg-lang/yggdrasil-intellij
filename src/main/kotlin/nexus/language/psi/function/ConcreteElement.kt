package nexus.language.psi.function

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import com.intellij.openapi.util.Key
import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiElement
import com.intellij.psi.tree.IElementType
import com.intellij.psi.tree.TokenSet


open class ConcreteElement : ASTNode {
    protected final val _text: CharSequence
    protected final val _span: TextRange
    protected final val _parent: ASTNode? = null
    protected final val _children: MutableList<ASTNode> = mutableListOf()
    protected final val _token_type: IElementType

    constructor(text: CharSequence, range: TextRange, token: IElementType) {
        this._text = text
        this._span = range
        this._token_type = token
    }

    override fun <T : Any?> getUserData(key: Key<T>): T? {
        TODO("Not yet implemented")
    }

    override fun <T : Any?> putUserData(key: Key<T>, value: T?) {
        TODO("Not yet implemented")
    }

    override fun getElementType(): IElementType {
        TODO("Not yet implemented")
    }

    override fun getText(): String {
        return _text.substring(_span.startOffset, _span.startOffset)
    }

    override fun getChars(): CharSequence {
        return _text.subSequence(_span.startOffset, _span.startOffset)
    }

    override fun textContains(c: Char): Boolean {
        return _text.contains(c)
    }

    override fun getStartOffset(): Int {
        return _span.startOffset
    }

    override fun getTextLength(): Int {
        return _span.length
    }

    override fun getTextRange(): TextRange {
        return _span;
    }

    override fun getTreeParent(): ASTNode? {
        return null
    }

    override fun getFirstChildNode(): ASTNode? {
        return _children.firstOrNull()
    }

    override fun getLastChildNode(): ASTNode? {
        return _children.lastOrNull()
    }

    override fun getTreeNext(): ASTNode? {
        return null
    }

    override fun getTreePrev(): ASTNode? {
        return null
    }

    override fun getChildren(filter: TokenSet?): Array<ASTNode> {
        return _children.filter { filter?.contains(it.elementType) ?: true }.toTypedArray()
    }

    override fun addChild(child: ASTNode) {

    }

    override fun addChild(child: ASTNode, anchorBefore: ASTNode?) {

    }

    override fun addLeaf(leafType: IElementType, leafText: CharSequence, anchorBefore: ASTNode?) {

    }

    override fun removeChild(child: ASTNode) {
        _children.remove(child)
    }

    override fun removeRange(firstNodeToRemove: ASTNode, firstNodeToKeep: ASTNode?) {


    }

    override fun replaceChild(oldChild: ASTNode, newChild: ASTNode) {
        _children.replaceAll {
            if (it == oldChild) newChild else it
        }

    }

    override fun replaceAllChildrenToChildrenOf(anotherParent: ASTNode) {

    }

    override fun addChildren(firstChild: ASTNode, firstChildToNotAdd: ASTNode?, anchorBefore: ASTNode?) {

    }

    override fun clone(): Any {
        // deep copy
        return ConcreteElement(_text, _span, _token_type)
    }

    override fun copyElement(): ASTNode {
        return ConcreteElement(_text, _span, _token_type)
    }

    override fun findLeafElementAt(offset: Int): ASTNode? {
        return null
    }

    override fun <T : Any?> getCopyableUserData(key: Key<T>): T? {
        return null
    }

    override fun <T : Any?> putCopyableUserData(key: Key<T>, value: T?) {

    }

    override fun findChildByType(type: IElementType): ASTNode? {
        return null
    }

    override fun findChildByType(type: IElementType, anchor: ASTNode?): ASTNode? {
        return null
    }

    override fun findChildByType(typesSet: TokenSet): ASTNode? {
        return null
    }

    override fun findChildByType(typesSet: TokenSet, anchor: ASTNode?): ASTNode? {
        return null
    }

    override fun getPsi(): PsiElement {
        return ASTWrapperPsiElement(this)
    }

    override fun <T : PsiElement?> getPsi(clazz: Class<T>): T? {
        return null
    }
}