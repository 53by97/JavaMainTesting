package com.kvvssut.learnings.java.oopsconcepts;

import java.math.BigInteger;

public class BasicProgramTest1 {
	public static void main(String[] args) {
		BasicProgramTest1 obj = new BasicProgramTest1();
		// obj.first1000FibonacciNumbers();
		// obj.fibonacciBetween50And1000();

	}

	private void fibonacciBetween50And1000() {
		int a = 0, b = 1, c = 0;

		while (c <= 1000) {
			if (c >= 50) {
				System.out.println(c);
			}
			c = a + b;
			a = b;
			b = c;
		}

	}

	private void first1000FibonacciNumbers() {
		BigInteger a = new BigInteger("0"), b = new BigInteger("1"), c = new BigInteger(
				"0");
		System.out.println(a);
		System.out.println(b);
		for (int i = 0; i < 1000; i++) {
			c = a.add(b);
			System.out.println(i + "  " + c);
			a = b;
			b = c;
		}

	}

}
