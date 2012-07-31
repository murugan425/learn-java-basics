/**
 * LearnJavaBasics
 */
package org.learnjavabasics.overview;

/**
 * @author Murugan Nagarajan
 * @created date 22-Jul-2012 / 10:17:44 PM
 */
public class VariablesExercise {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		display1();
		display2(19);
		calculate();
		convert();
	}

	public static void display1() {
		// Results in compile time warning since the variable x is not used anywhere.
		int x = 123456;
		// Results in compile time error since the value 3.1(double) can't be assigned the 
		//double type value directly without type casting.
		//float y = 3.1; 
 		float y = 3.1f;
 		System.out.println("Int value is ::"+ x);
		System.out.println("Float value is ::"+ y);
	}
	public static void display2(int x) {
		//int y;
		//The value of y has to be initialized else it results in Compile Time error
		//since displaying Y without initializing results in error.
		int y = 0;
		if(x > 10) {
			y=x;
		}
		System.out.println("Value of Y = "+ y);
	}
	public static void calculate() {
		final float pie = 3.14f;
		//The value of pie can't be altered once it is declared as FINAL.
		//pie = 3.145f;
		System.out.println("Value of pie = "+pie);
	}
	public static void convert() {
		int i = 1234;
		//byte b = i;
		//The value of b can't be assigned to i directly as it results in type mismatch  
		byte b = (byte)i;
		System.out.println("Value of Byte Variable b = "+b);
	}
}
