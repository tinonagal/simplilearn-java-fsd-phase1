package com.simplilean.multithreading;

public class ThreadExample2 {

	public static void main(String[] args) {
		System.out.println("Running a runnable class");
		
		RunnableClass runnableClass = new RunnableClass();
		Thread thread = new Thread(runnableClass);
		
		thread.start();
	}

}
