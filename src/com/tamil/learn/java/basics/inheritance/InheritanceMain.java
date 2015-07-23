/**
 * @author	: Murugan_Nagarajan
 * @date	: Jun 26, 2015
 * @time	: 9:15:14 PM
 */
package com.tamil.learn.java.basics.inheritance;

/**
 * @author Murugan_Nagarajan
 *
 */
public class InheritanceMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Car bmw = new Car();
		bmw.start();
		bmw.remindSeatBelt();
		bmw.accelerate();
		bmw.changeGear();
		bmw.applyBreak();
		
		System.out.println("\n\n\n");
		
		Bike shine = new Bike();
		shine.start();
		shine.remindHelmet();
		shine.accelerate();
		shine.changeGear();
		shine.applyBreak();
	}

}
