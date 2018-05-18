package com.kvvssut.learnings.java.more;

import java.io.Serializable;
import java.util.Collection;
import java.util.RandomAccess;

public class Interfaces {

	public static void main(String[] args) {

		/**
		 * To allow subtypes of non-serializable classes to be serialized, the subtype may assume responsibility for saving and restoring the
		 * state of the supertype's public, protected, and (if accessible) package fields.  The subtype may assume this responsibility only if
		 * the class it extends has an accessible no-arg constructor to initialize the class's state.  It is an error to declare a class
		 * Serializable if this is not the case.  The error will be detected at runtime.
		 *  
		 * During deserialization, the fields of non-serializable classes will be initialized using the public or protected no-arg constructor of
		 * the class.  A no-arg constructor must be accessible to the subclass that is serializable.  The fields of serializable subclasses will
		 * be restored from the stream. */

		/**
		 * Classes that require special handling during the serialization and deserialization process must implement special methods with these exact
		 * signatures:
		 * private void writeObject(java.io.ObjectOutputStream out)
		 *     throws IOException -	The default mechanism for saving the Object's fields can be invoked by calling out.defaultWriteObject.
		 * private void readObject(java.io.ObjectInputStream in)
		 *     throws IOException, ClassNotFoundException - in.defaultReadObject is called to invoke the default mechanism for restoring the object's non-static and non-transient fields. */

		/**
		 * The serialization runtime associates with each serializable class a version number, called a serialVersionUID, which is used during deserialization to
		 * verify that the sender and receiver of a serialized object have loaded classes for that object that are compatible with respect to serialization.
		 * 
		 * ANY-ACCESS-MODIFIER static final long serialVersionUID = 42L;
		 * 
		 * If a serializable class does not explicitly declare a serialVersionUID, then the serialization runtime will calculate a default serialVersionUID value
		 * for that class based on various aspects of the class. However, it is strongly recommended that all serializable classes explicitly declare
		 * serialVersionUID values, since the default serialVersionUID computation is highly sensitive to class details that may vary depending on compiler
		 * implementations, and can thus result in unexpected "InvalidClassException" during deserialization.  Therefore, to guarantee a consistent serialVersionUID value 
		 * across different java compiler implementations, a serializable class must declare an explicit serialVersionUID value. It is also strongly advised that explicit
		 * serialVersionUID declarations use the private modifier where possible, since such declarations apply only to the immediately declaring
		 * class --serialVersionUID fields are not useful as inherited members.
		 */
		Serializable serializable;		// Marker Interface


		/**
		 * A class implements the Cloneable interface to indicate to the {java.lang.Object#clone()}  method that it is legal for that method to make a
		 * field-for-field copy of instances of that class.
		 * 
		 * Invoking Object's clone method on an instance that does not implement the Cloneable interface results in the "CloneNotSupportedException" being thrown. */

		/**
		 * By convention, classes that implement this interface should override Object.clone (which is protected) with a public method.
		 * 
		 * Note that this interface does not contain the clone method. Therefore, it is not possible to clone an object merely by virtue of the
		 * fact that it implements this interface.  Even if the clone method is invoked reflectively, there is no guarantee that it will succeed.
		 */
		Cloneable cloneable;		// Marker Interface


		/**
		 * Marker interface used by List implementations to indicate that they support fast (generally constant time) random access.  The primary
		 * purpose of this interface is to allow generic algorithms to alter their behavior to provide good performance when applied to either random or
		 * sequential access lists. */

		/**
		 * As a rule of thumb, a List implementation should implement this interface if, for typical instances of the class, this loop:
		 * 
		 *     for (int i=0, n=list.size(); i &lt; n; i++)
		 *         list.get(i);
		 * 
		 * runs faster than this loop:
		 * 
		 *     for (Iterator i=list.iterator(); i.hasNext(); )
		 *         i.next();
		 */
		RandomAccess randomAccess;		// Marker Interface


		/**
		 * Implementing this interface allows an object to be the target of
		 * the "foreach" statement. */

		/**
		 * Abstact Method: 	Iterator<String> iterator();
		 *  
		 * Returns an iterator over a set of elements of type String.
		 */
		Iterable<String> iterable;


		/**
		 * All general-purpose Collection implementation classes (which typically implement Collection indirectly through one of its
		 * subinterfaces) should provide two "standard" constructors: a void (no arguments) constructor, which creates an empty collection, and a
		 * constructor with a single argument of type Collection, which creates a new collection with the same elements as its argument.
		 */
		Collection<String> collection;		// extends Iterable<String>


		/**
		 * This interface imposes a total ordering on the objects of each class that implements it. This ordering is referred to as the class's natural
		 * ordering, and the class's compareTo method is referred to as its natural comparison method.
		 * 
		 * Lists (and arrays) of objects that implement this interface can be sorted automatically by {Collections.sort} (and {Arrays#sort(Object[]) Arrays.sort}).  
		 * Objects that implement this interface can be used as keys in a {SortedMap sorted map} or as elements in a {SortedSet sorted set}, without the need to
		 * specify a {Comparator comparator}.
		 */

		/**
		 *  The natural ordering for a class C is said to be consistent with equals if and only if e1.compareTo(e2) == 0 has
		 * the same boolean value as e1.equals(e2) for every e1 and e2 of class C. Note that null is not an instance of any class, 
		 * and e.compareTo(null) should throw a NullPointerException even though e.equals(null) returns false.
		 */

		/**
		 * Abstract Method: public int compareTo(T o);
		 * 
		 * Compares this object with the specified object for order.  Returns a  negative integer, zero, or a positive integer as this object is less
		 * than, equal to, or greater than the specified object.
		 * 
		 * The implementor must ensure sgn(x.compareTo(y)) == -sgn(y.compareTo(x)) for all x and y.  (This implies that x.compareTo(y) must throw an exception iff
		 * y.compareTo(x) throws an exception.)
		 * The notation sgn(expression) designates the mathematical signum function, which is defined to return one of -1, 0, or 1 according to whether the value of
		 * expression is negative, zero or positive.
		 */
		Comparable<String> comparable;
	}

}
