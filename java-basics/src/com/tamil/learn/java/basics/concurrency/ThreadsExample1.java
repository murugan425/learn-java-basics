/**
 * 
 */
package com.tamil.learn.java.basics.concurrency;

import static com.tamil.learn.java.basics.vo.AnsiColor.ANSI_BLUE;
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
		SecondThread thread2 = new SecondThread();
		thread1.start();
		thread2.start();
		//thread1.start(); - java.lang.IllegalThreadStateException
		Thread thread3 = new Thread(new PrimaryRunnable());
		thread3.start();
		System.out.println(ANSI_BLUE+"Main class ends");
	}

}
