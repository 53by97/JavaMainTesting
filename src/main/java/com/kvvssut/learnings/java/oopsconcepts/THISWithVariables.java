package com.kvvssut.learnings.java.oopsconcepts;
class THISWithVariables {
 
	int variable = 5;
 
	public static void main(String args[]) {
		THISWithVariables obj = new THISWithVariables();
 
		obj.method(20);
		obj.method();
	}
 
	void method(int variable) {
		variable = 10;
		System.out.println("Value of Instance variable :" + this.variable);
		System.out.println("Value of Local variable :" + variable);
	}
 
	void method() {
		int variable = 40;
		System.out.println("Value of Instance variable :" + this.variable);
		System.out.println("Value of Local variable :" + variable);
		
		this.variable = 15;
		System.out.println("Value of Instance variable :" + this.variable);
		System.out.println("Value of Local variable :" + variable);
	}
}