/**
 * @author	: Murugan_Nagarajan
 * @date	: Jun 27, 2015
 * @time	: 10:50:18 PM
 */
package com.tamil.learn.java.basics.accessspecifiers;

import com.tamil.learn.java.basics.accessspecifiers.living.Animals;
import com.tamil.learn.java.basics.accessspecifiers.living.Humans;

/**
 * @author Murugan_Nagarajan
 *
 */
public class AccessSpecifiers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		@SuppressWarnings("unused")
		Animals cat = new Animals();
		
		//Encapsulation - this way of hiding/preventing access to as specific 
		//variable by access specifiers is called as Encapsulation.

		// cat.category = "UNKNOEN CATEGORY";
		// Category is private. Can't access here.

		// cat.family = "UNKNOWN FAMILY";
		// Family is protected. Can be accessed only in a child class of Animal
		// like Human class
		
		//SomeAnimalSubclass sc = new SomeAnimalSubclass();
		//The SomeAnimalSubclass can be accessed only within the same package

		Humans human = new Humans();
		human.name = "Murugan";

		// human.mobNumber = "7401631601";
		// MobileNumber is private. Can't access here.

		// human.petName = "Chikkuu";
		// PetName is protected. Can be accessed only in a child class of human
		// class

		// human.weight = 50;
		// Weight doesn't have any access specifier, so by default it comes to
		// package level. Can be accessed only in a class of the same package of
		// Human

	}

}



