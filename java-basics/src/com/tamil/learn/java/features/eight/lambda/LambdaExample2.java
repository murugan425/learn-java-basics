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
		
		int num = 500;
		//Argument list, Arrow token, Body Expression
		new Thread(() -> 
			{
				System.out.println(String.format("Runnable Lambda Function - %s", RandomStringUtils.randomAlphabetic(20)));
				try {
					Thread.sleep(5000);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
				//num++; //results in compilation error, only if the num is final it can be used in lambda.
				//Even if we try to change the 'num' value during the sleep time explicitly, the lambda expression will not consider that.
				System.out.println("Print the variable which is outside the scope of the lambda: " + num);
			}			
		).start();
	}
}

class printRandomText implements Runnable {
	@Override
	public void run() {
		System.out.println(String.format("Runnable Inner/Local class - %s", RandomStringUtils.randomAlphabetic(10)));		
	};	
}

