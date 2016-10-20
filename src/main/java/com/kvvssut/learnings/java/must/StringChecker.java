package com.kvvssut.learnings.java.must;

public class StringChecker {

	public static void main(String[] args) {

		/*
		 * public int hashCode() {		
        int h = hash;
        if (h == 0 && value.length > 0) {
            char val[] = value;

            for (int i = 0; i < value.length; i++) {	// completely dependent on String's char value[]
                h = 31 * h + val[i];					
            }
            hash = h;
        }
        return h;
    }
		 */

		/*
		 *     public boolean equals(Object anObject) {
        if (this == anObject) {
            return true;
        }
        if (anObject instanceof String) {
            String anotherString = (String) anObject;
            int n = value.length;
            if (n == anotherString.value.length) {
                char v1[] = value;
                char v2[] = anotherString.value;
                int i = 0;
                while (n-- != 0) {		// compares both the Strings character by character
                    if (v1[i] != v2[i])
                            return false;
                    i++;
                }
                return true;
            }
        }
        return false;
    }
		 */

		String str01 = "Srimant";
		String str02 = "" + "Srimant";
		System.out.println(str01 == str02);	// returns true i.e., searches in String pool after concatenation 
		System.out.println();

		String str11 = "Sahu";
		String str12 = "Sa" + "hu";
		System.out.println(str11 == str12); 	// returns true i.e., searches exact String after concatenation
		System.out.println();

		long tmpid = 12345;
		String str21 = "" + tmpid;
		String str22 = String.valueOf(tmpid);	// returns new String object, uses Long.toString()
		String str23 = Long.toString(tmpid);	
		System.out.println(str21 == str22);
		System.out.println(str21 == str23);
		System.out.println(str22 == str23);
		System.out.println();


	}

}
