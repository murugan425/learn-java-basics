/**
 * LearnJavaBasics
 */
package org.learnjavabasics.decisionmaking;

/**
 * @author Murugan Nagarajan
 * @created date 31-Jul-2012 / 8:52:15 PM
 */
public class ElseIfLadder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int rollNumber[] = { 111, 222, 333, 444 };
		int marks[] = {67, 56, 90, 32};
		for (int i=0; i<rollNumber.length; i++) {
			if (marks[i] > 79)
				System.out.println(rollNumber[i] + "  Honors");
			else if (marks[i] > 59)
				System.out.println(rollNumber[i] + "  Divison 1");
			else if (marks[i] > 49)
				System.out.println(rollNumber[i] + "  Divison 2");
			else
				System.out.println(rollNumber[i] + "  Failed");
		}
	}

}
