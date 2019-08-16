/**
 * @author	: Murugan_Nagarajan
 * @date	: Jun 12, 2015
 * @time	: 10:00:01 PM
 */
package com.tamil.learn.java.basics.beginners;

import java.util.Scanner;

/**
 * @author Murugan_Nagarajan
 *
 */
public class Switch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner inputCmd = new Scanner(System.in);
				
		System.out.println("Enter you input command as START/STOP for the service.");
		String sCmd = inputCmd.nextLine();
		switch (sCmd) {
		case "START":
			System.out.println("You opt to START the service.");
			break;
		case "STOP":
			System.out.println("You opt to STOP the service.");
			break;
		default:
			System.out.println("Invalid Command.");
			break;
		}
		inputCmd.close();
	}

}
