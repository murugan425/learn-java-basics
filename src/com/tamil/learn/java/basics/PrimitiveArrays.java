/**
 * @author	: Murugan_Nagarajan
 * @date	: Jun 12, 2015
 * @time	: 10:19:06 PM
 */
package com.tamil.learn.java.basics;

import java.util.Scanner;

/**
 * @author Murugan_Nagarajan
 *
 */
public class PrimitiveArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Simple example of string arrays.
		
		//Just two references are created, no memory allocation can be done here.
		String[] sNames = new String[2];
		
		//Memory gets allocated based on the string length
		sNames[0] = "Murugan";
		sNames[1] = "Sentamil";
		
		System.out.println("Full Name is "+ sNames[1] +" "+ sNames[0]);
		
		for(String name:sNames) {
			System.out.println(name);
		}
		
		//Simple example of int arrays.
		int iNumbers[] = {4,65,31};
		
		for(int i=0; i<iNumbers.length;i++) {
			System.out.println("Number " + (i+1) + " is "+ iNumbers[i]);
		};
		
		//Get a list of 5 numbers and give their sum after placing them in a array of int.
		int[] iValues ;
		int iSum = 0;
		
		iValues = new int[5]; //Allocate memory to store 5 int
		
		Scanner scannerObj = new Scanner(System.in);
		
		for(int i=0;i<5;i++) {
			System.out.print("Enter the number "+(i+1)+" :");
			iValues[i] = scannerObj.nextInt();
		}
		
		for(int i=0;i<iValues.length;i++) {
			iSum = iSum + iValues[i];			
		}
		
		System.out.println("Summation of all 5 values is "+iSum);
		scannerObj.close();
	}

}
