package com.simplilean.multithreading;

public class ThreadExample1 {

	public static void main(String[] args) {
		
		System.out.println("Using thread by extend Thread class");

		ThreadClass threadclass = new ThreadClass();
		threadclass.start();
		
		System.out.println("Running a runnable class");
		
		RunnableClass runnableClass = new RunnableClass();
		Thread thread = new Thread(runnableClass);
		
		thread.start();
	}

}
