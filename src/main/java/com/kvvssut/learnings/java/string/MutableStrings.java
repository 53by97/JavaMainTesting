package com.kvvssut.learnings.java.string;

public class MutableStrings {

	public static void main(String[] args) {
		StringBuffer buffer;  // all methods are synchronized	//  public final class StringBuffer extends AbstractStringBuilder implements java.io.Serializable, CharSequence
		
		// abstract class AbstractStringBuilder implements Appendable, CharSequence
		
		// AbstractStringBuilder abs;  char[] value;   value = new char[capacity]; 
		// default so cant be used outside java.lang
		
//		 public StringBuffer() {	StringBuffer(String str)
//		        super(16);			 super(str.length() + 16);	 append(str);
//		    }		
		
		
		StringBuilder builder; 	// public final class StringBuilder extends AbstractStringBuilder implements java.io.Serializable, CharSequence
		
//		 public StringBuilder() { 	 StringBuilder(CharSequence seq) {
//		        super(16);			  this(seq.length() + 16);  	 append(seq);
//		    }
		
		
		String string;	// public final class String implements java.io.Serializable, Comparable<String>, CharSequence
		
//		CharSequence charSequence = "String";	// super interface reference subclass object
//		charSequence. can use only- int length(); / char charAt(int index); / CharSequence subSequence(int start, int end); / public String toString();
		
	}

}
