/**
 * @author	: Murugan_Nagarajan
 * @date	: Jun 27, 2015
 * @time	: 10:50:42 PM
 */
package com.tamil.learn.java.basics.accessspecifiers.living;

/**
 * @author Murugan_Nagarajan
 *
 */
public class Humans extends Animals {

	public String name;
	private String mobNumber;
	protected String petName;
	int weight; // package level

	// Practice to declare only the static/final variables as public
	public static int ID;

	/**
	 * 
	 */
	public Humans() {
		System.out.println("Creating Humans obj..,");
		this.name = "DEFAULT";
		this.mobNumber = null;
		this.petName = "DEFAULT";
		this.weight = 0;
		this.family = "Human";
		// Family is protected, hence able to access in human child class
		// this.category = "DEFAULT"; //Category is private
		this.setCategory("DEFAULT");
	}

	/**
	 * @return the mobNumber
	 */
	public String getMobNumber() {
		return mobNumber;
	}

	/**
	 * @param mobNumber
	 *            the mobNumber to set
	 */
	public void setMobNumber(String mobNumber) {
		this.mobNumber = mobNumber;
	}

	SomeAnimalSubclass sc = new SomeAnimalSubclass();
}
