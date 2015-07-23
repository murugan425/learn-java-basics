/**
 * @author	: Murugan_Nagarajan
 * @date	: Jun 12, 2015
 * @time	: 1:13:04 AM
 */
package com.tamil.learn.java.basics;

/**
 * @author Murugan_Nagarajan
 *
 */
public class IfCondition {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int iNumber = 2137483660;
		if(iNumber > 5) {
			System.out.println("The condition result is true");
		}
		else if (iNumber <10) {
			System.out.println("The condition result is false");
		}
		else {
			System.out.println("None - Moved to else part");
		}
		
		while(iNumber <= 2147483647) {
			System.out.println("Looping the count:" + iNumber);
			iNumber++;
			if(iNumber == 10) {
				System.out.println("Loop in IF condition, so breaking.,");
				break;
			}		
		}
		
		
	}

}
