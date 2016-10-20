package com.kvvssut.learnings.java.collections.queues;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	
	public static void main(String[] args) {
		Queue<String> myQueue = new LinkedList<String>();
		
		myQueue.offer("abc");
		myQueue.offer("def");
		myQueue.offer("ghi");
		
		
		while (myQueue.peek() != null) {
			System.out.println(myQueue.poll());
		}

	}

}
