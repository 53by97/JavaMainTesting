package com.kvvssut.learnings.java.threads.basic;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class ConsumerRunnable implements Runnable {

	private AtomicInteger orderId = new AtomicInteger(1);

	@Override
	public void run() {
		int items = new Random().nextInt(25) + 1;
		McDBurgers.consume(items, orderId.getAndIncrement());
	}
	
}
