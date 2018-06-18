# gradle-restful-quickstart
Gradle spring-boot restful service docker quick start

## Initial git project
1. git init
2. git remote add origin https://github.com/Chehao/gradle-restful-quickstart.git

## Create gradle environment 
(https://guides.gradle.org/building-java-applications/)
1. gradle init --type java-application 
2. review project files
3. add ignore file
  <pre>
+   .classpath
+   .gradle
+   .settings
+   .vscode
+   .project
  </pre>
## Build
1. gradlew build
2. review build output folder, it is different from maven build output target and classes folder
3. test report build/reports/tests/test/index.html

## Run application 
1. gradlew tasks
2. gradlew run (mainClassName)

## IntelliJ import project
### add ignore file
  <pre>
+    .idea
+    build
+    bin
  </pre>
###. add plugin idea to build.gradle
<pre>
plugins {
...
+  id 'idea'
}
</pre>

## Setup spring boot 
https://spring.io/guides/gs/rest-service/

1 add build script repository mavenCentral()
<pre>

+ buildscript {
+     repositories {
+         mavenCentral()
+     }
+     dependencies {
+         classpath("org.springframework.boot:spring-boot-gradle-plugin:2.0.2.RELEASE")
+     }
+ }

repositories {
...
+  mavenCentral()
}
</pre>

2 add plugin build.gradle
<pre>
+ apply plugin: 'org.springframework.boot'
+ apply plugin: 'io.spring.dependency-management'
</pre>

3 add Jar info and remove version and mainClassName
<pre>
+ bootJar {
+    baseName = 'gradle-restful-quickstart-base'
+    version =  '0.1.0'
+ }

+ mainClassName = 'com.quickstart.App'


+ sourceCompatibility = 1.8
+ targetCompatibility = 1.8

dependencies {
+    compile 'org.springframework.boot:spring-boot-starter-web'
+    testCompile 'org.springframework.boot:spring-boot-starter-test'
}
</pre>

4 Run App
<pre>
gradlew runBoot 
# or 
java -jar libs/gradle-restful-quickstart-base-0.1.0.jar
</pre>

5 Switch to a different server port
application.properties
<pre>
server.port: 9000
management.server.port: 9001
management.server.address: 127.0.0.1
</pre>

## Build Docker image with distributes
https://docs.docker.com/compose/gettingstarted/
<pre>
docker-compose up -d 
</pre>