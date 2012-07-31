/**
 * LearnJavaBasics
 */
package org.learnjavabasics.overview;

/**
 * @author Murugan Nagarajan
 * @created date 24-Jul-2012 / 10:24:35 PM
 */
public class Scope {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int m = 10;
		{
			//m is created second time which results in duplicate varibale.
			//int m = 20;
			m = 20;
			System.out.println(m);
		}
		System.out.println(m);;

	}

}
