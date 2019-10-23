/**
 * 
 */
package com.tamil.learn.java.basics.concurrency;

import com.tamil.learn.java.basics.decisionmaking.Countdown;

/**
 * @author atpsmnn
 *
 */
public class CountdownThread extends Thread {
	private Countdown counter;
	
	public CountdownThread(Countdown counter) {
		this.counter = counter;
	}
	
	@Override
	public void run() {
		counter.countdown();
	}
}
