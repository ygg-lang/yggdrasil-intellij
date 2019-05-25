package com.github.oovm.vomlintellij.services

import com.intellij.openapi.project.Project
import com.github.oovm.vomlintellij.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
