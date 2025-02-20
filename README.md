# **Comparator**  
An important coding problem demonstrating the use of **Comparator** in Java.

## **Overview**  
This repository contains a Java program that showcases how to use **Comparator** for custom sorting in Java collections.

## **Common Comparator Methods**  

| Method | Description |
|---------|-------------|
| `compare(T o1, T o2)` | Defines custom comparison logic |
| `Comparator.comparing(Function keyExtractor)` | Sorts elements based on an extracted key |
| `Comparator.reverseOrder()` | Sorts in reverse order |
| `Comparator.comparingInt(ToIntFunction keyExtractor)` | Sorts elements by an integer key |
| `Comparator.thenComparing(Comparator other)` | Adds a secondary sorting condition |

## **Example Usage**  
```java
import java.util.*;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " - " + age;
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 25));
        people.add(new Person("Bob", 22));
        people.add(new Person("Charlie", 30));

        // Sort by age
        people.sort(Comparator.comparingInt(person -> person.age));

        System.out.println("Sorted by age: " + people);
    }
}
```

## **Output**  
Sorted by age: [Bob - 22, Alice - 25, Charlie - 30]
Sorted by name: [Alice - 25, Bob - 22, Charlie - 30]


## **How to Run the Code**  
Follow these steps to run the Java program:

1. **Clone the repository:**  
   Open a terminal and run:  
   ```sh
   git clone https://github.com/prateek-creator/Comparator.git

 2. **Navigate to the project directory:**  
    Move into the cloned project folder using the following command:  
    ```sh
    cd Comparator

 3. **Compile the Java program:**  
    Use the following command to compile the Java file:  
    ```sh
    javac MyComparator.java

 4. **Run the Java program:**  
    After compilation, execute the program using:  
    ```sh
    java ComparatorExample
    
