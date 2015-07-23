/**
 * @author	: Murugan_Nagarajan
 * @date	: Jun 13, 2015
 * @time	: 6:12:25 PM
 */
package com.tamil.learn.java.basics;

import java.util.Scanner;

/**
 * @author Murugan_Nagarajan
 *
 */
public class MethodVariables {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TomApp myTom = new TomApp();
		/* Lets create a system which repeats/interacts based on what you type */
		
		Scanner scannerObj = new Scanner(System.in);
		System.out.println("Enter your Name :");
		String sUsername = scannerObj.nextLine();
		//Passing parameters to methods.
		myTom.sayHi(sUsername);
		scannerObj.close();		
	}
}

class TomApp {
	public void sayHi(String sInputStr) {
		System.out.println("Hey, Hi "+ sInputStr + ". How are you?");
	};
 }
