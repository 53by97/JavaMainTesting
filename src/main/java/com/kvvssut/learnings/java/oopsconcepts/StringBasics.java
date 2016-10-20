package com.kvvssut.learnings.java.oopsconcepts;

public class StringBasics {
	
	public static void main(String[] args) {
	//	String name = "Nihar";	/*equivalent to*/ char [] myName = {'N', 'i', 'h', 'a', 'r'};
		
		String str0 = "First"; 	//1 creates a string object with "First" as value and stores in string pool	
		String str1 = "First";	// uses the same "First" objects from string pool
		String str2 = "Second";	//2 creates a string object with "Second" as value and stores in string pool
		String str3 = new String("Second");	//3 here we are explicitly creating another string object for Second value
		String str4 = str1 + str2;	//4 creates another string object with value "FirstSecond"
		String str5 = "First" + "Second"; // uses object created in str4
		
		// Question - How many objects got created ?
		// Answer - 4
	}

}
