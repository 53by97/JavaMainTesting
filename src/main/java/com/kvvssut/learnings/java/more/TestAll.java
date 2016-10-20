package com.kvvssut.learnings.java.more;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


//abstract final class Test {		// can be either abstract or final
//	
//}

//  In Java integers in the range -128..127 are cached beforehand, so no Integer Objects are created for these.
// 	max value for Integer cache is configurable using property- java.lang.Integer.IntegerCache.high


public class TestAll {
	
	private B b;
	
	public class A {
		
	}
	
	
	public static String abc="b";
	
	public static void main(String[] args) {
		
		//Comparator<T>
		String abc = "a";
		System.out.println(Integer.SIZE);
		
		File file = new File("loc");
		FileReader fileReader = null;
		try {
			fileReader = new FileReader(file);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		try {
			System.out.println(Integer.SIZE);
		} catch (Exception e) {
			// TODO: handle exception
		} finally{
			try {
				bufferedReader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				fileReader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		System.out.println(abc);
		
	}
	

}


class B {
	private TestAll testall;
	
}
