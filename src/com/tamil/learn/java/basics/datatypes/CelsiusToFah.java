/**
 * LearnJavaBasics
 */
package com.tamil.learn.java.basics.datatypes;

/**
 * @author Murugan Nagarajan
 * @created date 23-Jul-2012 / 8:14:53 AM
 */
public class CelsiusToFah {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		float F = 104.45F;
		float C = (float)((F-32)/1.8);
		System.out.println("Temperature calculated in Celcius:: F-->"+F+" ::: C-->"+C);
	}

}
