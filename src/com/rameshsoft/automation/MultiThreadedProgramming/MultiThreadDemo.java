package com.rameshsoft.automation.MultiThreadedProgramming;

class MultiThreadTwo implements Runnable{
	public void run() {
		System.out.println("Child Thread is started");
		for(int i = 0 ; i <= 10 ; i++) {
			Thread.yield();
			System.out.println("Child Thread");
		}
	}
}

public class MultiThreadDemo {
public static void main(String[] args) {
	MultiThreadTwo m = new MultiThreadTwo();
	Thread thread = new Thread(m);
	thread.start();
	System.out.println("Main Thread is started");
	for(int i = 0 ; i <= 10 ; i++) {
		System.out.println("Main Thread");
	}
}
}
