/**
 * @author	: Murugan_Nagarajan
 * @date	: Jun 13, 2015
 * @time	: 6:30:16 PM
 */
package com.tamil.learn.java.basics.beginners;

/**
 * @author Murugan_Nagarajan
 *
 */
public class Getters {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Home myHome = new Home();
		
		myHome.setName("Murugan Home");
		myHome.setFamilyCount(6);
		myHome.setDoorNumber(29);
		myHome.setAddress("Dafodills Apartment");
		
		System.out.println( "Home Details..");
		System.out.println("========================");
		System.out.println("Name 	:" + myHome.getName());
		System.out.println("Address :" + myHome.getDoorNumber() +", " +myHome.getAddress());
	}
}

class Home {
	private String name;
	private int familyCount;
	private int doorNumber;
	private String address;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the familyCount
	 */
	public int getFamilyCount() {
		return familyCount;
	}

	/**
	 * @param familyCount
	 *            the familyCount to set
	 */
	public void setFamilyCount(int familyCount) {
		this.familyCount = familyCount;
	}

	/**
	 * @return the doorNumber
	 */
	public int getDoorNumber() {
		return doorNumber;
	}

	/**
	 * @param doorNumber the doorNumber to set
	 */
	public void setDoorNumber(int doorNumber) {
		this.doorNumber = doorNumber;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

}
