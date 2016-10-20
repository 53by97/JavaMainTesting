package com.kvvssut.learnings.java.more;

import java.util.List;

import javax.inject.Inject;

public class MixedUtilities {
	
	private void checkWhiteSpace() {
		System.out.println(Character.isWhitespace(' '));
		//System.out.println(5 % 0);	 // java.lang.ArithmeticException: / by zero
	}
	
	
	private boolean isPalindrome(String str) {
		int length = str.length();
		int limit = length / 2;
		for (int forward = 0, backward = length -1; forward < limit; forward++, backward--) {
			if(str.charAt(forward) != str.charAt(backward)){
				return false;
			}
		}
		return true;
		
		// int forward = ? 		<- cant have two local variables with same name 
		// for(;;){}			<- infinite looping same as while(true) {}
	}
	
public static void main(String[] args) {
	System.out.println(fibonacci(2));
}
	
	private static int fibonacci(int x) {
		if(x == 0) { return 0; }
		if(x == 1) { return 1; }
		return fibonacci(x -1) + fibonacci(x - 2);	// guard clauses to break from infinite looping
	}
	
	
	private boolean isFound(List<List<String>> table, String target) {
		boolean found  = false;
		search:
			for (List<String> row : table) {
				for (String value : row) {
					if(value.equals(target)){
						found = true;
						break search;	// breaks the outer loop labeled as search
					}					// Java also supports labeled continue 	<- transfers control to labeled loop condition
				}
			}
		return found;
	}
	
	
	private void castingOfObjectToReferenceType() {
		
		MixedUtilities utilities = new MixedUtilities();
		
		Object obj = utilities;
		
		MixedUtilities utilities2 = (MixedUtilities) obj;	// needs explicit type-casting
									// casting only creates a new reference type to the same memory location
		
		// java.util.List only allows objects to be added in the argument, to add primitive type it has to be converted into appropriate wrapper class object
	}
	
	
	private class Checkout {
		   private final ShoppingCart cart;		// Constructor injection creates immutable bean classes

		   @Inject
		   public Checkout(ShoppingCart cart) {
		      this.cart = cart;
		   }
		   private class ShoppingCart { }		// bean class
		}
	
	
	
	
}
