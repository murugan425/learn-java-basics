/**
 * @author	: Murugan_Nagarajan
 * @date	: Jun 13, 2015
 * @time	: 10:02:21 AM
 */
package com.tamil.learn.java.basics;

/**
 * @author Murugan_Nagarajan
 *
 */
public class MultiDimensionalArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Simple Array
		int[] iaSingleArray = {0, 5, 1, 8, 3};
		
		//Muliti Array
		int[][] iaMultiArray = {
				{1,2,3},
				{4,5,6,1},
				{7,8,9},
				iaSingleArray
		};
		
		String[][] iaMultiArray2 = new String[4][20];
		
		iaMultiArray2[3][11] = "Murugan";
		
		for(int row=0; row<iaMultiArray.length; row++) {
			for(int col=0; col<iaMultiArray[row].length; col++) {
				System.out.print(iaMultiArray[row][col]+"\t");
			}
			System.out.print("\n");
		}
		System.out.print("\n============================================\n\n");
		
		for(int row=0; row<iaMultiArray2.length; row++) {
			for(int col=0; col<iaMultiArray2[row].length; col++) {
				System.out.print(iaMultiArray2[row][col]+"\t");
			}
			System.out.print("\n");
		}

	}

}
