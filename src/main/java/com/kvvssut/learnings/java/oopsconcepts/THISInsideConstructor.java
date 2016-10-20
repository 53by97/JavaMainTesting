package com.kvvssut.learnings.java.oopsconcepts;

class THISInsideConstructor {

	THISInsideConstructor() {
		this("JBT");
		System.out.println("Inside Constructor without parameter");
	}

	THISInsideConstructor(String str) {
		System.out
				.println("Inside Constructor with String parameter as " + str);
	}

	public static void main(String[] args) {
		THISInsideConstructor obj = new THISInsideConstructor();
	}
}