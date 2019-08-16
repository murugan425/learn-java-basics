/**
 * @author	: Murugan_Nagarajan
 * @date	: Jun 27, 2015
 * @time	: 7:30:59 PM
 */
package com.tamil.learn.java.basics.packages;

import com.tamil.learn.java.basics.packages.country.City;
import com.tamil.learn.java.basics.packages.country.Village;
import com.tamil.learn.java.basics.packages.home.Apartment;
import com.tamil.learn.java.basics.packages.home.Individual;

/**
 * @author Murugan_Nagarajan
 *
 */
public class PackagesMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Village vill = new Village();
		new City();
		
		new Apartment();
		@SuppressWarnings("unused")
		Individual ind = new Individual();
	}

}
