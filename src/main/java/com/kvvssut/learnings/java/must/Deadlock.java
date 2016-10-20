package com.kvvssut.learnings.java.must;

public class Deadlock {
	
	private String id;
	
	public Deadlock(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	
	private synchronized void checkOther(Deadlock other) {
		System.out.println("Entering - " + Thread.currentThread().getName());
		
		try {
			Thread.sleep(1000);		
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		
		System.out.println("Calling other on - " + other.getId());
		
		other.action();
		
		System.out.println("Leaving - " + Thread.currentThread().getName());
	}

	private synchronized void action() {
		System.out.println("Inside action - " + Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		final Deadlock obj1 = new Deadlock("obj1");
		final Deadlock obj2 = new Deadlock("obj2");
		
		Runnable run1 = new Runnable() {
			
			@Override
			public void run() {
				obj1.checkOther(obj2);
			}
		};
		
		Thread thread1 = new Thread(run1, "Thread1");
		thread1.start();
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		
		
		Runnable run2 = new Runnable() {
			
			@Override
			public void run() {
				obj2.checkOther(obj1);
			}
		};
		
		Thread thread2 = new Thread(run2, "thread2");
		thread2.start();
		
		System.out.println("Leaving Main!!");
		

	}

}
