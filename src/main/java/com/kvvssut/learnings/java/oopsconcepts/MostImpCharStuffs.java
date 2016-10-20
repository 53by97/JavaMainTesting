package com.kvvssut.learnings.java.oopsconcepts;

public class MostImpCharStuffs {

	char iAmAChar; // char datatype in java - consists of 16bits unsigned bits
					// and range is 0 to 2^16 - 1, so range is 0 to 65535

	public char getiAmAChar() {
		return iAmAChar;
	}

	public void setiAmAChar(char iAmAChar) {
		this.iAmAChar = iAmAChar;
	}

	public void changeMyValue() {
		iAmAChar = 65; // or 'A'
		// iAmAChar = 65536; // max value it can store in a char is 65535, if we assign
		// 65536 gives compilation error as its range is exceeded
	}

	public static void main(String[] args) {
		MostImpCharStuffs object = new MostImpCharStuffs();
		System.out.println(object.getiAmAChar()); // output -> ' ' - white space
													// character, ASCII val is 0
													// because it
													// is default initialized in
													// default constructor
		object.changeMyValue(); // changes the member value
		System.out.println(object.getiAmAChar()); // output -> 'A'
		System.out.println((int) object.getiAmAChar()); // output -> 65 as [A-Z]
														// is [65-90] and [a-z]
														// is [97-122]
		object.setiAmAChar((char) 122);
		System.out.println(object.getiAmAChar()); // output -> 'z'
		object.setiAmAChar((char) (object.getiAmAChar() - 1));
		System.out.println(object.getiAmAChar()); // output -> 'y'
	}

}
