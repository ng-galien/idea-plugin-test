package com.github.nggalien.ideaplugintest.services

import com.intellij.openapi.project.Project
import com.github.nggalien.ideaplugintest.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
