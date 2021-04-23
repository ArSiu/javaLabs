# javaLabs

### Task rewrite code from lab2(UML for python) on java using:
- lambda,
- maven,
- FindBugs,
- CheckStyle,
- PDM,
- Jacoco.
#### UML diagram
![Test Image 7](https://drive.google.com/file/d/1hDHSoQW4l18hA65cS-UpHeqIzkCsMIyf/view?usp=sharing)
### hOw tO Run
```
$ git clone https://github.com/ArSiu/javaLabs.git
$ cd javaLabs
$ git checkout lab2
$ mvn compile
$ mvn site
$ cd target/site
$ run checkstyle.html
```
### All realization of methods in class TechniqueManager package manager
<details>
<summary>addTechnique</summary>
<p>

```java
public void addTechnique(final Technique technique) {
        tech.add(technique);
    }
```
</p>
</details> 

<details>
<summary>sortByName</summary>
<p>

```java
public List<Technique> sortByName(final boolean reverse) {
        if (reverse) {
            tech.sort((Technique t1, Technique t2) ->
                    t2.getName().compareTo(t1.getName()));
        } else {
            tech.sort((Technique t1, Technique t2) ->
                    t1.getName().compareTo(t2.getName()));
        }
        return tech;
    }
```
</p>
</details>  

<details>
<summary>sortByPrice</summary>
<p>

```java
public List<Technique> sortByPrice(final boolean reverse) {
        if (reverse) {
            tech.sort((Technique t1, Technique t2) ->
                    Float.compare(t2.getPrice(), t1.getPrice()));
        } else {
            tech.sort((Technique t1, Technique t2) ->
                    Float.compare(t1.getPrice(), t2.getPrice()));
        }
        return tech;
    }
```
</p>
</details>

<details>
<summary>searchBar</summary>
<p>

```java
public Optional<Technique> searchBar(final String search) {
        return tech.stream().filter(t ->
                t.getName().equals(search)).findAny();
    }
```
</p>
</details>

<details>
<summary>show</summary>
<p>

```java
public void show(final boolean reverse, final List<Technique> techniques) {
        techniques.forEach(System.out::println);
    }
```
</p>
</details> 

### Pom.xml
<details>
<summary>Pom.xml</summary>
<p>

```
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>org.arsiu</groupId>
    <artifactId>Lab8v1</artifactId>
    <version>1.0-SNAPSHOT</version>
    <packaging>jar</packaging>

    <properties>
        <java.version>1.11</java.version>
        <maven.compiler.source>11</maven.compiler.source>
        <maven.compiler.target>11</maven.compiler.target>
        <start-class>org.arsiu.Main</start-class>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <linkXRef>false</linkXRef>
        <log4j2.version>2.14.1</log4j2.version>
    </properties>

    <dependencies>
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <version>1.18.20</version>
            <scope>compile</scope>
        </dependency>

    </dependencies>

    <build>
        <pluginManagement>
            <plugins>
                <plugin>
                    <groupId>org.apache.maven.plugins</groupId>
                    <artifactId>maven-checkstyle-plugin</artifactId>
                    <version>3.1.2</version>
                    <dependencies>
                        <dependency>
                            <groupId>com.puppycrawl.tools</groupId>
                            <artifactId>checkstyle</artifactId>
                            <version>8.41.1</version>
                        </dependency>
                    </dependencies>
                </plugin>
            </plugins>
        </pluginManagement>
        <plugins>
            <plugin>
                <groupId>org.jacoco</groupId>
                <artifactId>jacoco-maven-plugin</artifactId>
                <version>0.7.9</version>
            </plugin>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-site-plugin</artifactId>
                <version>3.7.1</version>
            </plugin>
        </plugins>
    </build>

    <reporting>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-pmd-plugin</artifactId>
                <version>3.13.0</version>
                <configuration>
                    <targetJdk>11</targetJdk>
                </configuration>
            </plugin>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-checkstyle-plugin</artifactId>
                <version>3.1.2</version>
                <reportSets>
                    <reportSet>
                        <reports>
                            <report>checkstyle</report>
                        </reports>
                    </reportSet>
                </reportSets>
            </plugin>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-project-info-reports-plugin</artifactId>
                <version>3.0.0</version>
            </plugin>
            <plugin>
                <groupId>org.codehaus.mojo</groupId>
                <artifactId>findbugs-maven-plugin</artifactId>
                <version>2.5.5</version>
                <configuration>
                    <effort>Low</effort>
                    <threshold>Low</threshold>
                </configuration>
            </plugin>
        </plugins>
    </reporting>


</project>
```
</p>
</details>



### UML link:https://drive.google.com/file/d/1hDHSoQW4l18hA65cS-UpHeqIzkCsMIyf/view?usp=sharing
### Python lab https://github.com/ArSiu/pyLabs/tree/lab3
