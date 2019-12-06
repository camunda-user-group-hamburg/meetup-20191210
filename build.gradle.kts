plugins {
    base
    idea
}

allprojects {
    extra["kotlin.version"] = embeddedKotlinVersion

    group = "de.cughh.meetup"
    version = "20191210"

    apply {
        from("${rootProject.rootDir}/gradle/repositories.gradle.kts")
    }

}


dependencies {
    subprojects.forEach {
        archives(it)
    }
}


