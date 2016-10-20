package com.kvvssut.learnings.java.threads.basic;
import java.util.Random;

public class ConsumerThread extends Thread {

	private int orderId;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	@Override
	public void run() {
		int items = new Random().nextInt(15) + 1;
		System.out.println("Processing orderId : " + orderId + " for items : "
				+ items);
		McDBurgers.consume(items, orderId);
	}
}
