/**
 * @author	: Murugan_Nagarajan
 * @date	: Jun 27, 2015
 * @time	: 10:50:52 PM
 */
package com.tamil.learn.java.basics.accessspecifiers.living;

/**
 * @author Murugan_Nagarajan
 *
 */
public class Animals {

	private String category; 
	// Can be accessed only by methods outside the classes.
	protected String family; // Can be accessed in child classes.

	/**
	 * 
	 */
	public Animals() {
		System.out.println("Creating Animal obj..,");
	}

	/**
	 * @return the name
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}

}

class SomeAnimalSubclass {
	void printSomething() {
		System.out.println("Do something..,");
	}
}

//But we can use access specifier like private/protected for a class.
//Access specifiers are only for methods & variables.
/*private class SomePrivateAnimalSubclass {
	void printSomething() {
		System.out.println("Do something..,");
	}
}*/
