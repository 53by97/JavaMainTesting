package com.kvvssut.learnings.java.oopsconcepts;

public class TestExecutionOrder {

	// instance block 1 -
	{
		System.out.println("instance block 1 - before default constructor");
	}

	// default constructor
	TestExecutionOrder() {
		System.out.println("default constructor of TestExecutionOrder class");
	}

	// static block 1 -
	static {
		System.out.println("static block 1 - after default constructor");
	}

	// instance block 2 -
	{
		System.out.println("instance block 2 - in between static block 1 & 2");
	}

	// static block 2 -
	static {
		System.out.println("static block 2 - after instance block 2");
	}

	// display method to print message to console
	void displayMethod() {
		System.out.println("simple display() method to print message and read execution order");
	}

	// main() method - entry point to JVM
	public static void main(String[] args) {
		System.out.println("main() method - entry point to JVM");
		TestExecutionOrder teo = new TestExecutionOrder();
		teo.displayMethod(); // invoking displayMethod();
	}
}