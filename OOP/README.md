# Low-Level Design Blueprints

## Table of Contents
- [Object-Oriented Programming](#object-oriented-programming)
  - [Components of OOP](#components-of-object-oriented-programming-oop-in-low-level-design-lld)
  - [Blocks of OOP](#blocks-of-oop)
  - [Pillars of Object-Oriented Programming](#pillars-of-object-oriented-programming)

## Object-Oriented Programming
Once upon a time, in a bustling city, there was a young girl named Anita who loved to bake. She dreamed of opening her bakery, filled with delicious treats and happy customers. But little did she know, her baking passion would help her understand Object-Oriented Programming (OOP).
In her bakery:

- **Classes** are like recipes. A recipe for "cake" defines what ingredients (attributes) and steps (methods) are needed.
- **Objects** are the actual cakes she bakes using the recipe. Each cake can be a different flavor but follows the same recipe.
- **Encapsulation** is like wrapping the cake neatly in a box. Only Anita decides how and when to open it (control access to the cake).
- **Inheritance** is when she creates new recipes based on old ones, like "chocolate cake" from "cake," but with extra chocolate.
- **Polymorphism** is when she can bake different treats (cookies, cakes) using a common process (like "baking") but with slight differences.

### Components of Object-Oriented Programming (OOP) in Low-Level Design (LLD)

- **Classes:** A blueprint for creating objects. It defines attributes (data) and behaviors (methods). For example, a Car class may have attributes like make, model, and behaviors like start() or stop().

- **Objects:** Actual instances of classes. Each object has its own unique data and can perform actions. For instance, a specific Car object has a unique make and model and can start() or stop().

- **Abstraction:** Simplifies complex systems by focusing on important details and hiding unnecessary information. For example, when interacting with a Car object, you don't need to know how the engine works internally—just the methods like start().

- **Encapsulation:** Combines data and methods into a single unit (object), keeping some parts private and only allowing controlled access via methods. This prevents accidental modification and ensures data integrity.

- **Inheritance:** Allows a class (subclass) to inherit attributes and behaviors from another class (superclass). For example, ElectricCar can inherit from Car but have additional features like chargeBattery().

- **Polymorphism:** Enables one method to have different implementations in different contexts. For example, a start() method might work differently for a Car and an ElectricCar, but both use the same interface.

### Blocks of OOP
## 1. **Classes and Objects:**
  - **Class:** A class in programming is a blueprint or template for creating objects. It defines the properties (attributes) and behaviors (methods) that the objects created from it will have. Think of a class like a recipe that outlines what ingredients (attributes) are needed and what steps (methods) to follow.
  - **Object:** Once a class is defined, objects can be created (instantiated) from it using the new keyword followed by the class name and constructor arguments.

#### Example of a Class in Java:
```java
// Defining a class named 'Cake'
class Cake {
  // Attributes (properties of the class)
  String flavor;
  double price;

  // Constructor to initialize the Cake objects
  public Cake(String flavor, double price) {
    this.flavor = flavor;
    this.price = price;
  }

  // Method (behavior of the class)
  public void bake() {
    System.out.println("Baking a " + flavor + " cake.");
  }
}
class Main{
  public static void main(String[] args){
    Cake c1 = new Cake();//Object creation
  }
}
```
## 2 . **Attributes&Methods**
## 2.1 **Attributes**
Attributes represent the data or state of an object. They can be classified into:
### a .**Instance Attribute**

- **Definition:** Instance attributes are specific to each object created from a class. Each instance of a class can have different values for its instance attributes.
- **Usage:** They are defined within the constructor (or methods) of the class and are typically accessed using the self keyword (in Python) or this keyword (in Java/C++).

```java
class Car {
    // Instance attribute
    String color;

    // Constructor
    Car(String color) {
        this.color = color; // 'this.color' is the instance attribute
    }
}

// Creating instances
Car car1 = new Car("Red");
Car car2 = new Car("Blue");

```
### b. **Class Attributes**

- Definition: Class attributes are shared among all instances of a class. They are defined directly in the class and can be accessed using the class name or through instances.
- Usage: They are typically used for constants or properties that should be the same across all instances.

```java
class Car {
    // Class attribute
    static int numberOfWheels = 4; // Shared by all instances

    // Instance attribute
    String color;

    // Constructor
    Car(String color) {
        this.color = color;
    }
}

// Accessing class attribute
int wheels = Car.numberOfWheels; // Accessed using class name
```
## 2.2 **Methods** 
Methods define the behaviors or actions that an object can perform. They can also be classified into instance methods and class methods.
### a . **Instance Method**
- **Definition:** Instance methods operate on instance attributes and require an object of the class to be invoked. They can access both instance attributes and class attributes.
- **Usage:** They are defined with the usual method syntax, including the self (Python) or this (Java/C++) keyword to refer to instance attributes.

```java
class Car {
    String color;

    Car(String color) {
        this.color = color;
    }

    // Instance method
    void displayColor() {
        System.out.println("Car color: " + this.color);
    }
}

// Creating an instance and calling the method
Car car = new Car("Red");
car.displayColor(); // Output: Car color: Red
```
### b. **Class Methods**

- **Definition:** Class methods operate on class attributes and do not require an instance of the class to be invoked. They are defined with a specific syntax (e.g., static keyword in Java).
- **Usage:** They can only access class attributes directly and are used for operations that are relevant to the class itself rather than any specific instance.

```java
class Car {
    static int numberOfWheels = 4;

    // Class method
    static void displayWheels() {
        System.out.println("Number of wheels: " + numberOfWheels);
    }
}

// Calling the class method without an instance
Car.displayWheels(); // Output: Number of wheels: 4
```

## 2.3. Accessibility Between Instance and Static Members in OOP

In Object-Oriented Programming (OOP), **instance members** (attributes and methods) and **static members** (class attributes and methods) have different accessibility rules. Understanding how they interact is important for writing efficient and maintainable code.

### a.  Accessing Static Members from Instance Methods

- **Instance methods** can access both static (class) members and instance members directly.
- **Why**: Instance methods are tied to specific objects, and since static members belong to the class (not a specific object), they are always accessible.

**Example**:
```java
class Car {
  static int numberOfWheels = 4;  // Static attribute
  String color;                   // Instance attribute

  // Instance method
  void displayInfo() {
    System.out.println("Car color: " + this.color);         // Accessing instance attribute
    System.out.println("Number of wheels: " + numberOfWheels); // Accessing static attribute
  }
}
```
### b . Accessing Instance Members from Static Methods

- **Static methods** cannot directly access instance members (attributes or methods) without an instance of the class.
- **Why:** Static methods belong to the class itself, not specific objects. Instance members require an object context to be accessed.
- **Solution:** Pass an instance of the class to the static method to access instance members.

```java
class Car {
    static int numberOfWheels = 4;  // Static attribute
    String color;                   // Instance attribute

    // Static method
    static void displayWheels(Car carInstance) {
        System.out.println("Number of wheels: " + numberOfWheels); // Access static attribute
        System.out.println("Car color: " + carInstance.color);     // Access instance attribute via instance
    }
}

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.color = "Red";

        Car.displayWheels(car1);  // Pass car instance to access instance member
    }
}

```

## 3. **What is a Constructor?**
A **constructor** in object-oriented programming is a special method used to initialize objects. It is automatically called when an object is created. Constructors typically set initial values for object attributes.

## 3.1 **Rules for Constructors:**
- The constructor must have the same name as the class.
- It does not have any return type (not even `void`).
- It is called automatically when an object is created.
- A class can have multiple constructors (overloading).
- Constructors are not inherited.

## 3.2. **Types of Constructors:**

### a. **Default Constructor:**
If no constructor is provided, Java supplies a default constructor. It initializes object attributes to their default values.

```java
class Car {
  String model;
  int year;
}

public class TestCar {
  public static void main(String[] args) {
    Car myCar = new Car();  // Default constructor
    System.out.println(myCar.model);  // null
    System.out.println(myCar.year);   // 0
  }
}
```

### b. **Parameterized Constructor:**
A constructor that accepts arguments to initialize the object with specific values.

```java
class Car {
  String model;
  int year;

  // Parameterized constructor
  public Car(String model, int year) {
    this.model = model;
    this.year = year;
  }
}

public class TestCar {
  public static void main(String[] args) {
    Car myCar = new Car("Toyota", 2022);  // Parameterized constructor
    System.out.println(myCar.model);  // Toyota
    System.out.println(myCar.year);   // 2022
  }
}
```

### c. **Copy Constructor:**
A constructor that creates an object by copying another object of the same class.

```java
class Car {
  String model;
  int year;

  // Parameterized constructor
  public Car(String model, int year) {
    this.model = model;
    this.year = year;
  }

  // Copy constructor
  public Car(Car car) {
    this.model = car.model;
    this.year = car.year;
  }
}

public class TestCar {
  public static void main(String[] args) {
    Car myCar = new Car("Honda", 2023);  // Parameterized constructor
    Car copyCar = new Car(myCar);        // Copy constructor
    System.out.println(copyCar.model);   // Honda
    System.out.println(copyCar.year);    // 2023
  }
}
```

## 3.3. **Constructor Chaining:**

Constructor chaining is when one constructor calls another within the same class or between a subclass and superclass using `this()` or `super()`.

### a. **Chaining in the Same Class**:
```java
class Car {
  String model;
  int year;

  // Constructor 1
  public Car() {
    this("Unknown", 0);  // Calls Constructor 2
  }

  // Constructor 2
  public Car(String model, int year) {
    this.model = model;
    this.year = year;
  }
}
```

### b. **Chaining Between Superclass and Subclass**:
```java
class Vehicle {
  String type;

  public Vehicle(String type) {
    this.type = type;
  }
}

class Car extends Vehicle {
  String model;

  public Car(String model) {
    super("Car");  // Calls the superclass constructor
    this.model = model;
  }
}
```


##  **Key Points on Constructor Chaining:**
- The first statement in a constructor must be a call to `this()` (another constructor in the same class) or `super()` (the superclass constructor).
- Constructor chaining ensures that each level in the class hierarchy is initialized properly.

## 4 . **this** keyword

this keyword refers to the current object within which it is used. It allows Java developers to access instance variables, invoke instance methods, and perform other object-related operations with clarity and precision. Essentially, "this" acts as a pointer to the current instance of the class, providing a means to distinguish between instance variables and local variables or parameters with the same name.

## **Practical Application of this Keyword**

### 4.1. Referring to Current Class Instance Variable:
"this" keyword can be used to refer to instance variables of the current class. This is particularly useful when there's a naming conflict between instance variables and local variables or parameters.

```java
public class Student {
    private int name;

    public void setValue(int name) {
        this.name = name; // Assigning value to the instance variable
    }
}

```
### 4. 2. Invoking Current Class Method (Implicitly):

Inside a method, you can invoke another method of the same class implicitly using the this keyword.

```java
public class ClassRoom {
    public void method1()
    {
        // Perform some operations
    }

    public void method2()
    {
        this.method1(); // Invoking method1() implicitly
    }
}
```
### 4.3 Invoking Current Class Constructor:

The this() constructor call can be used to invoke another constructor within the same class, facilitating constructor chaining.
```java
public class MyClass {
    private int value;

    public MyClass() {
        this(0); // Invoking another constructor with a default value
    }

    public MyClass(int value) {
        this.value = value;
    }
}

```

### 4.4. Passing this as an Argument in Method Call:

You can pass the current object this as an argument to other methods, enabling those methods to operate within the context of the current object.
```java
public class MyClass {
    public void method1() {
        // Method implementation
    }

    public void method2(MyClass obj) {
        obj.method1(); // Invoking method1() using passed object
    }
}

```

### 4.5. Passing this as an Argument in Constructor Call:

Similarly, this can be passed as an argument to other constructors within the same class, facilitating constructor invocation

```java
public class MyClass {
    public MyClass() {
        new AnotherClass(this); // Passing current object to AnotherClass constructor
    }
}

```

### 4.6 Returning the Current Class Instance from a Method:

Methods can return the current class instance using the this keyword, enabling method chaining and fluent API design.

```java
public class MyClass {
    private int value;

    public MyClass setValue(int value) {
        this.value = value;
        return this; // Returning the current class instance
    }
}

```
## Pillars of Object-Oriented Programming

Object-Oriented Programming (OOP) is a programming paradigm that relies on the concept of classes and objects. It organizes software design around data, or objects, rather than functions and logic. There are four main pillars of OOP, each contributing to the modularity, reusability, and scalability of the code.

## 1. **Encapsulation**

Encapsulation is the process of wrapping data (variables) and methods (functions) together into a single unit, called a class. It restricts direct access to an object's data and ensures that data can only be modified through well-defined methods.

### Implementing encapsulation in programming

Let's consider a simple example of encapsulating student information. We want to create a Student class that stores details such as name, age, and grade.

```java
class Student {
    // Data members
    private String name;
    private int age;
    private char grade;

    // Constructor
    public Student(String name, int age, char grade)
    {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}

```
To interact with the variables (such as name, age, and grade) encapsulated within the Student class, we can create getter methods for each variable.

**For instance:**

* We can create a getName() method to retrieve the student's name, a getAge() method to get the student's age, and a getGrade() method to obtain the student's grade.
* Following this pattern, these getter methods should be part of the Student class itself.
* By providing these getter methods within the class, we establish a clear interface for accessing the student's information without exposing the internal data directly.
* This encapsulation ensures that the internal state of a Student object remains protected and can only be accessed through controlled methods.
Let's apply this concept to our Student class:
- **Example:**
```java
// Student class encapsulating student information
class Student {
    // Data members
    private String name;
    private int age;
    private char grade;

    // Constructor
    public Student(String name, int age, char grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Getter and setter methods for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and setter methods for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Getter and setter methods for grade
    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }
}

// Main class to demonstrate encapsulation usage
public class Main {
    public static void main(String[] args) {
        // Create a new student object
        Student student = new Student("Punit", 22, 'A');

        // Accessing data using getter methods
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());
        System.out.println("Student Grade: " + student.getGrade());

        // Modifying data using setter methods
        student.setName("Rahul");
        student.setAge(24);
        student.setGrade('B');

        // Display updated information
        System.out.println("---");
        System.out.println("Updated Student Name: " + student.getName());
        System.out.println("Updated Student Age: " + student.getAge());
        System.out.println("Updated Student Grade: " + student.getGrade());
    }
}

```

In this example, the `balance` variable is private and can only be modified through the `deposit` method. This is an example of encapsulation, where the internal state is hidden from direct access.

---

## 2. **Abstraction**

Abstraction refers to the concept of exposing only the necessary parts of an object while hiding the complex internal details. It simplifies the interaction between the user and the object by providing only essential features.

We can achieve abstraction in two ways:

1. Using Abstract Class
2. Using Interface

- **Example:**
```java
abstract class Shape {
  // Abstract method for calculating area
  abstract double calculateArea();
}

class Circle extends Shape {
  private double radius;

  // Constructor
  public Circle(double radius) {
    this.radius = radius;
  }

  // Implementing abstract method
  @Override
  double calculateArea() {
    return Math.PI * radius * radius;
  }
}

public class Main {
  public static void main(String[] args) {
    Shape shape = new Circle(5.0);
    System.out.println("Area: " + shape.calculateArea());
  }
}
```

In this example, the user interacts with the `Shape` class without worrying about the details of how the area is calculated for different shapes like `Circle`.

---

## 3. **Inheritance**

Inheritance is a mechanism that allows one class to inherit fields and methods from another class. It promotes code reuse by allowing a new class (child class) to inherit properties and behaviors of an existing class (parent class).

- **Example:**
```java
class Vehicle {
  String make;
  String model;

  public Vehicle(String make, String model) {
    this.make = make;
    this.model = model;
  }

  public void display() {
    System.out.println("Vehicle: " + make + " " + model);
  }
}

class Car extends Vehicle {
  int year;

  public Car(String make, String model, int year) {
    super(make, model);  // Call the parent constructor
    this.year = year;
  }

  @Override
  public void display() {
    super.display();  // Call the parent method
    System.out.println("Year: " + year);
  }
}
```

In this example, the `Car` class inherits from the `Vehicle` class, reusing its fields and methods.

---

## 4. **Polymorphism**

Polymorphism allows one interface or method to be used for a general class of actions. The specific action is determined by the exact nature of the situation. In Java, polymorphism is implemented through method overloading and method overriding.

- **Example (Method Overriding):**
```java
class Animal {
  public void sound() {
    System.out.println("Animal makes a sound");
  }
}

class Dog extends Animal {
  @Override
  public void sound() {
    System.out.println("Dog barks");
  }
}

public class Main {
  public static void main(String[] args) {
    Animal myDog = new Dog();
    myDog.sound();  // Outputs: Dog barks
  }
}
```

In this example, although the variable is of type `Animal`, it references a `Dog` object, and the `Dog` version of the `sound` method is called. This is an example of polymorphism.

---

## 5. **Interfaces**

An interface in Java is a reference type, similar to a class, that can contain only constants, method signatures, default methods, static methods, and nested types. Interfaces cannot contain instance fields or constructors. A class implements an interface by providing the body of all the methods defined in the interface.

- **Example:**
```java
interface Animal {
  void sound();  // Abstract method
}

class Cat implements Animal {
  @Override
  public void sound() {
    System.out.println("Cat meows");
  }
}

class Dog implements Animal {
  @Override
  public void sound() {
    System.out.println("Dog barks");
  }
}

public class Main {
  public static void main(String[] args) {
    Animal myCat = new Cat();
    myCat.sound();  // Outputs: Cat meows

    Animal myDog = new Dog();
    myDog.sound();  // Outputs: Dog barks
  }
}
```

In this example, both `Cat` and `Dog` implement the `Animal` interface and provide their own definitions for the `sound` method.

---

## Key Points:
- **Encapsulation** ensures that the internal implementation of an object is hidden from the outside world.
- **Abstraction** allows you to focus on what an object does, rather than how it does it.
- **Inheritance** promotes code reuse and establishes a parent-child relationship between classes.
- **Polymorphism** allows different classes to be treated as instances of the same class through a common interface, providing flexibility in design.
- **Interfaces** provide a way to achieve abstraction and multiple inheritance in Java, allowing classes to implement multiple behaviors.


      

