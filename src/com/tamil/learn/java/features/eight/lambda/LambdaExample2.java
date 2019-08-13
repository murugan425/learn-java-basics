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
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println(String.format("Runnable Anonymous Class method - %s", RandomStringUtils.randomAlphabetic(5)));				
			}
		}).start();
		
		new Thread(new printRandomText()).start();
		
		//Argument list, Arrow token, Body Expression
		new Thread(() -> System.out.println(String.format("Runnable Lambda Function - %s", RandomStringUtils.randomAlphabetic(20)))).start();
	}
}

class printRandomText implements Runnable {
	@Override
	public void run() {
		System.out.println(String.format("Runnable Inner/Local class - %s", RandomStringUtils.randomAlphabetic(10)));		
	};	
}

