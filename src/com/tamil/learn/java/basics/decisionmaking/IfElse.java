/**
 * LearnJavaBasics
 */
package com.tamil.learn.java.basics.decisionmaking;

/**
 * @author Murugan Nagarajan
 * @created date 31-Jul-2012 / 8:40:04 PM
 */
public class IfElse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int numbers[] = { 50, 33, 23, 45, 34, 67, 54, 22 };
		int even =0, odd =0;
		for (int i =0; i<numbers.length; i++) {
			if((numbers[i]%2) == 0) {
				even += 1; //Counting Even Numbers
			}
			else {
				odd += 1;
			}
		}
		System.out.println("Even Numbers :" + even + ". Odd Numbers :" + odd);		
	}

}
