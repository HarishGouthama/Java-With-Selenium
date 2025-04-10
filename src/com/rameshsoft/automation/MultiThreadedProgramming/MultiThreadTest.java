package com.rameshsoft.automation.MultiThreadedProgramming;

class ThreadDemo extends Thread{
	
	public void run() {
		
		System.out.println("Java thread is started by child thread");
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println("Java Thread");
		}
	}
}

public class MultiThreadTest {
public static void main(String[] args) {
	ThreadDemo thread = new ThreadDemo();
	thread.start();
	System.out.println("Selenium thread is started");
	for(int j = 0 ; j < 10 ; j++) {
		System.out.println("Selenium Thread");
	}
}
}
