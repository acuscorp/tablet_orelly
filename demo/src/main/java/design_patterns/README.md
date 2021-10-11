### OO Basiscs

- Abstraction.
- Encapsulation.
- Polimorphism.
- Inheritance.

### OO Principles

- Encapsulate what varies.
- Favor composition over Inheritance.
- Program to interfaces, not implementation.
- Strieves for loosely coupled design betwieen objencts that interact.
- Classes should be open for extension but closed for modification.
- Depend on abtraction. Do not depend on concrete classes.
- Talk only to your friends 
  

### OO Paterns

- **Strategy** - Defines a family of algorithms, encapsulates each one, and makes them interchangeable. Strategy lets the algorithm vary independently from clients that use it.
  
- **Observer** - Defines a one to many dependency between objencts, so when one object change it state, all its dependents are notified and updated automatically.
  
- **decorator** Attache additional responsabilities to an object dynamically. Decorator provide a flexible alternative to subclassing for extending functionality.
- **Factory method** defines an interface for creating an object, but let subclasses decide wich class to instantiate. Factory method lets a class defer instantiation to the subclasses.
- **Command** Encapsulates a request as an object, thereby letting you parameterize clients with different requests, queue or log requests, and support undoable operations.
- **facade** Provide an unified interface to set of interfaces in a subsystem. Facade defines a high-level interface that makes the susbsystem easy to use.