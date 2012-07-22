/**
 * LearnJavaBasics
 */
package org.learnjavabasics.datatypes;

import java.io.DataInputStream;
import java.io.IOException;

/**
 * @author MURUGAN NAGARAJAN
 * @created date Jul 22, 2012 / 11:30:14 AM
 */
public class HarmonicSummation {

	/**
	 * @param args
	 */
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		int harmonicSum = 0;
		DataInputStream in = new DataInputStream(System.in);
		
		System.out.println("Enter the value of N:::::");
		int N = 1;
		try {
			N = Integer.parseInt(in.readLine());
			for (int i=1;i<N;i++) {
				harmonicSum += 1/i; 
			}
			System.out.println("The Harmonic Summation value is " +harmonicSum );			
		} catch (NumberFormatException e) {
			System.out.println("Numeric Exception occured in Harmonic Summation class::" + e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Exception occured in Harmonic Summation class::" + e.getMessage());
			e.printStackTrace();
		}		

	}

}
