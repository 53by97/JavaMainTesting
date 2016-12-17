package com.kvvssut.learnings.java.oopsconcepts;

public class MainTesting {

	public static void main(String[] args) {
		System.out.println(-10 % -3); // -1
		
		System.out.println("sri:ma.nt:sa:hu.j".replaceAll("[:.]", "-"));
		
		method(1);
		

		System.out.println(getLog2OfArrayLength(10));
	}
	
	public static int getLog2OfArrayLength(int length) {
		int log2OfLength = 0;
		while (length > 0) {
			log2OfLength++;
			length /= 2;
		}
		return log2OfLength;
	}
	
	public static void method(int i, String... args) {
		for (String arg : args) {
			System.out.println(arg);
		}
		
		System.out.println("No errors");
	}
}
