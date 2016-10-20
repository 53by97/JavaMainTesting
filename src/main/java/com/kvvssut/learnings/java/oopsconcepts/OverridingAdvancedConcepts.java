package com.kvvssut.learnings.java.oopsconcepts;

public class OverridingAdvancedConcepts {

	static class Parent {
		public String method() {
			return "Inside Parent method()";
		}
	}

	static class Child extends Parent {
		@Override
		public String method() {
			return "Inside Child method()";
		}
	}

	static class SubChild extends Child {

	}

	static class SubSubChild extends SubChild {
		@Override
		public String method() {
			return "Inside SubSubChild method()";
		}
	}

	public static void main(String[] args) {
		System.out.println(new Parent().method());
		System.out.println(new Child().method());
		System.out.println(new SubChild().method()); // calls the immediate
														// super class method
														// implementation found
														// when it doesn't get a
														// local implementation
														// of inheriting method
		System.out.println(new SubSubChild().method());
	}

}
