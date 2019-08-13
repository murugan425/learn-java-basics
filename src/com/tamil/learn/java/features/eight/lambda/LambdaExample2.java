/**
 * 
 */
package com.tamil.learn.java.features.eight.lambda;

import org.apache.commons.lang3.RandomStringUtils;

/**
 * @author atpsmnn
 *
 */
public class LambdaExample2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Thread(new printRandomText()).start();
	}
}

class printRandomText implements Runnable {
	@Override
	public void run() {
		System.out.println(String.format("Random Text - %s", RandomStringUtils.randomAlphabetic(20)));		
	};	
}

