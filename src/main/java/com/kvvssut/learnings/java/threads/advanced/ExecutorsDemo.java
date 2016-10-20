package com.kvvssut.learnings.java.threads.advanced;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.kvvssut.learnings.java.threads.basic.ConsumerRunnable;

public class ExecutorsDemo {

	public static void main(String[] args) {

		ConsumerRunnable runnable = new ConsumerRunnable();

		// ExecutorService executor = Executors.newSingleThreadExecutor();
		ExecutorService executor = Executors.newFixedThreadPool(10);
		executor.submit(runnable);
		executor.submit(runnable);
		executor.submit(runnable);
		executor.submit(runnable);
		executor.submit(runnable);
		executor.submit(runnable);
		executor.submit(runnable);
		executor.submit(runnable);
		executor.submit(runnable);
		executor.submit(runnable);

		executor.shutdown();

	}

}
