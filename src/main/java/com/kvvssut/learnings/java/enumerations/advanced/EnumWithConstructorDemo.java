package com.kvvssut.learnings.java.enumerations.advanced;

public class EnumWithConstructorDemo {

	public static void main(String[] args) {
		for (ColorWithConstructorEnum color : ColorWithConstructorEnum.values()) {
			System.out.println(color.name() + " - " + color.getColorText());
		}

		System.out.println("\nColor of enum element is : "
				+ ColorWithConstructorEnum.GREEN.getColorText());
		System.out.println("Fill percentage is : "
				+ ColorWithConstructorEnum.GREEN.getFillPercentage());
	}
}
