/**
 * @author	: Murugan_Nagarajan
 * @date	: Jun 12, 2015
 * @time	: 12:48:17 AM
 */
package com.tamil.learn.java.basics;

/**
 * @author Murugan_Nagarajan
 *
 */
public class WhileLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*Post Increment*/
		System.out.println("=======================================");
		int iPostLoopCount = 380;
		
		while (iPostLoopCount < 425) {
			System.out.println("Loop Count is : "+ iPostLoopCount++);			
		}
		
		System.out.println("=======================================");
		/*Pre Increment*/
		int iPreLoopCount = 380;
		
		while (iPreLoopCount < 425) {
			System.out.println("Loop Count is : "+ ++iPreLoopCount);			
		}
		System.out.println("=======================================");
	}

}
