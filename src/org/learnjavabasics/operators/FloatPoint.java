/**
 * LearnJavaBasics
 */
package org.learnjavabasics.operators;

/**
 * @author Murugan Nagarajan
 * @created date 24-Jul-2012 / 10:32:13 PM
 */
public class FloatPoint {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		float a = -20.5f, b = 6.55f;
		System.out.println(" a ="+a);
		System.out.println(" b ="+b);
		System.out.println(" a+b ="+(a+b));
		System.out.println(" a-b ="+(a-b));
		System.out.println(" a*b ="+(a*b));
		System.out.println(" a/b ="+(a/b));
		System.out.println(" a%b ="+(a%b)); //Sign of the result is always the sign of the first operand(Divisor). 
	}
}
