plugins {
  `kotlin-dsl`
}

kotlinDslPluginOptions {
  experimentalWarning.set(false)
}

apply {
  // repos set in /gradle
  from("../gradle/repositories.gradle.kts")
}

dependencies {
  fun kotlin(module:String) = "org.jetbrains.kotlin:kotlin-$module:$embeddedKotlinVersion"

  implementation(kotlin("gradle-plugin"))
  implementation(kotlin("allopen"))

  implementation("org.springframework.boot:spring-boot-gradle-plugin:2.2.2.RELEASE")

  implementation("gradle.plugin.com.eden:orchidPlugin:0.17.7")
}
