# Morphoide [[v0.3.9]](https://github.com/Zelechos/Morphoide/releases/tag/v0.3.9)
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
    <version>0.3.9</version>
</dependency>
```

# Gradle

```yml
// https://mvnrepository.com/artifact/io.github.zelechos/Morphoide
implementation group: 'io.github.zelechos', name: 'Morphoide', version: '0.3.9'
```

## How to use ?? don't worry Morphoide is very easy to use

### Basic String Manipulation
_Just import Morphoide and you are ready to use all the subroutines_
```java
import morphoide.Morphoide;

public class Main {
    public static void main(String[] args) {
        String text = "Morphoide";
        
        // Reverse a string
        String reversed = Morphoide.meta(text)
                .reverseString()
                .morph();
        // Output: ediohproM
        
        // Uppercase first character
        String capitalized = Morphoide.meta("morphoide")
                .upperCaseFirstCharacter()
                .morph();
        // Output: Morphoide
        
        // Check if string is palindrome
        Boolean isPalindrome = Morphoide.meta("radar")
                .isCapicua()
                .morph();
        // Output: true
    }
}
```

### String Transformations with Chaining
_All Morphoide subroutines use Chaining Method for fast and simple implementation_
```java
import morphoide.Morphoide;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Complex string manipulation chain
        String result = Morphoide.meta("Morphoide")
                .stringDestructionToList()      // [M, o, r, p, h, o, i, d, e]
                .stringConstruction()            // Morphoide
                .reverseString()                 // ediohproM
                .upperCaseFirstCharacter()       // EdiohproM
                .morph();
        // Output: EdiohproM
    }
}
```

### Sorting Algorithms (NEW in v0.3.9)
```java
import morphoide.Morphoide;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 9);
        
        // Bubble Sort
        List<Integer> sorted = Morphoide.meta(numbers)
                .bubbleSort()
                .morph();
        // Output: [1, 2, 5, 8, 9]
        
        // Quick Sort
        List<Integer> quickSorted = Morphoide.meta(numbers)
                .quickSort()
                .morph();
        // Output: [1, 2, 5, 8, 9]
        
        // Merge Sort
        List<Integer> mergeSorted = Morphoide.meta(numbers)
                .mergeSort()
                .morph();
        // Output: [1, 2, 5, 8, 9]
        
        // Other available: insertionSort(), selectionSort(), heapSort()
    }
}
```

### Search Algorithms (NEW in v0.3.9)
```java
import morphoide.Morphoide;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> sortedList = Arrays.asList(1, 2, 5, 8, 9, 12, 15, 20);
        
        // Binary Search (requires sorted list)
        Integer index = Morphoide.meta(sortedList)
                .binarySearch(9)
                .morph();
        // Output: 4 (index of element 9)
        
        // Linear Search
        Integer linearIndex = Morphoide.meta(Arrays.asList(5, 2, 8, 1, 9))
                .linearSearch(8)
                .morph();
        // Output: 2
        
        // Jump Search (for sorted lists)
        Integer jumpIndex = Morphoide.meta(sortedList)
                .jumpSearch(12)
                .morph();
        // Output: 5
        
        // Interpolation Search (for sorted lists)
        Integer interpolationIndex = Morphoide.meta(sortedList)
                .interpolationSearch(15)
                .morph();
        // Output: 6
    }
}
```

### Mathematical Operations (NEW in v0.3.9)
```java
import morphoide.Morphoide;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Check if number is prime
        Boolean isPrime = Morphoide.meta(17)
                .isPrime()
                .morph();
        // Output: true
        
        // Calculate GCD (Greatest Common Divisor)
        Integer gcd = Morphoide.meta()
                .gcd(48, 18)
                .morph();
        // Output: 6
        
        // Calculate LCM (Least Common Multiple)
        Integer lcm = Morphoide.meta()
                .lcm(12, 18)
                .morph();
        // Output: 36
        
        // Generate Fibonacci sequence
        String fibonacci = Morphoide.meta()
                .fibonacci(7)
                .morph();
        // Output: 0, 1, 1, 2, 3, 5, 8
        
        // Prime factorization
        List<Integer> factors = Morphoide.meta()
                .primeFactorization(60)
                .morph();
        // Output: [2, 2, 3, 5]
        
        // Sieve of Eratosthenes (find all primes up to n)
        List<Integer> primes = Morphoide.meta()
                .sieveOfEratosthenes(30)
                .morph();
        // Output: [2, 3, 5, 7, 11, 13, 17, 19, 23, 29]
    }
}
```

### Advanced Algorithms (NEW in v0.3.9)
```java
import morphoide.Morphoide;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Kadane's Algorithm (maximum subarray sum)
        Integer maxSum = Morphoide.meta(Arrays.asList(-2, 1, -3, 4, -1, 2, 1, -5, 4))
                .kadaneAlgorithm()
                .morph();
        // Output: 6 (subarray: [4, -1, 2, 1])
        
        // Collatz Sequence (3n+1 problem)
        List<Integer> collatz = Morphoide.meta()
                .collatzSequence(10)
                .morph();
        // Output: [10, 5, 16, 8, 4, 2, 1]
        
        // Pascal's Triangle
        List<List<Integer>> pascal = Morphoide.meta()
                .pascalTriangle(5)
                .morph();
        // Output: [[1], [1, 1], [1, 2, 1], [1, 3, 3, 1], [1, 4, 6, 4, 1]]
        
        // Dutch National Flag Sort (sort 0s, 1s, 2s)
        List<Integer> dutchSorted = Morphoide.meta(Arrays.asList(2, 0, 2, 1, 1, 0))
                .dutchFlagSort()
                .morph();
        // Output: [0, 0, 1, 1, 2, 2]
    }
}
```

### Password Validation
```java
import morphoide.Morphoide;

