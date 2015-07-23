/**
 * @author	: Murugan_Nagarajan
 * @date	: Jul 11, 2015
 * @time	: 10:30:58 PM
 */
package com.tamil.learn.java.basics.generics;

import java.util.ArrayList;

class Engine {
	public void start() {
		System.out.println("Start the Engine...,");
	}
	@Override
	public String toString() {
		return "I'm a Engine";
	}
}

class Bike extends Engine {
	
	public Bike () {
		System.out.println("Bike object is created");
	};
	
	public void start() {
		System.out.println("Start the Bike...,");
	}
	@Override
	public String toString() {
		return "I'm a Bike";
	}
}

class Car extends Engine {
	
	public Car () {
		System.out.println("Car object is created");
	};
	
	public void start() {
		System.out.println("Start the Car...,");
	}
	
	@Override
	public String toString() {
		return "I'm a Car";
	}
}
/**
 * @author Murugan_Nagarajan
 *
 */
public class Wildcards {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Engine> listOfEng = new ArrayList<Engine>();
		listOfEng.add(new Engine());
		listOfEng.add(new Engine());
		
		ArrayList<Bike> listOfBikes = new ArrayList<Bike>();
		listOfBikes.add(new Bike());
		listOfBikes.add(new Bike());
		
		ArrayList<Car> listOfCars = new ArrayList<>();
		listOfCars.add(new Car());
		listOfCars.add(new Car());
		
		startEngines(listOfEng);
		startBikes(listOfBikes);
		startCars(listOfCars);
		
		//Make use of Wilcards -
		startUnknownMachine(listOfBikes);
		//startUnknownMachine(listOfCars);
		
		
		startMachExtendsEngine(listOfCars);
		startMachExtendsEngine(listOfBikes);
		startMachExtendsEngine(listOfEng);
		
	}


public static void startEngines(ArrayList<Engine> listOfEngines) {
	for(Engine engObj : listOfEngines) {
		engObj.start();
	}
	System.out.println("=================================");
}

public static void startBikes(ArrayList<Bike> listOfBikes) {
	for(Bike bikeObj : listOfBikes) {
		bikeObj.start();
	}
	System.out.println("=================================");
}

public static void startCars(ArrayList<Car> listOfCars) {
	for(Car carObj : listOfCars) {
		carObj.start();
	}
	System.out.println("=================================");
}


public static void startUnknownMachine(ArrayList<?> listOfMachines) {
	for(Object unknownObj : listOfMachines) {
		System.out.println(unknownObj);
	}
	//If you need to call any methods specific to a object like Car or Bike, 
	//then do a casting here inside the loop..,
	for(Object unknownObj : listOfMachines) {
		Bike bikeObj = (Bike)unknownObj;
		bikeObj.start();
	}
	//But this might be result in type cast exception if you passed a car object list.
	//So we can go for the next method where we define the wild card by giving a upper bound..,
	System.out.println("=================================");
}

public static void startMachExtendsEngine(ArrayList<? extends Engine> listOfEngines) {
	for(Engine engObj : listOfEngines) {
		engObj.start();
	}
	System.out.println("=================================");
}

}