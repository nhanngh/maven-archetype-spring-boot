# Spring boot project Archetype.
Creating Archetypes for spring boot framework 

## Install
- Checkout the code
- Install project to local repository 
```
mvn clean install
```
- Generate archetype 
```
mvn archetype:generate                            \ 
-DarchetypeGroupId=com.bkit                       \
-DarchetypeArtifactId=maven-archetype-spring-boot \ 
-DarchetypeVersion=1.0-SNAPSHOT                   \
-DgroupId={project-packaging}                     \
-DartifactId={project-name}
```
