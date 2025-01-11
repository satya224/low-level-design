# SOLID Principle
* [ S - Single Responsibility Principle ](#single-responsibility-principle)
* [ O - Open Closed Principle ](#open-closed-principle)
* [ L - Liskov Substitution Principle ](#liskov-substitution-principle)
* [ I - Interface Segregation Principle ](#interface-segregation-principle)
* [ D - Dependency Inversion Principle ](#dependency-inversion-principle)

### Single Responsibility Principle
- A class should have only one reason to change.
- A class should have only one job to do.
- A class should have only one responsibility.
- Java Code Example with explanation:
- Problem:
    * Employee class is doing two jobs, saving employee and printing employee report.
    * If we want to change the way of saving employee, we need to change the Employee class.
    * If we want to change the way of printing employee report, we need to change the Employee class.
    * So, Employee class has two reasons to change.
```java
class Employee {
    public void saveEmployeeToDB(Employee employee) {
        // save employee to database
    }
    public void printEmployeeReport(Employee employee) {
        // print employee report
    }
}
``` 
* Solution:
```java
class Employee {
    public void saveEmployeeToDB(Employee employee) {
        // save employee to database
    }
}
class EmployeeReport {
    public void printEmployeeReport(Employee employee) {
        // print employee report
    }
}
```

### Open Closed Principle
- Software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification.
- We should be able to extend a class's behavior, without modifying it.
- Java Code Example with explanation:
- Problem:
    * We have a class called Employee, which has a method called saveEmployeeToDB().
    * Now, we want to add a new method called saveEmployeeToXML().
    * So, we need to modify the Employee class.
    * So, Employee class is not closed for modification.
    * So, Employee class is not following Open Closed Principle.
```java
class Employee {
    public void saveEmployeeToDB(Employee employee) {
        // save employee to database
    }
}
```
* Solution:
```java
interface Employee {
    void saveEmployee(Employee employee);
}
class EmployeeDB implements Employee {
    public void saveEmployee(Employee employee) {
        // save employee to database
    }
}   
class EmployeeXML implements Employee {
    public void saveEmployee(Employee employee) {
        // save employee to XML
    }
}
```

### Liskov Substitution Principle
- Objects in a program should be replaceable with instances of their subtypes without altering the correctness of that program.
- Subclasses should extend the capabilities of the parent class, without changing the expected behavior of the parent class(not narrow it down).
- Java Code Example with explanation:
- Problem:
   * We have an interface called Bike, which has a method called turnOnEngine().
   * We have two classes called MotorCycle and Bicycle, which implements Bike interface.
   * Bicycle class overrides the turnOnEngine() method and throws an exception.
   * MotorCycle class overrides the turnOnEngine() method and does nothing.
   * So, Bicycle class is not following Liskov Substitution Principle.
```java
interface Bike {
    void turnOnEngine();
}
class MotorCycle implements Bike {
    public void turnOnEngine() {
        // do nothing
    }
}
class Bicycle implements Bike {
    public void turnOnEngine() {
        throw new RuntimeException("Bicycle does not have engine");
    }
}
```
* Solution:
```java
interface Bike {
    void turnOnEngine();
}
class MotorCycle implements Bike {
    public void turnOnEngine() {
        // do nothing
    }
}
class Bicycle implements Bike {
    public void turnOnEngine() {
        // do nothing
    }
}
```

### Interface Segregation Principle
- Clients should not be forced to depend upon interfaces that they do not use.
- Many client-specific interfaces are better than one general-purpose interface.
- Java Code Example with explanation:
- Problem:
   * We have an interface RestaurantEmployee, which has three methods called cookFood() and serveCustomer().
   * We have two classes called Cook and Waiter, which implements RestaurantEmployee interface.
   * Cook class overrides the serveCustomer() method and does nothing.
   * Waiter class overrides the cookFood() method and does nothing.
   * So, Cook class and Waiter class are not following Interface Segregation Principle.
   * Because, Cook class does not need to implement washDishes() method and Waiter class does not need to implement cookFood() method.
   * So, Cook class and Waiter class are forced to depend upon interfaces that they do not use.
```java
interface RestaurantEmployee {
    void cookFood();
    void serveCustomer();
}
class Cook implements RestaurantEmployee {
    public void cookFood() {
        // cook food
    }
    public void serveCustomer() {
        // not my job
    }
}
class Waiter implements RestaurantEmployee {
    public void cookFood() {
        // not my job
    }
    public void serveCustomer() {
        // serve customer
    }
}
```
* Solution:
```java
interface Cook {
    void cookFood();
}
interface Waiter {
    void serveCustomer();
}
class CookImpl implements Cook {
    public void cookFood() {
        // cook food
    }
} 
class WaiterImpl implements Waiter {
    public void serveCustomer() {
        // serve customer
    }
}
```

### Dependency Inversion Principle
- High-level modules should not depend on low-level modules. Both should depend on abstractions.
- Abstractions should not depend on details. Details should depend on abstractions.
- Class should depend upon interfaces rather than concrete classes.
- Java Code Example with explanation:
- Problem:
   * We have an interface Mouse, which has two concrete classes called WirelessMouse and WiredMouse. and another interface Keyboard, which has two concrete classes called WirelessKeyboard and WiredKeyboard.
   * We have a MacBook class which uses concrete classes of Mouse (WiredMouse) and Keyboard (WiredKeyboard).
   * Now, we want to use a WirelessMouse and a WirelessKeyboard with MacBook class.
   * So, we need to change the MacBook class.
   * So, MacBook class is not following Dependency Inversion Principle.
   * Because, MacBook class is depending upon concrete classes of Mouse and Keyboard.
   * So, MacBook class is depending upon details.
   * So, MacBook class is not depending upon abstractions.
```java
interface Mouse {
    void move();
    void click();
}
class WirelessMouse implements Mouse {
    public void move() {
        // move mouse
    }
    public void click() {
        // click mouse
    }
}
class WiredMouse implements Mouse {
    public void move() {
        // move mouse
    }
    public void click() {
        // click mouse
    }
}
interface Keyboard {
    void type();
}
class WirelessKeyboard implements Keyboard {
    public void type() {
        // type
    }
}
class WiredKeyboard implements Keyboard {
    public void type() {
        // type
    }
}
class MacBook {
    private final WiredMouse mouse;
    private final Wiredkeyboard keyboard;
    public MacBook() {
        mouse = new WiredMouse();
        keyboard = new WiredKeyboard();
    }
}
```
* Solution:
```java
interface Mouse {
    void move();
    void click();
}
class WirelessMouse implements Mouse {
    public void move() {
        // move mouse
    }
    public void click() {
        // click mouse
    }
}
class WiredMouse implements Mouse {
    public void move() {
        // move mouse
    }
    public void click() {
        // click mouse
    }
}
interface Keyboard {
    void type();
}
class WirelessKeyboard implements Keyboard {
    public void type() {
        // type
    }
}
class WiredKeyboard implements Keyboard {
    public void type() {
        // type
    }
}
class MacBook {
    private final Mouse mouse;
    private final Keyboard keyboard;
    public MacBook(Mouse mouse, Keyboard keyboard) {
        this.mouse = mouse;
        this.keyboard = keyboard;
    }
}
```



  





