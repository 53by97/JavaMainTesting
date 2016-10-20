package com.kvvssut.learnings.java.oopsconcepts;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class BasicPrograms extends Object {

	public static void main(String[] args) throws NumberFormatException,
			IOException {

		/*
		 * System.out.println("Enter numbe rto find factorial: ");
		 * BufferedReader reader = new BufferedReader(new InputStreamReader(
		 * System.in)); final int input = Integer.valueOf(reader.readLine());
		 */

		// final String input = reader.readLine();


	}

	private static void armstrongNumber(int input) {
		int input_value = input;
		int computed_value = 0;
		
		while (input_value > 0) {
			int lastdigit = input_value % 10;
			computed_value += lastdigit * lastdigit * lastdigit;
			input_value /= 10;
			System.out.println(computed_value);
		}
		
		if (computed_value == input) {
			System.out.println("Armstrong number!");
		} else {
			System.out.println("Not an Armstrong number!");
		}
	}

	private static void basicCollections() {
		List<String> list = new ArrayList<String>();
		list.add("Nihar");
		list.add("Srimant");
		list.add("Nihar");

		for (String value : list) {
			System.out.println(value);
		}

		System.out.println("\n\n");

		Set<String> set = new HashSet<String>();
		set.add("Nihar");
		set.add("Srimant");
		set.add("Nihar");

		for (String value : set) {
			System.out.println(value);
		}

		System.out.println("\n\n");

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Nihar", 5);
		map.put("Srimant", 100);
		map.put("Nihar", 15);

		for (String key : map.keySet()) {
			System.out.println("key is: " + key + " value is " + map.get(key));
		}
	}

	private static void isPrime(int input) {
		boolean falg = true;

		for (int i = 2; i < input; i++) {
			if (input % i == 0) {
				System.out.println(i);
				falg = false;
				break;
			}
		}

		if (falg) {
			System.out.println("Number is prime");
		} else {
			System.out.println("number is not prime");
		}
	}

	private static void getStringPalindrome(final String input) {
		int length = input.length();
		int lengthby2 = length / 2;

		boolean flag = true;

		for (int i = 0; i < lengthby2; i++) {
			System.out.println(input.charAt(i) + " "
					+ input.charAt(length - i - 1));
			if (input.charAt(i) != input.charAt(length - i - 1)) {
				flag = false;
				break;
			}
		}

		if (flag) {
			System.out.println("Palindrome!!");
		} else {
			System.out.println("Not a palindrome!");
		}
	}

	private static void getNumPalindrome(final int input) {
		int inputnum = input;
		int inputrev = 0;
		while (inputnum > 0) {
			inputrev = inputrev * 10 + inputnum % 10;
			inputnum = inputnum / 10;

		}

		if (inputrev == input) {
			System.out.println("no. is pallindrome" + inputrev);
		} else {
			System.out.println("not pallindrome" + inputrev);
		}
	}

	private static void getFirstNFibonacciSeries(int input) {
		int a = 0, b = 1, c;
		System.out.println(a);
		System.out.println(b);
		for (int i = 0; i < input - 2; i++) {
			c = a + b;
			System.out.println(c);
			a = b;
			b = c;
		}
	}

	private static void getFactorial(int input) {
		int output = 1;
		for (int i = 1; i <= input; i++) {
			output = output * i;
		}

		System.out.println(output);
	}

	int[] arr;
	{
		arr = new int[] { 56, 89, 9, 2, 54, 34, 34, 78, 67 };
	}

	private static void getFifthHighest(int arr[]) {
		int fH = -1, sH = -1, tH = -1, frh = -1, fif = -1;
		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];
			if (num >= fH) {
				fif = frh;
				frh = tH;
				tH = sH;
				sH = fH;
				fH = num;
			} else if (num >= sH) {
				fif = frh;
				frh = tH;
				tH = sH;
				sH = num;
			} else if (num >= tH) {
				fif = frh;
				frh = tH;
				tH = num;
			} else if (num >= frh) {
				fif = frh;
				frh = num;
			} else if (num > fif) {
				fif = num;
			}
			System.out
					.println(fH + " " + sH + " " + tH + " " + frh + " " + fif);
		}
		System.out.println(fif);
	}

}
