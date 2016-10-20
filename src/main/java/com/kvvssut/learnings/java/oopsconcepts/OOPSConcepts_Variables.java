package com.kvvssut.learnings.java.oopsconcepts;

public class OOPSConcepts_Variables {

	// all instance variables get loaded in OBJECT MEMORY once per object
	// instance variable - instance represents an object of a class and holds a
	// different memory
	public int var_conctructor; // variable declaration type 1 to be defined
								// inside constructor
	public int var_init_block; // variable declaration type 2 to be defined
								// inside init {}

	public int initialization_var = 15; // variable initialization

	public final long final_var = 20; // final variable initialization type 1
	public final int final_var2; // final variable to be initialized inside
									// constructor
	public final int final_var3; // final variable to be initialized inside init
									// {} to remove redundant initializations #
									// removing duplications

	{ // init block provides redundant variables to be initialized inside
		// multiple constructors // also initializes instance variables
		var_init_block = 15; // variable definition type 2 - used to remove
								// duplicate initialization inside multiple
								// constructors
		final_var3 = 7; // final variable declared inside init {} to remove
						// duplicate code for initialization inside multiple
						// constructors
	}

	public OOPSConcepts_Variables() { // Constructor - Same name as Class name &
										// does not
		// return any value (no return type)
		// initialzes instance variables
		// we have overridden default constructor provided by JVM else default
		// constructor provided by JVM intitailizes instance variables to their
		// default values
		var_conctructor = 10; // variable definition type 1
		final_var2 = 12; // final variable definition type 2 inside constructor
							// # duplicate code
	}

	public OOPSConcepts_Variables(int var_conctructor) { // Parameterized
															// Constructor
		var_conctructor = var_conctructor; // localvar = localvar - assignment
											// has no effect as local variable
											// with same name has more priority
											// than instance variable
		// always JVM provides default constructor when we don't overload a
		// constructor in class
		this.var_conctructor = var_conctructor; // correct way of assigning //
												// this represents current
												// object # variable definition
												// type 1
		final_var2 = 12; // final variable definition type 2 inside constructor
							// # duplicate code
	}

	// static/class variables starts here - all static variables|methods get
	// loaded first in CONTEXT MEMORY and only gets loaded once per class

	public static int static_var1; // static variable initialization
									// type 1 - initializes to default values
	public static int static_var2 = 10; // static variable initialization type 2
	public static int static_var3; // static variable declaration type 3

	static { // initializes static|class variables
		static_var3 = 20; // initialized inside static block
	}

	public static final float PI = 3.14f; // static is used to load in context
											// memory and final is used to make
											// value as constant # hence cannot
											// be changed - mainly used for
											// Universal Constants

	public static void main(String[] args) {
		int a = 5;	// local variable
		System.out.println(static_var1);
		static_var1 = static_var1 + 1;
		System.out.println(static_var1);
		// PI = PI + 1; // cannot be changed|reassigned as its a class level
		// constant i.e., static+final
	}

}
