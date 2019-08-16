/**
 * @author	: Murugan_Nagarajan
 * @date	: Jun 13, 2015
 * @time	: 1:09:54 PM
 */
package com.tamil.learn.java.basics.beginners;

/**
 * @author Murugan_Nagarajan
 *
 */
public class ClassObjects {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long a = System.nanoTime();
		System.out.println(a);
		//Create a object of the class and assign values to it.
		Car suv = new Car();
		suv.sModelName = "Mahindra XUV 500";
		suv.iModelYear = 2014;
		suv.sRegNumber = "TN32 H 8048";
		System.out.println(suv);
		
		Car swift = new Car();
		swift.sModelName = "Maruti Suzuki Swift Dzire";
		swift.iModelYear = 2011;
		swift.sRegNumber = "TN32 H 8049";
		System.out.println(swift);
		System.out.println(swift.hashCode());
		System.out.println(swift.toString()+"\n");
		//Prints learn.java.basics.Car@14b7453 -Hash Code - Unique identifier for your object
		//tostring() - returns getClass().getName() + "@" + Integer.toHexString(hashCode());
		//Override the string method if needed
		
		//Make use of the object variables in the application.
		System.out.println("New Model is:" +swift.sModelName +"\n");
		
		/*This is called encapsulation, by making car model private
		 * we will be able to access it only thru getter methods.
		*/
		System.out.println("New Model is:" +suv.getCarModelName() +"\n");
		
		suv.displayDetails();
		for(int i=0;i<10000000;i++) {
			
		}
		swift.displayDetails();
		long b = System.nanoTime();
		System.out.println(b);
		System.out.println("Time for execution in seconds " + (b-a));
	}

}

//Declare a class with its variables & methods (Data & Subroutines) || (State & Behavior)
//This way of writing different classes helps in encapsulation - Hide the variables 
//from other classes and access them using other methods when required.
class Car {
	
	//private String sModelName;
	String sModelName;
	int iModelYear;
	String sRegNumber;
	
	void displayDetails() {
		System.out.println("My mode/make is :" + this.sModelName);
		System.out.println("Manufactured on :" + this.iModelYear);
		System.out.println("Registed with :" + this.sRegNumber);
		System.out.println();
	}
	
	String getCarModelName() {
		return this.sModelName;
	}
	
	//Lets override the toString method
	/*@Override
	public String toString() {
        return getClass().getName() +" /// "+ this.sModelName +"  "+ this.iModelYear + "   "+ this.sRegNumber;
    }*/
}
