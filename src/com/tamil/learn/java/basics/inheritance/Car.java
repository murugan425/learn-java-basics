/**
 * @author	: Murugan_Nagarajan
 * @date	: Jun 26, 2015
 * @time	: 9:16:29 PM
 */
package com.tamil.learn.java.basics.inheritance;

/**
 * @author Murugan_Nagarajan
 *
 */
public class Car extends Machine {

	/* (non-Javadoc)
	 * @see learn.java.basics.inheritance.Machine#changeGear()
	 */
	@Override
	public void changeGear() {
		System.out.println("Car Gear Changed");
		super.changeGear();
	}

	/* (non-Javadoc)
	 * @see learn.java.basics.inheritance.Machine#applyBreak()
	 */
	@Override
	public void applyBreak() {
		System.out.println("Car Break Applied.");
		super.applyBreak();
	}
	
	public void wipeWindSheild() {
		System.out.println("Windsheild is turned ON..,");
	}
	
	public void remindSeatBelt() {
		System.out.println("Reminder to wear seat belt.");
	}
}
