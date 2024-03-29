import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.version

plugins {
  id("com.eden.orchidPlugin")
}

dependencies {
  fun orchid(module: String) = "io.github.javaeden.orchid:Orchid$module:0.17.7"

  orchidRuntime(orchid("BsDoc"))
  orchidRuntime(orchid("Kotlindoc"))
  orchidRuntime(orchid("PluginDocs"))
  orchidRuntime(orchid("Wiki"))
  orchidRuntime(orchid("Pages"))
  orchidRuntime(orchid("Github"))
}


orchid {
  theme = "BsDoc"
  githubToken = properties["githubToken"] as String
  baseUrl = "https://camunda-user-group-hamburg.github.io/meetup-${project.version}/"
}
