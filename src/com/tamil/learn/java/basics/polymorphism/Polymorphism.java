/**
 * @author	: Murugan_Nagarajan
 * @date	: Jul 6, 2015
 * @time	: 9:08:25 PM
 */
package com.tamil.learn.java.basics.polymorphism;

/**
 * @author Murugan_Nagarajan
 *
 */
public class Polymorphism {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Fish fish1 = new Fish();
		
		JellyFish fish2 = new JellyFish();
		
		WhaleFish fish3 = new WhaleFish();
		
		fish1.showDetails();
		fish2.showDetails();
		fish3.showDetails();
		
		//Polymorphism helps to access the parent by means of child class..
		
		Fish fish4;
		Fish fish5;
		
		fish4 = fish2;
		fish5 = fish3;
		
		//Now using the single refrence of a parent class we can trigger the method
		//from two child classes.
		
		fish4.showDetails();
		fish5.showDetails();
		
		//Lets make it a single parent class..
		Fish fish6;
		
		fish6 = new JellyFish();
		fish6.showDetails();
		
		fish6 = new WhaleFish();
		fish6.showDetails();
		
		showFishInfo(fish2);
		showFishInfo(fish3);
	}
	
	//Now cleaning/refactoring these with a single method..,
	
	public static void showFishInfo(Fish fish) {
		fish.showDetails();
	}

}
