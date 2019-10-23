/**
 * LearnJavaBasics
 */
package com.tamil.learn.java.basics.decisionmaking;

/**
 * @author Murugan Nagarajan
 * @created date 06-Aug-2012 / 12:14:56 PM
 */
public class SquareRootTable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("===============================================================================");
		System.out.print("| Number |");
		for(float col=0.0f;col<1.0; col+=0.1) {
			System.out.print(" "+col+" |");
		}
		
		for(float col=0.0f;col<1.0; col+=0.1) {
			boolean columnFlag = true;
			for(double row=0.0f;row<=9.0; row++) {
				if(columnFlag)
				columnFlag = false;
				double result = Math.sqrt(col+row);				
				System.out.println(col +"   "+ row +"   "+ result);
			}
		}
	}

}
