import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import org.springframework.boot.gradle.plugin.SpringBootPlugin

plugins {
  kotlin("jvm")
  kotlin("plugin.spring")
  id("org.springframework.boot")
}

dependencies {
  fun springBoot(module : String) = "org.springframework.boot:spring-boot-$module"

  implementation(
    platform(SpringBootPlugin.BOM_COORDINATES)
  )
  implementation(
    platform("org.jetbrains.kotlin:kotlin-bom")
  )
  implementation(
      platform("org.camunda.bpm:camunda-bom:${Versions.camunda}")
  )

  //
  // CAMUNDA
  //
  implementation("org.camunda.bpm.springboot:camunda-bpm-spring-boot-starter-webapp-ee:${Versions.camundaSpringBoot}") {
    because("reflective access warning with java 11")
    exclude(group="org.mybatis", module = "mybatis")
  }
  implementation("com.h2database:h2")

  implementation("org.mybatis:mybatis:3.5.3")


  implementation(kotlin("stdlib-jdk8"))
  implementation(kotlin("reflect"))
  implementation("io.github.microutils:kotlin-logging:1.6.26")


  testImplementation("org.jetbrains.kotlin:kotlin-test")
  testImplementation(springBoot("starter-test"))
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
  testImplementation("org.assertj:assertj-core")
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
  kotlinOptions {
    jvmTarget = Versions.Java.name
    freeCompilerArgs = listOf("-Xjsr305=strict", "-Xjvm-default=enable")
  }
}
