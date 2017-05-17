package com.ardetrick.gradle.basic

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class BasicTask extends DefaultTask {

    @TaskAction
    def taskAction() {
        System.out.println(project.buildSrcPluginExtension.message)
    }

}
