/**
 * @author	: Murugan_Nagarajan
 * @date	: Jun 13, 2015
 * @time	: 9:15:45 PM
 */
package com.tamil.learn.java.basics;

/**
 * @author Murugan_Nagarajan
 *
 */
public class Constructors {

	/**
	 * @param args
	 */
	// Constructor is the only mehtod which doesn't have a return type not even
	// void
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Bike bikeObj1 = new Bike();
		//System.out.println(bikeObj.getModelName() +" ---- "+ bikeObj.getModelYear() +" ---- "+ bikeObj.getRegNumber());
		
		@SuppressWarnings("unused")
		Bike bikeObj2 = new Bike("Honda Unicorn");
		
		@SuppressWarnings("unused")
		Bike bikeObj3 = new Bike("Honda Shine", 2000, "TN23 H 8790");
		
	}

}

class Bike {

	// private String sModelName;
	String sModelName;
	int iModelYear;
	String sRegNumber;

	public Bike() {
		System.out.println("First Constructor class for Bike Class is triggered");
		sModelName = "No model Name defined";
		iModelYear = 0;
		sRegNumber = "Not yet registered";
		displayDetails();
		
		//Can be triggered only as a first line of this method
		//this("Hero", 2000, "TN23 H 8238");
	}
	
	public Bike(String modelName) {
		//Calling another constructor inside this constructor using this keyword.
		//this can be called to invoke a constructor only in the first line.
		this(modelName, 2005, "TN23 H 3575");
		System.out.println("Second Constructor class for Bike Class is triggered");
	}
	
	public Bike(String modelName,int modelYear,String regNo) {
		System.out.println("Third Constructor class for Bike Class is triggered");
		sModelName = modelName;
		iModelYear = modelYear;
		sRegNumber = regNo;
		displayDetails();
	}

	void displayDetails() {
		System.out.println("My mode/make is :" + this.sModelName);
		System.out.println("Manufactured on :" + this.iModelYear);
		System.out.println("Registed with :" + this.sRegNumber);
		System.out.println();
	}

	String getModelName() {
		return this.sModelName;
	}
	
	int getModelYear(){
		return this.iModelYear;
	}
	
	String getRegNumber() {
		return this.sRegNumber;
	}
	
}
