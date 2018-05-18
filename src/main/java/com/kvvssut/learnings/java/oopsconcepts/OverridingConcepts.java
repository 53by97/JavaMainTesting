package com.kvvssut.learnings.java.oopsconcepts;

import java.io.IOException;

public class OverridingConcepts {

	class Animal {
		public String eatingHabits() {
			return "Omnivorous";
		}

		protected void visibilityTest() {
		}
	}

	class Cow extends Animal {
		/*void visibilityTest() { // cannot reduce the visibility while
								// overriding - for protected parent method it can
								// be public or protected in child method and not default
			// Visibility Hierarchy -> public > protected > default > private
		}*/

		public String eatingHabits() {
			return "Herbivorous";
		}

	}

	class Tiger extends Animal {
		public String eatingHabits() {
			return "Carnivorous";
		}
	}

	class Human extends Animal {
	}

	public static void main(String[] args) {
		OverridingConcepts object = new OverridingConcepts();
		System.out.println(object.new Animal().eatingHabits());
		System.out.println(object.new Cow().eatingHabits()); // overriding
																// Animals
																// definition
		System.out.println(object.new Tiger().eatingHabits()); // overriding
																// Animals
																// definition
		System.out.println(object.new Human().eatingHabits()); // inheriting
																// Animals
																// (parent
																// class)
																// implementation
	}

	
	class Parent {
		public Parent getParentInstance() {
			return new Parent();
		}

		public void exceptions() throws Exception {
		}
	}

	class Child extends Parent {
		@Override
		public Child getParentInstance() { // return type can be same as parent
											// methods
			// return type or a sub-type of it
			return new Child();
		}

		@Override
		public void exceptions() throws IOException { // same exception // no
														// exceptions // child
														// checked exceptions //
														// other runtime
														// exceptions
		}
	}

	
}
