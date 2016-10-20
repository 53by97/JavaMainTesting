package com.kvvssut.learnings.java.threads.basic;

public class ConsumerProducerMain {

	public static void main(String[] args) {
		ConsumerThread[] threads = new ConsumerThread[3];
		int i = 1;

		for (ConsumerThread thread : threads) {
			thread = new ConsumerThread();
			thread.setOrderId(i++);
			thread.start();
		}

		ConsumerRunnable[] runnables = new ConsumerRunnable[3];

		for (ConsumerRunnable runnable : runnables) {
			runnable = new ConsumerRunnable();
			new Thread(runnable).start();
		}

	}
}
