import org.gradle.api.JavaVersion
import org.gradle.kotlin.dsl.embeddedKotlinVersion
import org.gradle.plugins.ide.idea.model.IdeaLanguageLevel

object Versions {
  val camunda = "7.12.0-ee"
  val camundaSpringBoot = "3.4.0"


  val orchid = "0.17.7"

  object Java {
    val version = JavaVersion.VERSION_11
    val name = version.toString()
    val languageLevel = IdeaLanguageLevel(name)
  }

}
