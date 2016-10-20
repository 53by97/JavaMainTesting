package com.kvvssut.learnings.java.oopsconcepts;

import java.util.Scanner;

public class ArrayPrograms {

	public static void main(String[] args) {
		System.out.print("Enter input size in Number: ");
		Scanner scanner = new Scanner(System.in);
		int inputLen = 0;
		inputLen = scanner.nextInt();
		System.out.println("User input length is: " + inputLen);

		int[] values = new int[inputLen];
		System.out.println("Enter values: ");
		for (int i = 0; i < values.length; i++) {
			values[i] = scanner.nextInt();
		}
		scanner.close();
		System.out.println("User input values are: ");
		for (int value : values) {
			System.out.print(value + "  ");
		}
		System.out.println();
		System.out.println("Maximum value in the array is: "
				+ getMaximumValueInArray(values));
		System.out.println("Minimum value in the array is: "
				+ getMinimumValueInArray(values));
		System.out.println("Sorted values in ascending order are: ");
		int[] ascSortedValues = sortArrayInAscOrder(values);
		for (int value : ascSortedValues) {
			System.out.print(value + "  ");
		}
		System.out.println();
		System.out.println("Sorted values in descending order are: ");
		int[] descSortedValues = sortArrayInDescOrder(values);
		for (int value : descSortedValues) {
			System.out.print(value + "  ");
		}
		System.out.println();
	}

	private static int[] sortArrayInAscOrder(int[] values) {
		for (int i = 0; i < values.length - 1; i++) {
			for (int j = i + 1; j < values.length; j++) {
				if (values[i] > values[j]) {
					int temp = values[j];
					values[j] = values[i];
					values[i] = temp;
				}
			}
		}
		return values;
	}

	private static int[] sortArrayInDescOrder(int[] values) {
		for (int i = 0; i < values.length - 1; i++) {
			for (int j = i + 1; j < values.length; j++) {
				if (values[i] < values[j]) {
					int temp = values[j];
					values[j] = values[i];
					values[i] = temp;
				}
			}
		}
		return values;
	}

	private static int getMinimumValueInArray(int[] values) {
		int minValue = Integer.MAX_VALUE;
		for (int i = 0; i < values.length; i++) {
			if (values[i] < minValue) {
				minValue = values[i];
			}
		}
		return minValue;
	}

	private static int getMaximumValueInArray(int[] values) {
		int maxValue = Integer.MIN_VALUE;
		for (int i = 0; i < values.length; i++) {
			if (values[i] > maxValue) {
				maxValue = values[i];
			}
		}
		return maxValue;
	}

}
