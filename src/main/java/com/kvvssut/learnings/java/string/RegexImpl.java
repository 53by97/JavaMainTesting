package com.kvvssut.learnings.java.string;

import java.util.Arrays;

public class RegexImpl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// System.out.println(Arrays.toString("I am 53by97 but by 79 and 59".split("")));	// [, I,  , a, m,  , 5, 3, b, y, 9, 7,  , b, u, t,  , b, y,  , 7, 9,  , a, n, d,  , 5, 9]
		 // System.out.println(Arrays.toString("I am 53by97 but by 79 and 59".split(" ")));	// [I, am, 53by97, but, by, 79, and, 59]
		/* System.out.println(Arrays.toString("I am 53by97 \n but by \n 79 and 59".split(" ")));	
		*[I, am, 53by97, 
		, but, by, 
		, 79, and, 59]
		*/
		/* System.out.println(Arrays.toString("I am 53by97 \n but by \n 79 and 59".split("\\d")));
		}[I am , , by, ,  
		 but by 
		 , ,  and ]
	*/
		
		 System.out.println(Arrays.toString("I am 53by97 \n but by \n 79 and 59".split("\\s")));
		
	}

}
