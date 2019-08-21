/**
 * 
 */
package com.tamil.learn.java.basics.concurrency;

import com.tamil.learn.java.basics.decisionmaking.Countdown;

/**
 * @author atpsmnn
 *
 */
public class MultipleThreads {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Countdown counter = new Countdown();
		
		CountdownThread thread1 = new CountdownThread(counter);
		thread1.setName("Thread1");
		CountdownThread thread2 = new CountdownThread(counter);
		thread2.setName("Thread2");
		CountdownThread thread3 = new CountdownThread(counter);
		thread3.setName("Thread3");
		
		thread1.start();
		thread2.start();
		thread3.start();
	}

}
