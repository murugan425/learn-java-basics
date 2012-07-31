/**
 * LearnJavaBasics
 */
package org.learnjavabasics.operators;

import java.io.DataInputStream;
import java.io.IOException;

/**
 * @author Murugan Nagarajan
 * @created date 31-Jul-2012 / 6:45:04 PM
 */
public class ConditionalOperator {

	/**
	 * @param args
	 */
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		DataInputStream in = new DataInputStream(System.in);
		float a , b;
		a = b = 0; // Don't use statements like this as they are little confusing.
		System.out.println("Enter the value of a :");
		try {
			a = Float.valueOf(in.readLine()).floatValue();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Enter the value of b :");
		try {
			b = Float.valueOf(in.readLine()).floatValue();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println((a > b) ? a+ "not less than"+b:b+ "is greater than"+a);
	}

}
