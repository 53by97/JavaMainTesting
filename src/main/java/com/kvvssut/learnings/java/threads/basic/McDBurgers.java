package com.kvvssut.learnings.java.threads.basic;

public class McDBurgers {

	private static final int MAX_ITEMS = 30;
	private static final int MAX_DAY_LIMIT = 100;

	private static int itemRemaining = 0;
	private static int dayLimit = MAX_DAY_LIMIT;

	public static synchronized void consume(int items, int orderId) {
		System.out.println("Started processing for orderId : " + orderId
				+ " for items : " + items);

		if (dayLimit == 0) {
			System.out.println("Day limit reached! Terminating orderId : "
					+ orderId);
			return;
		}

		if (items > itemRemaining) {
			if (items > dayLimit) {
				produce(dayLimit, orderId);
				System.out.println("Modified orderId : " + orderId
						+ " Items provided are : "
						+ (items < itemRemaining ? items : itemRemaining)
						+ "\n\n");
				itemRemaining = 0;
				return;
			} else {
				produce(MAX_ITEMS - itemRemaining, orderId);
			}
		}
		itemRemaining -= items;

		System.out.println("Completed processing for orderId : " + orderId
				+ " Items remaining are : " + itemRemaining + "\n\n");
	}

	public static synchronized void produce(int items, int orderId) {

		itemRemaining += items;
		dayLimit -= items;

		System.out.println("Producer - Items filled to : " + itemRemaining
				+ " dayLimit reached to : " + (MAX_DAY_LIMIT - dayLimit));
	}

}
