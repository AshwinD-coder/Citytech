**Overview**
	
In object-oriented programming, inheritance, and composition are two fundamental techniques for creating complex software systems. Inheritance is the mechanism by which a new class is derived from an existing class, inheriting all of its properties and methods. Composition, on the other hand, is the technique of building complex objects by combining simpler objects, rather than inheriting from a base class. 

Inheritance provides  "is a " relationship between objects while composition provides "has a" relationship between objects.

<u><b>Reasons to prefer Composition over inheritance:</u></b>
- ***Flexibility***:
	 Composition provides greater flexibility in designing and implementing software systems. With composition, we can create complex objects by combining simple objects in different ways, depending on our needs. This means that we can build more modular and reusable code that can adapt to different requirements without the need for extensive modification.
- ***Code Reusability***:
	 By using composition, we can create simple, reusable objects that can be combined to create more complex objects. This means that we can avoid duplication of code, reduce the size of our codebase, and make our code more modular and maintainable.
- ***Avoids Diamond Problem***:
	 The "diamond problem" is a well-known issue that can occur in object-oriented programming when multiple inheritance is used. In this situation, if a class inherits from two different classes that share a common parent class, it can lead to ambiguity about which parent class method should be called.
	 Composition can avoid this problem entirely. Instead of inheriting from multiple classes, a class can use objects of other classes to achieve the same functionality. This approach allows for greater flexibility, as the class can dynamically change its behavior by swapping out the objects it uses.
- ***Reduced Coupling***:
     Composition typically results in lower coupling between classes. In other words, components don't need to know much about each other, which promotes modularity and makes the codebase more maintainable. In contrast, inheritance often leads to tight coupling between base and derived classes.


Hence, composition offers several advantages over inheritance, including greater flexibility, reduced complexity, and improved maintainability. It can also avoid problems associated with multiple inheritance, such as the "diamond problem.





 