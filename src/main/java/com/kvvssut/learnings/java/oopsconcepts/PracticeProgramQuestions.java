package com.kvvssut.learnings.java.oopsconcepts;

import java.util.Scanner;

public class PracticeProgramQuestions {

	/*
	 * 1. Input - text Output - "Hello text !" 2. Input - num1, num2 Output -
	 * "Sum is sum, Subtraction is sub, Multiplication is mul, Division is div, Modulus is mod !"
	 * 3. Input - num Output - "Number num is Odd|Even !" 4. Input - num Output
	 * - "Number num is [not] divisible by 5 !" 5. Input - num Output - Print
	 * all digits in the num 6. Input - num Output - Print all digits in the num
	 * serially 7. Input - num Output - "Number num is [not] palindrome !" 8.
	 * Input - text Ouput - "String text is [not] palindrome !" 9. Input - text,
	 * char, replaceChar Ouput replace char with replaceChar in text 10. Print
	 * all 3 digit prime numbers
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a no.");
		int n = sc.nextInt();
		// System.out.println("enter 2 number");
		// int n=sc.nextInt();
		// int n1=sc.nextInt();
		// System.out.println("enter a sting: ");
		// String text = sc.next();
		PracticeProgramQuestions practiceProgramQuestions = new PracticeProgramQuestions();
		// practiceProgramQuestions.helloText1(text);
		// practiceProgramQuestions.arithmeticEvaluationOf2No2(n, n1);
		// practiceProgramQuestions.checkOddEven3(n);
		// practiceProgramQuestions.divisibleByFive4(n);
		// practiceProgramQuestions.allDigitInNumber5(n);
		practiceProgramQuestions.allDigitInNumberSerially6(n);

	}
	
	private void allDigitInNumberSerially6(int num) {
		int var_num = num;
		int size = 0;
		
		while (var_num > 0) {
			size++;
			var_num /= 10;
		}
		
		System.out.println("Size of num: " + size);
		
		int digits_arr [] = new int [size];
		
		for (int i = 0; i < digits_arr.length; i++) {
			System.out.print(i + "-" + digits_arr[i] + " ");
		}
		System.out.println();
		
		int j = 1;
		while (num > 0) {
			int remainder = num % 10;
			digits_arr[size - j++] = remainder;
			System.out.print(remainder + " " + num);
			num /= 10;
			System.out.println(" " + num + " " + (num > 0));
		}
		
		System.out.println("Final digits: ");
		for (int i = 0; i < digits_arr.length; i++) {
			System.out.println(i + "-" + digits_arr[i] + " ");
		}
		
		// TODO Auto-generated method stub

	}

	private void allDigitInNumber5(int num) {
		while (num > 0) {
			int remainder = num % 10;
			System.out.print(remainder + " " + num);
			num = num / 10;
			System.out.println(" " + num + " " + (num > 0));
		}
		// TODO Auto-generated method stub

	}

	private void divisibleByFive4(int num) {
		if (num % 5 == 0) {
			System.out.println("no. is divisible by 5");
		} else {
			System.out.println("no. is not divisible by 5");
		}
		// TODO Auto-generated method stub

	}

	private void checkOddEven3(int num) {

		if (num % 2 == 0) {
			System.out.println("number is even");

		} else {
			System.out.println("no. is odd");
		}
		// TODO Auto-generated method stub

	}

	private void arithmeticEvaluationOf2No2(int num1, int num2) {
		System.out.println("inside method");
		int add, sub, mul, div, mod;
		{
			add = num1 + num2;
			sub = num1 - num2;
			mul = num1 * num2;
			div = num1 / num2;
			mod = num1 % num2;
			System.out.println("addition=" + add);
			System.out.println("substraction=" + sub);
			System.out.println("multiplication=" + mul);
			System.out.println("division=" + div);
			System.out.println("modolus=" + mod);

		}

	}

	private void helloText1(String name) {
		System.out.println("Hello " + name + " !");

	}

}
