/**
 * LearnJavaBasics
 */
package com.tamil.learn.java.basics.operators;

/**
 * @author Murugan Nagarajan
 * @created date 28-Jul-2012 / 8:23:26 AM
 */
public class JavaExpressions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declaration and Initialization
		int a = 10 , b = 5, c =8, d = 2;
		float x = 6.4f, y = 3.0f;
		
		// Order of Evaluation
		int answer1 = a*b+c/d;
		int answer2 = a*(b+c)/d;
		
		// Type Conversion
		float answer3 = a/c;
		int answer4 = (int) (a/y);
		
		// Modulo Operations
		int answer5 = a%c;
		float answer6 = -x%b;
		
		// Logic Operations
		boolean answer7 = a>b && c>d || !(a-b!=c);
		System.out.println("Order of Evaluation");
		System.out.println("a*b+c/d = "+answer1);
		System.out.println("a*(b+c)/d = "+answer2);
		System.out.println("Type Conversion");
		System.out.println("a/c = "+answer3);;
		System.out.println("(int) (a/y) = "+answer4);
		System.out.println("Modulo Operations");
		System.out.println("a%c = "+answer5);
		System.out.println("-x%b = "+answer6);
		System.out.println("Logic Operations");
		System.out.println("a>b && c>d || !(a-b==c) = " + answer7);
	}

}
