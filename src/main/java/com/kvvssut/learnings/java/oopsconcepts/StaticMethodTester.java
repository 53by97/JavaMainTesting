package com.kvvssut.learnings.java.oopsconcepts;

public class StaticMethodTester {

	private static StaticMethodTester instance = new StaticMethodTester();

	private static StaticMethodTester getInstance() {
		return instance;
	}

	public static void main(String[] args) {
		StaticMethodTester nullInstance = null;
		System.out.println(nullInstance.getInstance());
	}

}
