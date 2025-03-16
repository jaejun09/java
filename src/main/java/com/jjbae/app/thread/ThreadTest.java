package com.jjbae.app.thread;

public class ThreadTest {
	public static void main(String[] args) {
		Work[] work = new Work[10];
		
		for (int i = 0; i < work.length; i++) {
			work[i] = new Work(i);
			//work[i].run();
			work[i].start();
		}
	}
}
