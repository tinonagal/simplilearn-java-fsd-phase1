package com.simplilearn.multithreading.synchronization;

public class Thread2 extends Thread{
	TableWithSynchronizedMethod t;
	
	Thread2(TableWithSynchronizedMethod t){
		this.t =t;
	}

	public void run() {
		t.printTable(100);
	}
}
