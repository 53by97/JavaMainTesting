package com.kvvssut.learnings.java.oopsconcepts;

import java.io.IOException;

public class OverloadingConcepts {

	public static void main(String[] args) throws Exception {
		OverloadingConcepts object = new OverloadingConcepts();

		object.printValues("Nihar", " Ranjan");

		object.printValues(12345, " Nihar");

		object.printValues(12345, " Nihar ", 123456789);

		// object.addValues(12, 15233); // Compilation error - ambiguous method
		// call, unable to know which method to
		// link as both int,long and long,int
		// are possible for method call with
		// int,int values

		object.addValues(12, 31312l); // to resolve ambiguity append l to number
										// to make it long
		object.addValues(12l, 321312);

	}

	public long addValues(int a, long l) {
		return l + a;
	}

	public int addValues(long l, int a) { // typecasted to convert long value to
											// int return value
		return (int) l + a;
	}

	public String printValues(String str1, String str2) { // overloading is not
															// dependent on
															// exception lists
		String outcome = str1 + str2;
		System.out.println(outcome);
		return outcome;
	}
	
	public int printValues(int a, String s) throws Exception { // object +
																// string value
																// ===
		// object.toString() + string
		// value // toString() gets
		// implicitly called
		System.out.println(a + s); // === new Integer(a) + s === new
									// Integer(a).toString() + s
		return 0;
	}

	public void printValues(int a, String s, long l) throws IOException { // no
																			// return
																			// stmt
																			// as
		// return type is void
		System.out.println(a + s + l);
	}

	/*
	 * public static int main(String[] args) { // not overloading main method as
	 * // argument list is same, will throw // compilation error if overloaded
	 * // with void main(String[] args) method
	 * 
	 * return 0; }
	 */

	public static void main(Integer[] args) { // overloaded main method,
												// argument type is different

	}
}
