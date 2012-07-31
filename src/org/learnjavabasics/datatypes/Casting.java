/**
 * LearnJavaBasics
 */
package org.learnjavabasics.datatypes;

/**
 * @author Murugan Nagarajan
 * @created date 25-Jul-2012 / 9:33:38 PM
 */
public class Casting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		float sum;
		int i;
		sum = 0.0f;
		for(i=1;i<=10;i++) {
			sum = sum + (1/(float)i);
			System.out.println(" i = "+i);
			System.out.println(" sum = "+sum);
		}
	}
}
