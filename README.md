
# JAVA - Four Pillars

Let's explore more concepts and features that you can add to your program. Here are some ideas
that can help you deepen your understanding of concepts related to objects and classes:

1. **Encapsulation:**

Encapsulation means restricting direct access to some of the object's components and protecting
the object's integrity. In Java, you can do this by declaring the fields as private and providing
public methods to access and modify these fields. These methods are often called "getters" and "setters."
You can make the Pokemon class fields private and add getter and setter methods to access and modify these
fields. This encourages good programming practices.

2. **Inheritance:**

You can introduce a base class, such as Creature, from which Pokemon can inherit. This helps you understand
how inheritance works in OOP. Inheritance allows a class to 'inherit' properties and methods from another class.
This will help us organize the code and share common behavior among different entities. By using inheritance,
we have isolated common properties in a base class and made the code more organized and extensible.
If we decide to add more types of creatures in the future, we can use the Creature class as a base.

3. **Polymorphism:**

Polymorphism is a concept that allows objects to be treated as instances of their base class, but to behave as instances of
the derived class when necessary. This allows for more flexible and reusable code.
You can define different methods for different types of Pokemon. For example, you can create classes for different types of
Pokemon, such as WaterPokemon, that override the attack method to have different behaviors. 
* Overloading (Compile-Time Polymorphism)
Let's assume we have a PokemonCenter class that can heal Pokemons. It can heal a single Pokemon or multiple at once.
* Overriding (Runtime Polymorphism)
Each type of Pokemon may have a specific sound. We can use overriding to achieve this.

4. **Interfaces and Abstraction:**

You can define an interface or an abstract class that describes common behaviors for all creatures.
Interfaces are a powerful way to define contracts for classes. An interface can declare methods that
must be implemented by any class that implements the interface.
Let's introduce an interface called Battler, which will define the methods that any fighting-capable entity must have.
Interfaces also allow a type of polymorphism, as you can treat objects that implement an interface as instances of that
interface. For example, you can have a method that accepts any object that implements the Battler interface.
Interfaces are powerful for defining common behaviors and for allowing interaction between objects that may be very
different in other respects.

* **Composition & aggregation:**

Composition and aggregation are two concepts related to how classes interact and are connected to each other.
They are important for creating modular and reusable code.
Composition means that a class is made up of one or more instances of other classes. In this case, the 'composite'
object controls the lifecycle of its component parts.
Aggregation is similar to composition, but in this case, the aggregated objects exist independently of the object
that contains them. Example of Aggregation: Trainer Class
A Pokemon trainer has Pokemons, but the Pokemons also exist independently of the trainer. This is an aggregation
relationship. This allows you to explore the relationships between objects.