package com.simplilearn.collection;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueCollectionExample {

	public static void main(String[] args) {

		Queue<String> stringQueue = new PriorityQueue<>();
		stringQueue.add("John");
		stringQueue.add("Matt");
		stringQueue.add("Toni");
		stringQueue.add("Eric");
		
		System.out.println(stringQueue);
		System.out.println("Head of the queue using element: " + stringQueue.element());
		System.out.println("Head of the queue using peek: " + stringQueue.peek());
		System.out.println("Remove element using remove:" + stringQueue.remove());
		System.out.println(stringQueue);
		
		Iterator queueItr = stringQueue.iterator();
		
		System.out.println("Queue elements using Iterator");
		while(queueItr.hasNext()) {
			System.out.println(queueItr.next());
		}
		
		
	}

}
