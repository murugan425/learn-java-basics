/**
 * 
 */
package com.tamil.learn.java.basics.concurrency;

import static com.tamil.learn.java.basics.vo.AnsiColor.ANSI_RED;

/**
 * @author atpsmnn
 *
 */
public class PrimaryThread extends Thread {

	@Override
	public void run() {
		System.out.println(ANSI_RED+String.format("Primary Thread - %s", currentThread().getName()));
		try {
			Thread.sleep(3000);
		}catch (InterruptedException e) {
			System.out.println(ANSI_RED + currentThread().getName() + " Interrupted and awake before 3 seconds.");
			return; //will make sure that the next default last statement is not executed
		}
		System.out.println(ANSI_RED + "3 Seconds completed. " + currentThread().getName() + " awake.");
	}
}
