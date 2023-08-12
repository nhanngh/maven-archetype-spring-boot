# Maven Archetype for spring boot project
Create the structure of a Spring Boot project.

## Prerequisites
- [Java 17](https://www.oracle.com/java/technologies/downloads/)
- [Docker compose](https://docs.docker.com/compose/install/)
- [Maven](https://maven.apache.org/download.cgi)

## Install
- Checkout the code
- Install project to local repository 
```
mvn clean install
```
- Generate archetype 
```
mvn archetype:generate -DarchetypeGroupId=com.bkit -DarchetypeArtifactId=maven-archetype-spring-boot -DarchetypeVersion=1.0-SNAPSHOT -DgroupId={project-packaging} -DartifactId={project-name}
```

## Run the source code after "install".
- Open the project after generating it.
- Run docker compose
```
cd infras
docker compose up -d
```
- Run spring boot project 
