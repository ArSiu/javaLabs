# Java lab3

### [1]Task make rest spring for lab2:
- spring,
- maven,
- FindBugs,
- CheckStyle,
- PDM,
- Jacoco.
### [2]hOw tO Run spring
```
$ git clone https://github.com/ArSiu/javaLabs.git
$ cd javaLabs
$ git checkout lab2
$ mvn compile
$ mvn install
$ java -jar target/Lab9v1-1.0-SNAPSHOT.jar
```
### [2]hOw tO Run site
```
$ git clone https://github.com/ArSiu/javaLabs.git
$ cd javaLabs
$ git checkout lab2
$ mvn compile
$ mvn site
$ cd target/site
$ run checkstyle.html
```
### [3]All realization of methods in class TechniqueManager package manager
<details>
<summary>[3.1]addTechnique</summary>
<p>

```java
public void addTechnique(final Technique technique) {
        tech.add(technique);
    }
```
</p>
</details> 

<details>
<summary>[3.2]sortByName</summary>
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
<summary>[3.3]sortByPrice</summary>
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
<summary>[3.4]searchBar</summary>
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
<summary>[3.5]show</summary>
<p>

```java
public void show(final boolean reverse, final List<Technique> techniques) {
        techniques.forEach(System.out::println);
    }
```
</p>
</details> 


## [4]Links
### UML link:https://drive.google.com/file/d/1hDHSoQW4l18hA65cS-UpHeqIzkCsMIyf/view?usp=sharing
### Python lab https://github.com/ArSiu/pyLabs/tree/lab3
