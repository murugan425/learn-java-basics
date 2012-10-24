/**
 * LearnJavaBasics
 */
package org.learnjavabasics.decisionmaking;

/**
 * @author Murugan Nagarajan
 * @created date 01-Aug-2012 / 7:58:52 PM
 */
public class DecisionMakingExercise {

	/**
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0, y = 0 ;
		int a = 0, b = 0, c = 0;
		int p = 0, q = 0;
		//if(x+y = 0 && y > 0) //Dont use assignment operators.
		/*if(code > 1); //The if condition becomes useless due to the presence of ; at the end 
			a=b+c;
		else
			b=a+c;*/
		//if(p>0) || (q<0) //Syntax error on braces
		
		x = 1 ; y = 1;
		if(0>0)
			x = x + 1;
			y = y - 1;
			System.out.println(x +"::::"+ y);
		
		c = 77;
		if(c<=59 && c>=50) p = p + 1;
		if(c>=50) { if (c<=59) { q = q + 1; } }
		System.out.println(p);
		System.out.println(q);
		
		c = 45;
		if (c>100 || c<0 ) {
			System.out.println("Out of range");
		}
		else {
			System.out.println("Within range");
		}
		
		if(c<0) {
			System.out.println("Out of range");
		}
		else if (c>100) {
			System.out.println("Out of range");
		}
		else {
			System.out.println("Within range");
		}
		
		c = 700;
		if (c>60 && c>100 || c>200)
			y = 12345;
		else
			y = 98765;
		System.out.println(y);
		
		if (c>60) {
			if (c>100) {
				y = 12345;
			}
		}
		else if (c>200) {
			y = 12345;
		}
		else {
			y = 98765;	
		}
		System.out.println(y);
	}
}
