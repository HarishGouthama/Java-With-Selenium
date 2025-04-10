package com.rameshsoft.automation.MultiThreadedProgramming;

class MultiThreadOne implements Runnable{
public void run() {
	System.out.println("Child thread is started");
	for(int i = 0 ; i <= 10 ; i++) {
		System.out.println("Child thread");
	}
}
}

public class MultiThreadTest2 {
public static void main(String[] args) {
	MultiThreadOne m = new MultiThreadOne();
	Thread t = new Thread(m);
	t.start();
	//t.run();
	
	System.out.println("main thread is started");
	for(int j = 0 ; j <= 10 ; j++) {
		System.out.println("Main Thread");
	}
}
}
