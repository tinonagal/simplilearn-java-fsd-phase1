package com.simplilean.multithreading;

public class ABC implements Runnable {

	@Override
	public void run() {
		try {
			// move t2 to time waiting state
			Thread.sleep(100);
		}
		catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		
		System.out.println("State of t1 thread while it invoke join() on t2 thread: " + ThreadState.t1.getState());
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
	}
	}
	

}