public class Main {
    public static void main(String[] args) {
        // Validate password with requirements
        Boolean isValid = Morphoide.meta()
                .validatePassword("MyP@ssw0rd", 8, 20)
                .morph();
        // Output: true (has uppercase, lowercase, number, special char, and length 8-20)
        
        // Check specific requirements
        Boolean hasUpperAndLower = Morphoide.meta("Password123")
                .containsUppercaseAndLowercase()
                .morph();
        // Output: true
        
        Boolean hasAllRequirements = Morphoide.meta("Pass123!")
                .hasUpperLowerNumberAndSpecial()
                .morph();
        // Output: true
    }
}
```
<img align="center" src="https://user-images.githubusercontent.com/73097560/115834477-dbab4500-a447-11eb-908a-139a6edaec5c.gif" alt="Morphoide" width="1000"/>
<img align="center" src="https://user-images.githubusercontent.com/41464891/146714320-aac00d2f-cd27-4376-8d9a-f38e29127480.jpg" alt="Morphoide" width="1000"/>
<img align="center" src="https://user-images.githubusercontent.com/73097560/115834477-dbab4500-a447-11eb-908a-139a6edaec5c.gif" alt="Morphoide" width="1000"/>

## Look at the library here!!

### [Morphoide v0.3.9](https://central.sonatype.com/artifact/io.github.zelechos/Morphoide/0.3.9)

## Download Morphoide

### [Morphoide v0.3.9.jar](https://github.com/Zelechos/Morphoide/releases/download/v0.3.9/Morphoide-0.3.9.jar)

## Current Version

| Date       | Version | Description                                                    |
|------------|---------|----------------------------------------------------------------|
| 20/12/2021 | v0.1.4  | Create method separationByTwoPoints()                          |
| 26/03/2023 | v0.2.0  | Create different subrutines                                    |
| 31/03/2023 | v0.2.2  | The pom.xml was created                                        |
| 09/04/2023 | v0.2.3  | Restructuring the project                                      |
| 17/05/2025 | v0.3.7  | Add new subrutines                                             |
| 02/10/2025 | v0.3.8  | Add Idiom Chaning Subrutine                                    |
| 23/01/2026 | v0.3.9  | Add Sorting, Search, Mathematical & Advanced Algorithms        |

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
