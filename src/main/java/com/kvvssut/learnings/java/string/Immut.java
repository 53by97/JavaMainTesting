package com.kvvssut.learnings.java.string;

public class Immut
{
	private final char value[] = {'a','b','c'};

	public static void main(String[] args){
		Immut mut = new Immut();
		char[] val = mut.getValues();
		for ( char c : val){ System.out.print(c + " ");}
		System.out.println();
		mut.setValue(1, 'z');
		val = mut.getValues();
		for ( char c : val){ System.out.print(c + " ");}
	}
	public char[] getValues(){
		return this.value;
	}
	public void setValue(int index, char val){
		value[index] = val;
	}
}