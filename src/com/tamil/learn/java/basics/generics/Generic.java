/**
 * @author	: Murugan_Nagarajan
 * @date	: Jul 10, 2015
 * @time	: 9:42:17 PM
 */
package com.tamil.learn.java.basics.generics;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author Murugan_Nagarajan
 *
 */
public class Generic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// If a specific class operates on a single or multiple objects of the
		// same datatype or class, we make us of the concept of Generics to
		// define the datatype on which the class will operate.

		// Before JDK1.5 we need to manually type cast while getting a obj from
		// a list
		// Like
		ArrayList list1 = new ArrayList();

		list1.add("A");
		list1.add("B");
		list1.add("C");

		String thirdElement = (String) list1.get(2);
		System.out.println("Check the type casting is mandaory above :: "
				+ thirdElement);

		// new ArrayList<String> - the data type like <String> in the object
		// variable is not variable from JDK1.7

		ArrayList<String> list2 = new ArrayList<>();
		list2.add("Alpha");
		list2.add("Beta");
		list2.add("Gamma");

		String secondElement = list2.get(1);
		System.out
				.println("2nd Element is - No casting needed because the generic <> defines what object the contains "
						+ list2.get(1));

		// Some objects has more than one type of argument say for example
		// HashMap..,
		HashMap<Integer, String> map = new HashMap<Integer, String>();

	}
}
