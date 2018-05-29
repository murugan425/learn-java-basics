/**
 * @author	: Murugan_Nagarajan
 * @date	: Jun 12, 2015
 * @time	: 12:58:00 AM
 */
package com.tamil.learn.java.basics.beginners;

/**
 * @author Murugan_Nagarajan
 *
 */
public class ForLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("=======================================");
		/*Post Count Loop*/
		for(int ipostLoopCount = 0; ipostLoopCount<5; ipostLoopCount++) {
			System.out.println("=======================================");
			System.out.println("Loop Count is :" + ipostLoopCount);
			System.out.println("=======================================");
		}
		System.out.println("=======================================");
		/*Post Count Loop*/
		for(int ipreLoopCount = 0; ipreLoopCount<5; ++ipreLoopCount) {
			System.out.println("=======================================");
			System.out.println("Loop Count is :" + ipreLoopCount);
			System.out.println("=======================================");
		}
		System.out.println("=======================================");
		
	}

}
