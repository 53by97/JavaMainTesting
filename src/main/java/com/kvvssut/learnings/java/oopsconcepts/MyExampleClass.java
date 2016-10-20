package com.kvvssut.learnings.java.oopsconcepts;

/*
 * As below class is not abstract class and it is extending abstract class which
 * has not yet implemented the method from interface so this class is FORCED to
 * implement method from Interface in hierarachy(interfaceTwo).
 */
class MyExampleClass extends MyAbstractClass {

	@Override
	public void methhod() {
		System.out.println(var);
	}

}

/*
 * Below interface has an abstract method so implemented class needs to
 * implement this method unless and untill it is abstract itself
 */
interface MyInterface {
	public final int var = 9;

	public abstract void methhod();

	public void method2();
}

/*
 * Even if Interface has abstract method ABSTRACT CLASS is not forced to
 * implement it. Abstract class may/may not navigate this responsibility of
 * implementing abstract method to class which is not abstract.
 */
abstract class MyAbstractClass implements MyInterface {

	// Method from Interface is not implemented here

	public void method2() {
		System.out.println("Inside Method2!");
	}

}