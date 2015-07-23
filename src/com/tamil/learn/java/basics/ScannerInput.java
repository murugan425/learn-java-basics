/**
 * @author	: Murugan_Nagarajan
 * @date	: Jun 12, 2015
 * @time	: 9:44:45 PM
 */
package com.tamil.learn.java.basics;

import java.util.Scanner;

/**
 * @author Murugan_Nagarajan
 *
 */
public class ScannerInput {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scannerObj = new Scanner(System.in);
		
		System.out.println("Enter atleast 2 Names :");
		
		String sAllNames = "";
		
		int count = 0;
		do {
			count ++;
			System.out.println("Enter Name " +count);
			String sUsername = scannerObj.nextLine();			
			sAllNames += sUsername;
		}
		while (count < 2);
		scannerObj.close();
		System.out.println("Full Name is "+ sAllNames);
	}

}
