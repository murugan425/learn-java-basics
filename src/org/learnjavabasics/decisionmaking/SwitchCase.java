/**
 * LearnJavaBasics
 */
package org.learnjavabasics.decisionmaking;

/**
 * @author Murugan Nagarajan
 * @created date 31-Jul-2012 / 8:57:13 PM
 */
public class SwitchCase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("");
		System.out.println(" C --> Chennai");
		System.out.println(" D --> Delhi");
		System.out.println(" M --> Mumbai");
		System.out.println("Choice -->");
		System.out.flush();
		try {
			//throw new Exception("abcdef"); --> Just tried to check system.err.print
			switch ((char)System.in.read()) {
			case 'C':
			case 'c':
				System.out.println(" Chennai City Portal");
				break;
			case 'D':
			case 'd':
				System.out.println(" Delhi City Portal");
				break;
			case 'M':
			case 'm':
				System.out.println(" Mumbai City Portal");				
				break;
			default :
				System.out.println("Invalid Choice");
				break;			
			}
		}
		catch (Exception e){
			System.err.println("I/O Error");
		}
	}

}
