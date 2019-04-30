# Continuous Integration Lab for the course "Programming and Development Paradigms"

This is an empty project, with a pre-configured Gradle wrapper.
This makes the project buildable without the need of locally installing Gradle.
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

This lab should be performed in groups of 2-4 people, each with her own PC, in order to exercise the basics of teamwork with git.
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
Each member must configure the `build.gradle.kts` file in such a way that `gradle clean build` will correctly create a `build` folder with the class files compiled.

## Step 5: continuous integration

Each member must now sign up on Travis CI, connect its GitHub account, and enable the build for the repository.
Now, each one must create a valid `.travis.yml` file, and push it.
If the procedure has been performed correctly, a build will start on Travis CI, and complete successfully.

## Step 6: pull requests

Each member must now create a pull request from their `develop` branch towards the "truth repository" `develop` branch.
The project leader must comment and ask a change for each of them (add Javadoc, or any other change).
The developers must comply, and update their pull request (pushing the changes locally should suffice)

## Step 7: testing in Scala

Adapt to Gradle and re-follow/finish doing the exercises of Scala test lab involving SCoverage, ScalaTest, and ScalaMock.

## Step 8: more features

From now on, each developer must pick a feature from the following list, create a feature branch locally, implement it, and contribute back to the `develop` of the truth repository.

* Configure Gradle to generate the Javadocs
* Add a Groovy source and configure the build.gradle appropriately
* Add an Xtend source and configure the build.gradle appropriately
* Configure Gradle for using PMD
* Configure Gradle for using FindBugs
* Configure Gradle for using Checkstyle
* [Advanced] Using the Travis CI, documentation, configure a deployment on .travis.yml to automatically deploy the generated jars to GitHub releases
