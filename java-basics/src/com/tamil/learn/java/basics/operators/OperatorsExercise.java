/**
 * LearnJavaBasics
 */
package com.tamil.learn.java.basics.operators;

/**
 * @author Murugan Nagarajan
 * @created date 31-Jul-2012 / 7:36:33 PM
 */
public class OperatorsExercise {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		calculate();
	}
	public static void calculate() {
		// The expected value is 8, but it prints 2. 
		int i = 42 + 45 - 48 -5;
		int j = 5 + 5 - 8 + 2;
		//int ans = i % j;
		int ans1 = i / j;
		System.out.println(i +"  :::  "+ j);
		System.out.println("Value of ans = " + ans1);
		// The expected value is 78, but it prints 59.
		//int ans2 = 42 + 45 - 48 -5 -15 + 20 * 2; // -> 59
		int ans2 = (42 + 45 - 48 -5 -15 + 20) * 2;
		System.out.println("Value of ans = " + ans2);
		//Compilation error in below line due to absence of operators.
		//int ans3 = (2(+5-8)(+5-5)+10) * 2;
		int ans3 = (2*(+5-8)*(+5-5)+10) * 2;
		System.out.println("Value of ans = " + ans3);
		//Expected value of x is 40.0 not 41.0
		//double x= Math.rint(40.6);
		double x= Math.floor(40.6);
		double y= Math.abs(40.6);
		System.out.println("Value of X is "+ x +"and Y is =" +y);
	}

}
