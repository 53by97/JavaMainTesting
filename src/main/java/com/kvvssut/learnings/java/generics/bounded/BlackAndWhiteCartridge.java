package com.kvvssut.learnings.java.generics.bounded;

public class BlackAndWhiteCartridge implements ICartridge {

	@Override
	public String toString() {
		return "balck and white";
	}

	@Override
	public int getFillPercentage() {
		return 50;
	}

}
