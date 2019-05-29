package com.testplugin

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class GreetingTask extends DefaultTask {
    String greeting = 'hello from com.testplugin.GreetingTask'

    @TaskAction
    def greet() {
        println greeting
    }
}