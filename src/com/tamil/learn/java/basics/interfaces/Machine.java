/**
 * @author	: Murugan_Nagarajan
 * @date	: Jun 27, 2015
 * @time	: 10:20:03 AM
 */
package com.tamil.learn.java.basics.interfaces;

/**
 * @author Murugan_Nagarajan
 *
 */
public class Machine implements ShowInformationInf {
	
	public void start() {
		System.out.println("Engine Started");
	}
	
	public void stop() {
		System.out.println("Engine Stopped");
	}

	/* (non-Javadoc)
	 * @see learn.java.basics.interfaces.ShowInformation#displayDetails()
	 */
	@Override
	public void displayDetails() {
		System.out.println("I m a Machine object..,");
	}
	
}
