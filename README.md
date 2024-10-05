# Low-Level Design Blueprints

## Table of Contents
- [Object-Oriented Programming](#object-oriented-programming)
  - [Components of OOP](#components-of-object-oriented-programming-oop-in-low-level-design-lld)
  - [Blocks of OOP](#blocks-of-oop)
  - [Pillars of OOP](#pillars-of-Object-Oriented-Programming)

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
- **Classes and Objects:**
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
## 1. **What is a Constructor?**
A **constructor** in object-oriented programming is a special method used to initialize objects. It is automatically called when an object is created. Constructors typically set initial values for object attributes.

## 2. **Rules for Constructors:**
- The constructor must have the same name as the class.
- It does not have any return type (not even `void`).
- It is called automatically when an object is created.
- A class can have multiple constructors (overloading).
- Constructors are not inherited.

## 3. **Types of Constructors:**

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

## 4. **Constructor Chaining:**

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

## 5. **Key Points on Constructor Chaining:**
- The first statement in a constructor must be a call to `this()` (another constructor in the same class) or `super()` (the superclass constructor).
- Constructor chaining ensures that each level in the class hierarchy is initialized properly.

# Pillars of Object-Oriented Programming (OOP)

Object-Oriented Programming (OOP) is a programming paradigm that relies on the concept of classes and objects. It organizes software design around data, or objects, rather than functions and logic. There are four main pillars of OOP, each contributing to the modularity, reusability, and scalability of the code.

## 1. **Encapsulation**

Encapsulation is the process of wrapping data (variables) and methods (functions) together into a single unit, called a class. It restricts direct access to an object's data and ensures that data can only be modified through well-defined methods.


- **Example:**
```java
class BankAccount {
    private double balance;

    // Constructor
    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Public method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Public method to get balance
    public double getBalance() {
        return balance;
    }
}
```

In this example, the `balance` variable is private and can only be modified through the `deposit` method. This is an example of encapsulation, where the internal state is hidden from direct access.

---

## 2. **Abstraction**

Abstraction refers to the concept of exposing only the necessary parts of an object while hiding the complex internal details. It simplifies the interaction between the user and the object by providing only essential features.


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


      

