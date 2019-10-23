/**
 * 
 */
package com.tamil.learn.java.basics.concurrency;

import static com.tamil.learn.java.basics.vo.AnsiColor.ANSI_GREEN;

/**
 * @author atpsmnn
 *
 */
public class SecondThread extends Thread {

	@Override
	public void run() {
		System.out.println(ANSI_GREEN + String.format("Second Thread - %s", currentThread().getName()));				
	}
}
