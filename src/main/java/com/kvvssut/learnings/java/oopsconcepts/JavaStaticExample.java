package com.kvvssut.learnings.java.oopsconcepts;

public class JavaStaticExample {

	static int i = 10;

	static void method() {
		System.out.println("Inside Static method");
	}

	public static void main(String[] args) {

		// Accessing Static method
		JavaStaticExample.method();

		// Accessing Static Variable
		System.out.println(JavaStaticExample.i);

		/*
		 * No Instance is required to access Static Variable or Method as we
		 * have seen above. Still we can access the same static variable and
		 * static method using Instace references as below.
		 */
		JavaStaticExample obj1 = new JavaStaticExample();

		/*
		 * Accessing static variable in Non Static way. Compiler will warn you
		 * with below warning.
		 * 
		 * The static field JavaStaticExample.i should be accessed in a static
		 * way.
		 */
		System.out.println(obj1.i);
		// Accessing static method using reference.
		// Warning by compiler
		// "The static method method() from the type JavaStaticExample should be accessed in a static way"
		obj1.method();
	}
}