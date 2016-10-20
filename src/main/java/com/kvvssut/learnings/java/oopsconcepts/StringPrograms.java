package com.kvvssut.learnings.java.oopsconcepts;

import java.util.Scanner;

public class StringPrograms {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a Stirng");
		String input = sc.next();
		int index = 0;
		for (int i = 0; i < input.length(); i++) {
             char ch=input.charAt(i);
             if (ch>=48 && ch<=57) {
				index = i;
				break;
			}
		}
		
		String startString = input.substring(0, index), endString = input.substring(index);
		
		int val = Integer.valueOf(endString) + 1;
		
		System.out.println(startString + val);
		
		sc.close();
	}

}
