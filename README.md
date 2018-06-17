# gradle-restful-quickstart
Gradle spring-boot restful service docker quick start

## initial git project
1. git init
2. git remote add origin https://github.com/Chehao/gradle-restful-quickstart.git

## create gradle environment 
(https://guides.gradle.org/building-java-applications/)
1. gradle init --type java-application 
2. review project files
3. add ignore file
  <pre>
    .classpath
    .gradle
    .settings
    .vscode
    .project
  </pre>
## build
1. gradlew build
2. review build output folder, it is different from maven build output target and classes folder
3. test report build/reports/tests/test/index.html

## run application 
1. gradlew tasks
2. gradlew run (mainClassName)

## IntelliJ import project
1. add ignore file
  <pre>
    .idea
    build
    bin
  </pre>
2. 

## setup spring boot 
https://spring.io/guides/gs/rest-service/