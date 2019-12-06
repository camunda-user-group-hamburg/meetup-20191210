repositories {
  mavenLocal()

  jcenter()
  mavenCentral()
  gradlePluginPortal()

  maven("https://jitpack.io")

  // note: for camunda-ee to work, add  credentials to $HOME/.gradle/gradle.properties
  maven("https://app.camunda.com/nexus/content/repositories/camunda-bpm-ee") {
    name = "camunda-bpm-ee"
    credentials {
      username = properties["camundaRepoUser"] as String
      password = properties["camundaRepoPassword"] as String
    }
  }
}

configurations.all {
  with(resolutionStrategy) {
    cacheChangingModulesFor(0, TimeUnit.SECONDS)
    cacheDynamicVersionsFor(0, TimeUnit.SECONDS)
  }
}
