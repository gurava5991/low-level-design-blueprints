# Structural Design Patterns

## 🧱 Structural Design Patterns — Definition

> **Structural patterns** define **how objects and classes are composed** to form larger structures while keeping the system flexible and efficient. They focus on simplifying relationships and interfaces between entities.

They help in:

* Bridging incompatible interfaces
* Simplifying complex systems
* Adding responsibilities dynamically
* Organizing relationships between components

---

## ✅ Real-Life Problems & How Structural Patterns Help

---

### 1. **Adapter Pattern**

* **Definition**: Converts the interface of a class into another interface clients expect.
* **Problem**: You bought a new charger (Type-C), but your old wall socket only supports USB-A.
* **Solution**: Use an **adapter** to connect them.
* **In Software**: Allows incompatible classes to work together by translating one interface into another.

---

### 2. **Decorator Pattern**

* **Definition**: Adds new functionality to an object dynamically without altering its structure.
* **Problem**: You ordered a coffee, then added milk, then sugar. But the coffee object stays the same.
* **Solution**: Use **decorators** to layer extra features without modifying the base item.
* **In Software**: Adds functionality to objects dynamically without changing their structure.

---

### 3. **Facade Pattern**

* **Definition**: Provides a simplified interface to a complex subsystem.
* **Problem**: Booking a flight requires calling 5 different departments (flight, hotel, cab, insurance, meals).
* **Solution**: A **facade** travel agent does it all through one call.
* **In Software**: Simplifies interaction with a complex system by providing a unified interface.

---

### 4. **Composite Pattern**

* **Definition**: Composes objects into tree structures to represent part-whole hierarchies.
* **Problem**: Managing a company hierarchy with employees and managers, where managers can have subordinates.
* **Solution**: Treat individual employees and groups uniformly.
* **In Software**: Lets clients treat single objects and compositions the same way.

---

### 5. **Bridge Pattern**

* **Definition**: Separates an object’s abstraction from its implementation so the two can vary independently.
* **Problem**: You want to build a remote control that can operate TVs, ACs, and fans.
* **Solution**: Separate abstraction (Remote) from implementation (Devices).
* **In Software**: Decouples abstraction and implementation so they can evolve independently.

---

### 6. **Proxy Pattern**

* **Definition**: Provides a surrogate or placeholder for another object to control access to it.
* **Problem**: You want to access a service, but you need logging, access control, or caching in between.
* **Solution**: Use a **proxy** to wrap the service.
* **In Software**: Controls access to an object by placing a substitute.

---

### 7. **Flyweight Pattern**

* **Definition**: Reduces memory usage by sharing as much data as possible with similar objects.
* **Problem**: You’re displaying 10,000 trees on a map, but many share the same type.
* **Solution**: Share common tree objects instead of creating new ones every time.
* **In Software**: Reduces memory usage by sharing common parts.

---

