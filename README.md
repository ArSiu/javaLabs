# javaLabs

### Task rewrite code from lab2(UML for python) on java using:
- lambda,
- maven,
- FindBugs,
- CheckStyle,
- PDM,
- Jacoco.
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
### all sort methods are in class TechniqueManager package manager
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
\```

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
\```

</p>
</details>



### UML link:https://drive.google.com/file/d/1hDHSoQW4l18hA65cS-UpHeqIzkCsMIyf/view?usp=sharing
### Python lab https://github.com/ArSiu/pyLabs/tree/lab3
