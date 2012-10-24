/**
 * LearnJavaBasics
 */
package org.learnjavabasics.decisionmaking;

/**
 * @author Murugan Nagarajan
 * @created date 01-Aug-2012 / 9:22:07 PM
 */
public class SummationOfSevens {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 int a = 100;
		 int b = 200;
		 
		 int divisor = 7;
		 int total = 0;
		 
		 while(a<b) {
			 ++a;			 
			 if(a%divisor == 0) {
				 System.out.println("Value of the Divisible::: "+a);
				 total += a;				 
			 }
		 }
		 System.out.println("Summation og all values::: "+total);
	}

}
