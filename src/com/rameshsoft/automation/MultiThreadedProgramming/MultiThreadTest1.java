package com.rameshsoft.automation.MultiThreadedProgramming;

class ThreadOne1 extends Thread{
	
	@Override
	public void run() {
		System.out.println("Java Thread started");
		for(int i = 0 ; i <= 10 ; i++) {
			System.out.println("Java Thread");
		}
	}
}

public class MultiThreadTest1 {
public static void main(String[] args) {
	
	ThreadOne1 t = new ThreadOne1();
	t.start();
	System.out.println("main thread default name: " + Thread.currentThread().getName());
	System.out.println("Child thread default name: " + t.getName());
	System.out.println("Main thread default priority: " + Thread.currentThread().getPriority());
	System.out.println("Child thread default priority: " + t.getPriority());
	t.setName("Ramesh");
	System.out.println("Child thread name: " + t.getName());
	Thread.currentThread().setName("Rameshsoft");
	System.out.println("main thread name: " + Thread.currentThread().getName());
	t.setPriority(8);
	System.out.println("Customized priority: " + t.getPriority());
	System.out.println("Selenium thread is started");
	for(int i = 0 ; i <= 10 ; i++) {
		System.out.println("Selenium Thread");
	}
}
}
