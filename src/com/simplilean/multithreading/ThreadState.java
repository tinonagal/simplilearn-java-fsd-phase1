package com.simplilean.multithreading;

public class ThreadState implements Runnable {
	
	public static Thread t1;
	public static ThreadState obj;
	
	public static void main(String[] args) {
		obj = new ThreadState();
		t1 = new Thread(obj);
		
		System.out.println("State of thread t1 after spawning: " + t1.getState());	
		
		t1.start();
		
		System.out.println("State of thread t1 after invoking start(): " + t1.getState());	
	
	}
	
	public void run() {
		ABC abc = new ABC();
		Thread t2 = new Thread(abc);
	
		System.out.println("State of thread t2 after spawning: " + t2.getState());	
		
		t2.start();
		
		System.out.println("State of thread t2 after invoking start(): " + t2.getState());	
		
		try {
			// move t1 to time waiting state
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("The state of t2 Thread after invoking sleep(): " + t2.getState());
		
		try {
			// waiting for t2 to complete execution
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("The state of t2 Thread upon completing execution: " + t2.getState());

	}
}
