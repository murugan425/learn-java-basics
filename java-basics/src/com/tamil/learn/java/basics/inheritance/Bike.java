/**
 * @author	: Murugan_Nagarajan
 * @date	: Jun 26, 2015
 * @time	: 9:14:50 PM
 */
package com.tamil.learn.java.basics.inheritance;

/**
 * @author Murugan_Nagarajan
 *
 */
public class Bike extends Machine {

	/* (non-Javadoc)
	 * @see learn.java.basics.inheritance.Machine#changeGear()
	 */
	@Override
	public void changeGear() {
		System.out.println("Bike Gear Changed");
		super.changeGear();
	}

	/* (non-Javadoc)
	 * @see learn.java.basics.inheritance.Machine#applyBreak()
	 */
	@Override
	public void applyBreak() {
		System.out.println("Bike Break Applied.");
		super.applyBreak();
	}
	
	public void remindHelmet() {
		System.out.println("Reminder to wear Helmet");
	}
}
