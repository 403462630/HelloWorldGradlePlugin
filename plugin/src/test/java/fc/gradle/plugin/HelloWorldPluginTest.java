package fc.gradle.plugin;

import org.gradle.api.Project;
import org.gradle.testfixtures.ProjectBuilder;
import org.junit.Test;

/**
 * 注意： 如果运行报 class not found error，则需要设置output（目测是ide bug）
 * output path：java/main -> groovy/main
 * test output path 不变
 */
public class HelloWorldPluginTest {
    @Test
    public void helloworldTest() {
        Project project = ProjectBuilder.builder().build();
        project.getPluginManager().apply("helloworld");
        HelloWorldExtension extension = (HelloWorldExtension) project.getExtensions().getByName("helloConfig");
        extension.setTitle("hello world title");
        extension.setDesc("hello world desc");
        project.getTasks().getByPath("hello");
    }
}
