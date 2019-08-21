/**
 * 
 */
package com.tamil.learn.java.basics.concurrency;

import static com.tamil.learn.java.basics.vo.AnsiColor.ANSI_BLUE;
import static com.tamil.learn.java.basics.vo.AnsiColor.ANSI_CYAN;
/**
 * @author atpsmnn
 *
 */
public class ThreadsExample1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(ANSI_BLUE+"Main class starts & trigger the threads");
		PrimaryThread thread1 = new PrimaryThread();
		thread1.setName("Primary Thread");
		SecondThread thread2 = new SecondThread();
		thread2.setName("Second Thread");
		
		thread1.start(); //Primary thread instance is executed
		thread2.run(); //Runs in the main thread not on a new thread instance
		//thread1.start(); - java.lang.IllegalThreadStateException - can't start the same thread again
		Thread thread3 = new Thread(new PrimaryRunnable());
		thread3.start();
		
		Thread thread4 = new Thread(new PrimaryRunnable() {
			@Override
			public void run() {
				System.out.println(ANSI_CYAN + String.format("Primary Runnable anonymous impl in main class- %s", "Thread 4"));
				try {
					thread1.join();
					//thread1.join(2000);
					System.out.println(ANSI_CYAN + thread1.getName() + " is "+ thread1.getState().toString() + " & " + Thread.currentThread().getName() + " is awake again now");
				} catch (InterruptedException e) {					
					System.out.println(ANSI_CYAN + Thread.currentThread().getName() + " was interrupted before " + thread1.getName() + " is completed");
				}
			}
		});
		thread4.start();
		
		//thread4.interrupt();
		//thread1.interrupt();
		System.out.println(ANSI_BLUE+"Main class ends");
	}

}
