package com.kvvssut.learnings.java.theory;

public class OOADPrinciples {

	// Abstraction
	/*
	 * An abstraction denotes the essential characteristics of an object that
	 * distinguish it from all other kinds of objects and thus provide crisply
	 * defined conceptual boundaries, relative to the perspective of the
	 * viewer.
	 * 
	 * Abstraction means to focus on the essential features of an element or
	 * object in OOP, ignoring its extraneous or accidental properties. The
	 * essential features are relative to the context in which the object is
	 * being used.
	 */

	// Encapsulation
	/*
	 * Encapsulation is the process of binding both attributes and methods
	 * together within a class. Through encapsulation, the internal details of a
	 * class can be hidden from outside. The class has methods that provide user
	 * interfaces by which the services provided by the class may be used.
	 */

	// Inheritance
	/*
	 * Inheritance can be defined as the process where one class acquires the
	 * properties (methods and fields) of another. With the use of inheritance
	 * the information is made manageable in a hierarchical order.
	 * 
	 * The class which inherits the properties of other is known as subclass
	 * (derived class, child class) and the class whose properties are inherited
	 * is known as superclass (base class, parent class).
	 */

	// Polymorphism
	/*
	 * Polymorphism is the ability of an object to take on many forms. The most
	 * common use of polymorphism in OOP occurs when a parent class reference is
	 * used to refer to a child class object.
	 * 
	 * Any Java object that can pass more than one IS-A test is considered to be
	 * polymorphic. In Java, all Java objects are polymorphic since any object
	 * will pass the IS-A test for their own type and for the class Object.
	 * 
	 * It is important to know that the only possible way to access an object is
	 * through a reference variable. A reference variable can be of only one
	 * type. Once declared, the type of a reference variable cannot be changed.
	 */

	// Modularity
	/*
	 * �Modularity is the property of a system that has been decomposed into a
	 * set of cohesive and loosely coupled modules.
	 * 
	 * Modularity is the process of decomposing a problem (program) into a set
	 * of modules so as to reduce the overall complexity of the problem.
	 */

	// Hierarchy
	/*
	 * Hierarchy is the ranking or ordering of abstraction. Through hierarchy,
	 * a system can be made up of interrelated subsystems, which can have their
	 * own subsystems and so on until the smallest level components are reached.
	 * It uses the principle of divide and conquer. Hierarchy allows code
	 * re-usability.
	 * 
	 * The two types of hierarchies in OOA are:
	 * 
	 * ISA hierarchy : It defines the hierarchical relationship in
	 * inheritance, whereby from a super-class, a number of subclasses may be
	 * derived which may again have subclasses and so on. For example, if we
	 * derive a class Rose from a class Flower, we can say that a rose isa
	 * flower.
	 * 
	 * PARTOF hierarchy : It defines the hierarchical relationship in
	 * aggregation by which a class may be composed of other classes. For
	 * example, a flower is composed of sepals, petals, stamens, and carpel. It
	 * can be said that a petal is a partof flower.
	 */

	// Typing
	/*
	 * According to the theories of abstract data type, a type is a
	 * characterization of a set of elements. In OOP, a class is visualized as a
	 * type having properties distinct from any other types. Typing is the
	 * enforcement of the notion that an object is an instance of a single class
	 * or type. It also enforces that objects of different types may not be
	 * generally interchanged; and can be interchanged only in a very restricted
	 * manner if absolutely required to do so.
	 * 
	 * The two types of typing are:
	 * 
	 * Strong Typing : Here, the operation on an object is checked at the time
	 * of compilation.
	 * 
	 * Weak Typing : Here, messages may be sent to any class. The operation is
	 * checked only at the time of execution.
	 */

	// Concurrency
	/*
	 * Concurrency in operating systems allows performing multiple tasks or
	 * processes simultaneously. When a single process exists in a system, it is
	 * said that there is a single thread of control. However, most systems have
	 * multiple threads, some active, some waiting for CPU, some suspended, and
	 * some terminated. Systems with multiple CPUs inherently permit concurrent
	 * threads of control; but systems running on a single CPU use appropriate
	 * algorithms to give equitable CPU time to the threads so as to enable
	 * concurrency.
	 * 
	 * In an object-oriented environment, there are active and inactive objects.
	 * The active objects have independent threads of control that can execute
	 * concurrently with threads of other objects. The active objects
	 * synchronize with one another as well as with purely sequential objects.
	 */

	// Persistence
	/*
	 * An object occupies a memory space and exists for a particular period of
	 * time. In traditional programming, the life span of an object was typically
	 * the life span of the execution of the program that created it. In files or
	 * databases, the object life span is longer than the duration of the process
	 * creating the object. This property by which an object continues to exist
	 * even after its creator ceases to exist is known as persistence.
	 */

}
