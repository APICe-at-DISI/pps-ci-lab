plugins {
    `java-library`
}

sourceSets {                                
    main {                                  
        java.srcDir("src/main/java")
    }
}

java {                                      
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
}

tasks {
    clean {            
        doLast {
            println("Cleaning!")
        }
    }
}