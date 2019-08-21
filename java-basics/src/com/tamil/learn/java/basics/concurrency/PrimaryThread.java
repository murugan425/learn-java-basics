/**
 * 
 */
package com.tamil.learn.java.basics.concurrency;

import org.apache.commons.lang3.RandomStringUtils;

import static com.tamil.learn.java.basics.vo.AnsiColor.ANSI_RED;

/**
 * @author atpsmnn
 *
 */
public class PrimaryThread extends Thread {

	@Override
	public void run() {
		System.out.println(ANSI_RED+String.format("Primary Thread - %s", currentThread().getName()));				
	}
}
