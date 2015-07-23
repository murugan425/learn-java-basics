/**
 * @author	: Murugan_Nagarajan
 * @date	: Jun 26, 2015
 * @time	: 10:42:23 PM
 */
package com.tamil.learn.java.basics.interfaces;

/**
 * @author Murugan_Nagarajan
 *
 */
public class InterfaceMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Machine mac = new Machine();
		mac.start();
		
		Person adult = new Person();
		adult.greet();
		
		/* Now, we can just use the adult and person class directly 
		 * to trigger the display details method declared in them
		 */
		
		mac.displayDetails();
		mac.stop();
		
		adult.displayDetails();
		adult.sayhi();
		
		/* But lets say we need to call display details of each class 
		 * based on the object being instantiated, then we go for interface.
		 */
		
		//So instead of creating two separate objects lets create the interface object.
		System.out.println();
		ShowInformationInf macInf = new Machine();
		macInf.displayDetails();
		
		ShowInformationInf personInf = new Person();
		personInf.displayDetails();
		
		/* But still we are creating two objects of person & machine separately 
		 * but triggering the method declared in the interface.
		 * 
		 * Interface provides access only to the declared methods, not all methods
		 * implemented in the class can be called using the interface
		 */
		
		/* Now lets create a common method to simplify the above 4 lines */
		System.out.println();
		triggerInfMethod(macInf);
		triggerInfMethod(personInf);
		
	}
	
	private static void triggerInfMethod(ShowInformationInf objInf) {
		objInf.displayDetails();
	};
		
}
