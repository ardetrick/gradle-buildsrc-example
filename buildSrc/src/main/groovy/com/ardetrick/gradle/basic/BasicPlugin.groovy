package com.ardetrick.gradle.basic

import org.gradle.api.Plugin
import org.gradle.api.Project

class BasicPlugin implements Plugin<Project> {

    void apply(Project project) {
        project.extensions.add("basic", BasicPluginExtension)

        project.task("basicTask", type: BasicTask) {
            group = "Custom Plugins"
            description = "Prints a message."
        }

    }
}
