package valkyrie.ide.project

import com.intellij.packageDependencies.DependenciesBuilder.DependencyProcessor
import com.intellij.packageDependencies.DependencyVisitorFactory
import com.intellij.packageDependencies.DependencyVisitorFactory.VisitorOptions
import com.intellij.psi.PsiBinaryFile
import com.intellij.psi.PsiDirectory
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiElementVisitor

class ValkyrieDependencyResolver : DependencyVisitorFactory() {
    override fun getVisitor(processor: DependencyProcessor, options: VisitorOptions): PsiElementVisitor {
        return Visitor(processor, options)
    }
}

private class Visitor(val processor: DependencyProcessor, val options: VisitorOptions) : PsiElementVisitor() {
    override fun visitElement(element: PsiElement) {
        super.visitElement(element)
    }

    override fun visitBinaryFile(file: PsiBinaryFile) {
        super.visitBinaryFile(file)
    }

    override fun visitDirectory(dir: PsiDirectory) {
        super.visitDirectory(dir)
    }
}