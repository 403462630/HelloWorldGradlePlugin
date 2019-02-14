package fc.gradle.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class HelloWorldPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        println("======hello world!!======")
        // Add the 'greeting' extension object
        def extension = project.extensions.create('helloConfig', HelloWorldExtension)
        // Add a task that uses configuration from the extension object
        project.task('hello') {
            doLast {
                println("======title: ${extension.title}======")
                println("======desc: ${extension.desc}======")
            }
        }
    }
}
