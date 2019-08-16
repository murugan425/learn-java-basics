/**
 * LearnJavaBasics
 */
package com.tamil.learn.java.basics.operators;

import java.io.DataInputStream;
import java.io.IOException;

/**
 * @author Murugan Nagarajan
 * @created date 31-Jul-2012 / 6:56:48 PM
 */
public class DistanceFormula {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws NumberFormatException, IOException {
		//Variable Declaration.
		int timeIncrement = 0, time =0; //Time in hrs
		float acceleration, velocity;
		
		DataInputStream in = new DataInputStream(System.in);
		
		//Getting the input variable.
		System.out.print("Enter the velocity ::");
		velocity = Float.valueOf(in.readLine()).floatValue();
		System.out.print("Enter the acceleration ::");
		acceleration = Float.valueOf(in.readLine()).floatValue();
		System.out.print("Enter the time interval for which distance needs to be measured ::");
		timeIncrement = Integer.parseInt(in.readLine());
		System.out.println("************************************");
		System.out.println("     TIME     |||     DISTANCE     ");
		System.out.println("************************************");
		for (int i=0; i < 10 ; i++) { 
			double distance = velocity * time + (acceleration*Math.pow(time, 2)/2);
			System.out.println("      "+time+"             "+distance+"     ");
			time += timeIncrement;
		}
		System.out.println("************************************");
	}

}
