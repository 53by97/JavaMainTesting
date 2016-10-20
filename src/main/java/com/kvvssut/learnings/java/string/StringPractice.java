package com.kvvssut.learnings.java.string;

import java.util.StringTokenizer;

public class StringPractice {
	
	String string = "abc"; // equivalent to char[] data = {'a','b','c'}; & new String(data);
	
//	/** The value is used for character storage. */
//    private final char value[];
//
//    /** Cache the hash code for the string */
//    private int hash; // Default to 0
	
	
//	public int hashCode() {
//        int h = hash;
//        if (h == 0 && value.length > 0) {
//            char val[] = value;
//
//            for (int i = 0; i < value.length; i++) {
//                h = 31 * h + val[i];
//            }
//            hash = h;
//        }
//        return h;
//    }
	
	
//	 public boolean equals(Object anObject) {
//	        if (this == anObject) {
//	            return true;
//	        }
//	        if (anObject instanceof String) {
//	            String anotherString = (String) anObject;
//	            int n = value.length;
//	            if (n == anotherString.value.length) {
//	                char v1[] = value;
//	                char v2[] = anotherString.value;
//	                int i = 0;
//	                while (n-- != 0) {
//	                    if (v1[i] != v2[i])
//	                            return false;
//	                    i++;
//	                }
//	                return true;
//	            }
//	        }
//	        return false;
//	    }
	
	
	// String- private final char value[]; is immutable because doesn't have any setter method to modify its value & final so only one time initialization
	
	public final static String NEW_LINE = System.getProperty("line.separator"); // best approach
	
	private void betterNewLine() {
		String str = "Hello World";
		
		/*1*/	str = str + "\n";
			
		/*2*/	str = str + '\n'; // optimized
	}
	
	
	private void betterInitialization() {
		String str;

		/*1*/	str = "Hello World"; // optimized
		
		/*2*/ 	str = new String("Hello World");
		
	}
	
	
	private void stringTokenizer() {
		StringTokenizer tokenizer = new StringTokenizer("any string text", "any delimiter"); 	// obsolete usage
		while (tokenizer.hasMoreTokens()) {
			System.out.println(tokenizer.nextToken());	
		}
		
		String [] tokens = "any string".split(" any regex");	// used in place of above
	}
	
}
