package com.kvvssut.learnings.java.oopsconcepts;

public class OOPSConcepts {

	public static void main(String[] args) {
		int limit = 10;

	}

	// Overloaded method with two arguments
	public void add(int input1, int input2) {
		System.out.println("In method with two argument");
	}

	// Overloaded method with one argument
	public void add(int input1) {
		System.out.println("In method with one argument");
	}

	private static int flowControlStatement(int limit) {
		for (int i = 0; i < limit; i++) {
			if (i == 3) {
				System.out.println("Continuing.. Skipping below logics!");
				continue;
			}
			if (i == 6) {
				System.out.println("Breaking.. Breaking for loop!");
				break;
			}
			System.out.println(i);
		}
		return 1;
	}

	private static void loopingStatements(int limit) {
		for (int i = 0; i < limit; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		int i = 0;
		while (i < limit) {
			System.out.print(i + " ");
			i++;
		}
		System.out.println();

		i = 0;
		do { // first time it does not check the condition "i < limit" and
				// processes the inner logics
			System.out.print(i + " ");
			i++;
		} while (i < limit);
	}

	private static void ifElseIf_ConditionalExecution(final int var) {
		if (var <= 30) {
			System.out.println("Value is less than 31!");
		} else if (var <= 60) {
			System.out.println("Value is less than 61!");
		} else if (var <= 100) {
			System.out.println("value is less than 101!");
		} else {
			System.out.println("Value is greater than 101!");
		}
	}

	private static void switch_ConditionalExecution(final char var) {
		switch (var) { // we can only use int/short/byte/char case values and
						// switch does not support range checks unlike if-else
		case 'A':
			System.out.println("Character entered is A!");
			break;
		case 'B':
			System.out.println("Character entered is B!");
			break;
		case 'C':
			System.out.println("Character entered is C!");
			break;
		default:
			System.out.println("Wrong option entered!");
		}

	}

	private static void postfixAndPrefixOperators() {
		int a = 5;
		System.out.println(a++); // first gets the current value, then
									// increments and gets reflected when used
									// next time
		System.out.println(a);
		a = 5;
		System.out.println(++a); // first increments and then gets the value
		System.out.println(a);

		// o/p - 5 6 6 6
	}

}
