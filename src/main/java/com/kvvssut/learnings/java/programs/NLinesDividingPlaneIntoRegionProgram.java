package com.kvvssut.learnings.java.programs;

import java.util.Scanner;

/**
 * @author Srimanta Sahu
 * 
 *         Formula :- N(n)=1/2(n^2+n+2)
 *
 */
public class NLinesDividingPlaneIntoRegionProgram {

	public static void main(String[] args) {
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
			int lines = scanner.nextInt();

			int totalRegions = (lines * lines + lines + 2) / 2;

			System.out.println(totalRegions);

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}

	}

}
