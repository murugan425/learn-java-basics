/**
 * @author	: Murugan_Nagarajan
 * @date	: Jun 14, 2015
 * @time	: 1:06:20 AM
 */
package com.tamil.learn.java.basics;

/**
 * @author Murugan_Nagarajan
 *
 */
public class StringFormattings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// To understand this we need to understand what/why string
		// concatenation should be avoided.

		String fullName = "";
		// We created a string with empty space. //Memory used

		fullName += "Murugan";
		/*
		 * Now we created one string for Murugan (Memory used) then we assigned
		 * it to fullname which is a reference
		 */

		fullName += "Nagarajan";
		/*
		 * Now we created one string for Nagarajan (Memory used) then we
		 * assigned it to fullname which is a reference
		 */
		System.out.println("Full Name:: "+fullName);
		/*
		 * Consider such concatenation inside a loop, unnecessary memory usage
		 * which impacts performance,, so we go for string builder
		 */

		StringBuilder sb = new StringBuilder();

		sb.append("Murugan");
		sb.append(" ");
		sb.append("Nagarajan");

		System.out.println("Finally we print the name just "
				+ "creating one reference without much memory usage "
				+ sb.toString());

		// Another simple way,still efficient way to write,
		// Clear the string builder first to free memory
		sb.setLength(0);

		sb.append("Sentamil").append(" ").append("Murugan");
		System.out.println("Print the full name of her " + sb.toString());

		// StringBuffer is a thread safe version of StringBuilder

		// Formatting
		System.out
				.println("Print a tab sapce using backslash t like this.\t\t\t. Tab sapce printed. Ane new line using slash n \n\n\nA new line introduced.");

		System.out.printf("My name is %s and my age is %d\n", "Murugan", 28);
		System.out.printf("My name is %s and my age is %d\n", "Tamil", 23);
		System.out.printf("My name is %s and my age is %d\n\n\n", "Manikandan",
				26);

		/*
		 * No alignment is done to pring the name and the age, now lets fix a
		 * fixed length to give proper alignment
		 */

		System.out.printf("My name is %-10s and my age is %d\n", "Murugan", 28);
		System.out.printf("My name is %-10s and my age is %d\n", "Tamil", 23);
		System.out.printf("My name is %-10s and my age is %d\n\n", "Manikandan",
				26);

		//Print a floating point value
		System.out.printf("Floating point value %-10.3f.\n", 3426.34554);
	}

}
