# Continuous Integration Lab for the course "Programming and Development Paradigms"

This is an empty project, with a pre-configured Gradle wrapper.
This makes the project buildable without the need of installing Gradle locally.
To execute the build, use:
```bash
./gradlew build
```
To clean up the previous build results and start fresh, use instead:
```bash
./gradlew clean build
```
You **can** use the IDE of your choice, but you can also just work with a text editor and the CLI.

## Step 1: groups and GitHub account

This lab should be performed in groups of 2-4 people, each with their own PC, in order to exercise the basics of teamwork with git.
Form a group, and elect a project leader randomly (e.g. using the Scala REPL to throw a random number).
Every member of the groups must have a GitHub account.

## Step 2: fork

The project leader should fork this repository.
The resulting repository will be the "truth repo".
Every other member should fork the "truth repo".

## Step 3: configure the flow

Each member should configure the project for working with git flow and create a `develop` branch.
Clone your own fork locally, create `develop`, and push it on your remote copy.

## Step 4: basic Java build

Each team member, working on `develop`, must create a Java class in the `src/main/java`.
There must not be any name clash among team members.
Each member must configure the `build.gradle.kts` file in such a way that `./gradlew clean build` will correctly create a `build` folder with the class files compiled.

## Step 5: continuous integration

Now, each one must create a valid `.github/workflows/ci.yml` file, and push it.
The workflow should:

* Prepare a Linux virtual environment
* Install Java at the appropriate version
* Run Gradle making sure the build works on the reference machine

If the procedure has been performed correctly, a workflow will will start and complete successfully.

## Step 6: pull requests

Each member must now create a pull request from their `develop` branch towards the "truth repository" `develop` branch.
The project leader must comment and ask a change for each of them (add Javadoc, or any other change).
The developers must comply, and update their pull request (pushing the changes to their local repository should suffice)

## Step 7: Scala

Enable the `scala` plugin, and write a source under `src/main/scala`.
Interoperate with the Java source by calling Java from Scala.

## Step 8: testing

Write a JUnit test:
1. [Configure Gradle](https://docs.gradle.org/current/userguide/java_testing.html#using_junit5)
2. Write a simple test using Java
3. Write another test using Scala

## Step 9: more features

From now on, each developer must pick a feature from the following list, create a feature branch locally, implement it, and contribute back to the `develop` of the truth repository.

* Configure Gradle to generate the Javadocs
* Add a Groovy source and configure the build.gradle.kts appropriately
* Add a Kotlin source and configure the build.gradle.kts appropriately
* Configure JaCoCo and run coverage report
* Upload the coverage report to codecov.io
* Configure PMD and checkstyle
* Using the GitHub Actions documentation, and possibly the `gh` and `hub` command line tools, configure a deployment that automatically deploys the generated jars to GitHub releases
