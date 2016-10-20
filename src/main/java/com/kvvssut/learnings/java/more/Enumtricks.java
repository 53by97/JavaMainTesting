package com.kvvssut.learnings.java.more;

interface EnumConstants {	// better option
	String DESC = "A String";
}

public enum Enumtricks {
    ELEMENT(EnumConstants.DESC);

    private final String description;

    private Enumtricks(String description) {
        this.description = description;
    }

    public String value() {
        return this.description;
    }

//    private static class EnumConstants {
//        private static final String DESC = "A String";
//    }
}