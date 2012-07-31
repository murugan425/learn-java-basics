/**
 * LearnJavaBasics
 */
package org.learnjavabasics.decisionmaking;

/**
 * @author Murugan Nagarajan
 * @created date 31-Jul-2012 / 8:47:17 PM
 */
public class IfElseNesting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 325, b = 712, c =478;
		System.out.print("Largest value is : ");
		if (a > b) {
			if(a > c) {
				System.out.println(a);
			}
			else {
				System.out.println(c);
			}
		}
		else {
			if(c > b) {
				System.out.println(c);
			}
			else {
				System.out.println(b);
			}
		}		
	}

}
