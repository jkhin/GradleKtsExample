import org.gradle.api.artifacts.dsl.DependencyHandler


fun DependencyHandler.implementation(list: List<String>) {
    list.forEach { dependency -> add("implementation", dependency) }
}

fun DependencyHandler.kapt(list: List<String>) {
    list.forEach { dependency -> add("kapt", dependency) }
}

fun DependencyHandler.testImplementation(list: List<String>) {
    list.forEach { dependency -> add("testImplementation", dependency) }
}
