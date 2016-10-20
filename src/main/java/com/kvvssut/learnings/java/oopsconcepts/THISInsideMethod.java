package com.kvvssut.learnings.java.oopsconcepts;

class THISInsideMethod {

	public static void main(String[] args) {
		THISInsideMethod obj = new THISInsideMethod();
		obj.methodTwo();
	}

	void methodOne() {
		System.out.println("Inside Method ONE");
	}

	void methodTwo() {
		System.out.println("Inside Method TWO");
		this.methodOne();// same as calling methodOne()
	}
}