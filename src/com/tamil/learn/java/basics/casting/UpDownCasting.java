/**
 * @author	: Murugan_Nagarajan
 * @date	: Jul 10, 2015
 * @time	: 12:13:44 AM
 */
package com.tamil.learn.java.basics.casting;

/**
 * @author Murugan_Nagarajan
 *
 */
public class UpDownCasting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Parent p1 = new Parent();
		Children c1 = new Children();
		GrandChildren g1 = new GrandChildren();
		
		p1.displayInfo();
		c1.displayInfo();
		c1.displayChildInfo();
		g1.displayInfo();
		g1.displayChildInfo();
		g1.displayGrandChildInfo();
		
		System.out.println("=============================");
		System.out.println("Now lets do some type casting of user defined objects");
		System.out.println("=============================");
		
		//Up-Casting
		Parent pc1 = new Children();
		pc1.displayInfo();
		//pc2.displayChildInfo(); //This is same concept of polymorphism.So error will be here.
		//We will be able to call only a common/overridden method in a child class not all.
		//So how to access the other class - possible by downcasting...,
		System.out.println("=============================");
		//Down-Casting
		Parent pc2 = new Children();
		Children cp2 = (Children)pc2;
		//We have mapped cp2 to a parent class object which is type casted to a children
		//which means indirectly we are able to access the children class methods using parent obj.
		//But try avoiding down casting - so much confusion.
		cp2.displayInfo();
		cp2.displayChildInfo();
		System.out.println("=============================");
		//Now lets dig still further..,
		Parent pcg1 = new GrandChildren(); //Upcasting of parent to grandchildren.
		pcg1.displayInfo();
		System.out.println("=============================");
		Parent pcg2 = new GrandChildren();
		GrandChildren gcp2 = (GrandChildren)pcg2;
		gcp2.displayInfo();
		gcp2.displayChildInfo();
		gcp2.displayGrandChildInfo();
		System.out.println("=============================");
		//We cannot type cast a parent object to a child object.
		//Exception in thread "main" java.lang.ClassCastException
		/*
		Children cp1 = (Children)new Parent();
		cp1.displayInfo();
		cp1.displayChildInfo();
		*/
		
	}

}

class Parent {
	public void displayInfo() {
		System.out.println("We are parents...,");
	}
}

class Children extends Parent {
	public void displayInfo() {
		System.out.println("We are childrens...,");
	}
	public void displayChildInfo() {
		System.out.println("We are born to parents...,");
	}
}

class GrandChildren extends Children {
	public void displayInfo() {
		System.out.println("We are grandchildrens...,");
	}
	public void displayChildInfo() {
		System.out.println("We are parents of grandchildren and born to their super parents...,");
	}
	public void displayGrandChildInfo() {
		System.out.println("We are born to childrens of parent...,");
	}	
}

