package com.kvvssut.learnings.java.oopsconcepts;

public class ArrayStuffs {

	static int arr[] = new int[6]; // basic initialization way - makes the array
									// length fixed to 6
	final static int[] arr1DValues = { 123, 45, 56, 12, 570, 23 }; // advanced
																	// initialization
	static class Student {
		String name;
		int rollNo;
		int score;
		
		public Student(String name, int rollNo, int score) {
			this.name = name;
			this.rollNo = rollNo;
			this.score = score;
		}
		
		public int getScore() {
			return score;
		}
		public void setScore(int score) {
			this.score = score;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getRollNo() {
			return rollNo;
		}
		public void setRollNo(int rollNo) {
			this.rollNo = rollNo;
		}
	}

	// way only possible
	// during declaration of
	// variable

	public static void main(String[] args) {
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " "); // gets initialized by default to
											// its default values
		}
		System.out.println();
		int len = arr1DValues.length; // saves time as it only computes the
										// array length once
		for (int i = 0; i < len; i++) {
			System.out.print(arr1DValues[i] + " ");
		}
		System.out.println();
		int [] retValues = getMaxAndMinValue(arr1DValues);
		System.out.println("Max val in array is : " + retValues[0]);
		System.out.println("Min val in array is : " + retValues[1]);
		
		// testing student array
		int userInputValue = 3;		// size can be given by user through console, i.e., can be set dynamically
		Student students [] = new Student[userInputValue];
		
		Student student1 = new Student("Nihar", 10, 70);
		Student student2 = new Student("Srimant", 5, 85);
		Student student3 = new Student("Chink", 15, 75);
		
		students[0] = student1;
		students[1] = student2;
		students[2] = student3;
		
		int totalScore = 0;
		for (Student student : students) {
			totalScore += student.getScore();
		}
		int noOfStudents = students.length;
		
		System.out.println("Average Score is : " + averageScore(totalScore, noOfStudents));		// 76.666664
	}
	
	static float averageScore(int totalScore, int noOfStudents) {
		return ((float) totalScore)/noOfStudents;	// int/int - results in integer i.e., 76.0
	}

	public static int[] getMaxAndMinValue(final int[] arrValues) {
		int maxVal = arrValues[0], minVal = arrValues[0];
		int arrLen = arrValues.length;
		for (int i = 0; i < arrLen; i++) {
			if (arrValues[i] > maxVal) {
				maxVal = arrValues[i];
			} else if(arrValues[i] < minVal) {
				minVal = arrValues[i];
			}
			System.out.println("i is [" + i + "] current arrVal is ["
					+ arrValues[i] + "] maxVal is [" + maxVal + "] minVal is [" + minVal + "]");
		}
		return new int[] {maxVal, minVal};
	}
}
