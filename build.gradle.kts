plugins {
    java
    scala
}
repositories { // Where to search for dependencies
    mavenCentral()
}
dependencies {
// Suppressions for SpotBugs
    compileOnly("com.github.spotbugs:spotbugs-annotations:4.9.3")
    implementation("org.scala-lang:scala3-library_3:3.3.5")
}

