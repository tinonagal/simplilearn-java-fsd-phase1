package com.simplilearn.multithreading.synchronization;

public class Thread1 extends Thread {
	TableWithSynchronizedMethod t;
	
	Thread1(TableWithSynchronizedMethod t){
		this.t = t;
	}

	public void run() {
		t.printTable(5);
	}

}
