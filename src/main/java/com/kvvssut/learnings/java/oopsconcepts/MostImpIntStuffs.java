package com.kvvssut.learnings.java.oopsconcepts;

public class MostImpIntStuffs {

	int iAmAnInt; // int datatype in java - consists of 32bits
					// signed range is -2^31 to 2^31 - 1, default is signed, so
					// range is -2,147,483,648 to 2,147,483,647

	// by default all members are signed, for unsigned we have to explicitly
	// mentioned unsigned keyword during declaration

	public int getiAmAnInt() {
		return iAmAnInt;
	}

	public void setiAmAnInt(int iAmAnInt) {
		this.iAmAnInt = iAmAnInt;
	}

	public void changeMyValue() {
		iAmAnInt = 100000;
	}

	public static void main(String[] args) {
		MostImpIntStuffs object = new MostImpIntStuffs();
		System.out.println(object.getiAmAnInt()); // output -> 0 - 0000 0000
													// 0000 0000 0000 0000 0000
													// 0000// because it
													// is default initialized in
													// default constructor
		object.changeMyValue(); // changes the member value
		System.out.println(object.getiAmAnInt()); // output -> 100000
		object.setiAmAnInt(2147483646);
		System.out.println(object.getiAmAnInt()); // output -> 2147483646
		object.setiAmAnInt((object.getiAmAnInt() + 1));
		System.out.println(object.getiAmAnInt()); // output -> 2147483647 - 0111
													// 1111 1111 1111 1111 1111
													// 1111 1111 - highest +ive
													// value
		object.setiAmAnInt((object.getiAmAnInt() + 1));
		System.out.println(object.getiAmAnInt()); // output -> -2147483648- 1000
													// 0000 0000 0000 0000 0000
													// 0000 0000 - lowest -ive
													// value
		object.setiAmAnInt((object.getiAmAnInt() + 1));
		System.out.println(object.getiAmAnInt()); // output -> -2147483647- 1000
													// 0000 0000 0000 0000 0000
													// 0000 0001
		object.setiAmAnInt((object.getiAmAnInt() + 1));
		System.out.println(object.getiAmAnInt()); // output -> -2147483646- 1000
													// 0000 0000 0000 0000 0000
													// 0000 0010
		// to print values in binary
		System.out.println(Integer.toBinaryString(object.getiAmAnInt())); // output
																			// ->
																			// 10000000000000000000000000000010
		// to represent negative no. computer takes 2's compliment of the
		// positive counterpart

		// printing a long value in binary -2^63 to 2^63 - 1
		System.out.println(Long.toBinaryString(-1)); // 1111111111111111111111111111111111111111111111111111111111111111
		object.setiAmAnInt(-5);
		System.out.println(object.getiAmAnInt());
		System.out.println(Long.toBinaryString(object.getiAmAnInt())); // output
																		// ->
																		// 11111111
																		// 11111111
																		// 11111111
																		// 11111111
																		// 11111111
																		// 11111111
																		// 11111111
																		// 11111011
	}

}
