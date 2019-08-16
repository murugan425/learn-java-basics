/**
 * @author	: Murugan_Nagarajan
 * @date	: Jun 27, 2015
 * @time	: 10:20:21 AM
 */
package com.tamil.learn.java.basics.interfaces;

/**
 * @author Murugan_Nagarajan
 *
 */
public class Person implements ShowInformationInf {

	public void greet() {
		System.out.println("How are you?");
	}
	
	public void sayhi() {
		System.out.println("Hi, Hello, ");
	}

	/* (non-Javadoc)
	 * @see learn.java.basics.interfaces.ShowInformation#displayDetails()
	 */
	@Override
	public void displayDetails() {
		System.out.println("I m a Person object..,");		
	}
}
