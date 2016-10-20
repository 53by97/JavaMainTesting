package com.kvvssut.learnings.java.oopsconcepts;

public class SubClass extends ParentClass {
	// below method is overriding the ParentClass version of show method
	public void show() {
		System.out.println("Show method of Sub class");
		super.show();
	}
	
	public static void main(String[] args) {
		SubClass subClass = new SubClass();
		subClass.show();
	}
}