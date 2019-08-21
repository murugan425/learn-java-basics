/**
 * 
 */
package com.tamil.learn.java.basics.concurrency;

import static com.tamil.learn.java.basics.vo.AnsiColor.ANSI_PURPLE;

import org.apache.commons.lang3.RandomStringUtils;

/**
 * @author atpsmnn
 *
 */
public class PrimaryRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println(ANSI_PURPLE + String.format("Primary Runnable - %s", this.getClass().getSimpleName()));				
	}
}
