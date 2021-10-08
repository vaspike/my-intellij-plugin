package com.github.vaspike.myintellijplugin.services

import com.intellij.openapi.project.Project
import com.github.vaspike.myintellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
