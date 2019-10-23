/**
 * @author	: Murugan_Nagarajan
 * @date	: Jun 27, 2015
 * @time	: 10:52:52 PM
 */
package com.tamil.learn.java.basics.accessspecifiers.nonliving;

import com.tamil.learn.java.basics.accessspecifiers.living.Humans;

/**
 * @author Murugan_Nagarajan
 *
 */
public class House extends Humans {

	@SuppressWarnings("unused")
	private String ownerName;

	/**
	 * 
	 */
	public House() {
		System.out.println("Creating House obj..,");
		this.ownerName = "DEFAULT";
		this.name = "DEFAULT";
		// this.mobNumber = null; //mobNumber is a private variable in Human
		this.petName = "DEFAULT";
		// this.weight = 0;
		// Can be accessed only in same package. Humans & House are in different
		// package.Even House is child class, we can't access the weight
		// variable here
		this.family = "Human";
		// Can be accessed since House extends Humans and Humans extends
		// Animals.Animals become a super parent of House.

	}

}
