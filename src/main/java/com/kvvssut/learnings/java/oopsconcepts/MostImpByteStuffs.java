package com.kvvssut.learnings.java.oopsconcepts;

public class MostImpByteStuffs {

	byte iAmAByte; // byte is the smallest datatype in java - consists of 8bits
					// - unsigned range is 0 to 2^8, i.e., 0 to 256,
					// signed range is -2^7 to 2^7 - 1, default is signed, so
					// range is -128 to 127

	// by default all members are signed, for unsigned we have to explicitly
	// mentioned unsigned keyword during declaration

	public byte getiAmAByte() {
		return iAmAByte;
	}

	public void setiAmAByte(byte iAmAByte) {
		this.iAmAByte = iAmAByte;
	}

	public void changeMyValue() {
		iAmAByte = 100;
	}

	public static void main(String[] args) {
		MostImpByteStuffs object = new MostImpByteStuffs();
		System.out.println(object.getiAmAByte()); // output -> 0 - 0000 0000// because it
													// is default initialized in
													// default constructor
		object.changeMyValue(); // changes the member value
		System.out.println(object.getiAmAByte()); // output -> 100
		object.setiAmAByte((byte) 126);
		System.out.println(object.getiAmAByte()); // output -> 126
		object.setiAmAByte((byte) (object.getiAmAByte() + 1));
		System.out.println(object.getiAmAByte()); // output -> 127 - 0111 1111 - highest +ive value
		object.setiAmAByte((byte) (object.getiAmAByte() + 1));
		System.out.println(object.getiAmAByte()); // output -> -128 - 1000 0000 - lowest -ive value
		object.setiAmAByte((byte) (object.getiAmAByte() + 1));
		System.out.println(object.getiAmAByte()); // output -> -127 - 1000 0001
		object.setiAmAByte((byte) (object.getiAmAByte() + 1));
		System.out.println(object.getiAmAByte()); // output -> -126
		object.setiAmAByte((byte) 200);
		System.out.println(object.getiAmAByte()); // output -> -56
	}

}
