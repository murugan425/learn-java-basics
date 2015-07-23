/**
 * @author	: Murugan_Nagarajan
 * @date	: Jun 14, 2015
 * @time	: 12:26:07 AM
 */
package com.tamil.learn.java.basics;

/**
 * @author Murugan_Nagarajan
 *
 */
public class StaticUsage {

	/**
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		MyMobile wifeMobile = new MyMobile("Sentamil", 9677039862l);
		MyMobile momMobile = new MyMobile("Malarkodi", 8220524924l);
		MyMobile dadMobile = new MyMobile("Nagarajan", 9486840198l);
		MyMobile myPersonalMobile = new MyMobile("Murugan", 9677079797l);
		MyMobile myOfficialMobile = new MyMobile("Murugan", 7401631601l);
		MyMobile.dispalyTotalMobileCount();
		
		System.out.print("\nMy details: ");
		myPersonalMobile.displayAllDetails();
	}

}

// To keep track of all my mobiles
class MyMobile {

	// Changes to each mobile - hence a instance variable
	public long mobileNumber;

	// All mobile's are bought by me, so I will be owner for it, so it will
	// be common for all objects/mobile's hence declared as class level variable

	// Final key word is used, because it is not going to change.
	// For Math.PI - Never changes
	private final static String ownerName = "Murugan Nagarajan";

	// Current user - depends on the person who is using that number
	public String currentUser;

	// To keep count of total mobile, let have a count of mobile's.
	public static int mobileCount;

	// Lets make use of the mobile count variable as a Id for that mobile object
	// Something similar to a IMEI number
	public int mobileId;

	public MyMobile() {
		mobileCount++;
		this.mobileId = mobileCount;
	}

	public MyMobile(String mobileUser, long mobileNumber) {
		this();
		this.currentUser = mobileUser;
		this.mobileNumber = mobileNumber;
		displayAllDetails();
	}

	void displayAllDetails() {
		System.out.println("Mobile/Object Id :" + this.mobileId + " , "
				+ "Mobile UserName :" + this.currentUser + " , "
				+ "Mobile Number :" + this.mobileNumber + " , "
				+ "Mobile Owner :" + ownerName);
	}

	// Only Static methods can access only the static variables not the instance
	// variables but the vice versa is possible, Instance methods can access
	// both static & instance as shown in the above method
	public static void dispalyTotalMobileCount() {
		System.out.println("Number of total mobiles owned by " + ownerName
				+ " is " + mobileCount);
	}
}
