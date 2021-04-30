package com.github.xiagaizhi.mvp.services

import com.github.xiagaizhi.mvp.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
