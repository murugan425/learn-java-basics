/**
 * LearnJavaBasics
 */
package org.learnjavabasics.overview;

/**
 * @author MURUGAN NAGARAJAN
 * @created date Jul 15, 2012 / 12:35:16 PM
 */
public class CmdLineTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int count, i = 0;
		String string;
		
		count = args.length;
		System.out.println("Number of Arguments :::: "+ count);
		/*while (i<count) {
			string = args[i];
			i++;
			System.out.println(i +"::: Java is" + string+".");
		}*/
		for (String str : args) {
			System.out.println("Java is "+str+" !");
		} 

	}

}
