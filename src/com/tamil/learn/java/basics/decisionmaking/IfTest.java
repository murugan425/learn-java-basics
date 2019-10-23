/**
 * LearnJavaBasics
 */
package com.tamil.learn.java.basics.decisionmaking;

/**
 * @author Murugan Nagarajan
 * @created date 31-Jul-2012 / 8:23:54 PM
 */
public class IfTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i, total, count1, count2;
		float[] weight = { 45.0f, 55.0f, 47.0f, 51.0f, 54.0f };
		float[] height = { 176.5f, 174.2f, 168.0f, 170.7f, 169.0f };
		
		total = 0; count1 = 0; count2 = 0;
		for(i = 0; i<=4; i++) {
			if(weight[i] <50.0 && height[i] > 170.0) {
				count1 = count1 + 1;
			}
			total = total + 1;
		}
		count2 = total - count1;
		System.out.println("Number of persons with ....");
		System.out.println("Weight < 50 and Height>170 = "+count1);
		System.out.println("Others = " + count2);
	}
}
