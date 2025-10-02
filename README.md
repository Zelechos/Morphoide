# Morphoide [[v0.3.8]](https://github.com/Zelechos/PragmaticMorphoide/releases/tag/v0.3.8)
## Morphoide destroys the **Single Responsibility Principle** to be easier and faster to use
<img align="center" src="https://user-images.githubusercontent.com/73097560/115834477-dbab4500-a447-11eb-908a-139a6edaec5c.gif" alt="Morphoide" width="1000"/>



#### Morphoide It is a dynamic library open source that is easy to use and with good documentation that tries to achieve a more user-friendly experience when programming with the Java programming language.



### "We love java and we want you to enjoy programming with java"

<img align="center" src="https://user-images.githubusercontent.com/73097560/115834477-dbab4500-a447-11eb-908a-139a6edaec5c.gif" alt="Morphoide" width="1000"/>
  

# Maven 

```xml
<!-- https://mvnrepository.com/artifact/io.github.zelechos/Morphoide -->
<dependency>
    <groupId>io.github.zelechos</groupId>
    <artifactId>Morphoide</artifactId>
    <version>0.3.8</version>
</dependency>
```

# Gradle

```yml
// https://mvnrepository.com/artifact/io.github.zelechos/Morphoide
implementation group: 'io.github.zelechos', name: 'Morphoide', version: '0.3.8'
```

## How to use ?? don't worry Morphoide is very easy to use
_Just import Morphoide and you are ready to use all the subroutines_
```java
import io.github.morphoide.*;

public class Main {
    public static void main(String[] args) {
        String text = "Morphoide";
        
        // First Example
        String response = Morphoide.meta()
                .reverseString(text)
                .morph();
        //  or 
        String response = Morphoide.meta(text)
                .reverseString()
                .morph();

        // response : ediohproM
        
    }
}
```

_All Morphoide subroutines use Chaining Method for fast and simple implementation you don't need to create an instance to use Morphoide_
```java
import static io.github.morphoide.Morphoide.*;

public class Main {
    public static void main(String[] args) {
        List<String> list = List.of(M,o,r,p,h,o,i,d,e);
        var response = Morphoide.meta(list)
                .stringConstruction() // Morphoide
                .reverseString() // ediohproM
                .stringDestructionToList() // [e, d, i, o, h, p, r, o, M]
                .stringConstruction() // ediohproM
                .morph();

        // response : ediohproM
        
    }
}
```
<img align="center" src="https://user-images.githubusercontent.com/73097560/115834477-dbab4500-a447-11eb-908a-139a6edaec5c.gif" alt="Morphoide" width="1000"/>
<img align="center" src="https://user-images.githubusercontent.com/41464891/146714320-aac00d2f-cd27-4376-8d9a-f38e29127480.jpg" alt="Morphoide" width="1000"/>
<img align="center" src="https://user-images.githubusercontent.com/73097560/115834477-dbab4500-a447-11eb-908a-139a6edaec5c.gif" alt="Morphoide" width="1000"/>

## Look at the library here!!

### [Morphoide v0.3.8](https://central.sonatype.com/artifact/io.github.zelechos/Morphoide/0.3.8)

## Download Morphoide

### [Morphoide v0.3.8.jar](https://github.com/Zelechos/Morphoide/releases/download/v0.3.8/Morphoide-0.3.8.jar)

## Current Version

| Date       | Version | Description                           |
|------------|---------|---------------------------------------|
| 20/12/2021 | v0.1.4  | Create method separationByTwoPoints() |
| 26/03/2023 | v0.2.0  | Create different subrutines           |
| 31/03/2023 | v0.2.2  | The pom.xml was created               |
| 09/04/2023 | v0.2.3  | Restructuring the project             |
| 17/05/2025 | v0.3.7  | Add new subrutines                    |
| 02/10/2025 | v0.3.8  | Add Idiom Chaning Subrutine           |

<img align="center" src="https://user-images.githubusercontent.com/73097560/115834477-dbab4500-a447-11eb-908a-139a6edaec5c.gif" alt="Morphoide" width="1000"/>

## Creator Information 👨‍💻

- [Web](https://zelechos.github.io/PragmaticCoder/ "Web")
- [GitHub](https://github.com/Zelechos "GitHub")
- [Youtube](https://www.youtube.com/channel/UCQ1D3FO4ICg6SVivOTwIe4w?view_as=subscriber "Youtube")
- [Twitter](https://twitter.com/CoderPragmatic "Twitter")
- [Facebook](https://www.facebook.com/PragmaticCodersGroup "Facebook")
- [Instagram](https://www.instagram.com/pragmatic_coder/ "Instagram")
- [Linkedin](https://www.linkedin.com/in/alex-tumiri-huanca-6234b3195/ "Linkedin")
----------------------------------------------------------------------------------------------------
