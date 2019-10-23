/**
 * @authour	: Murugan_Nagarajan
 * @date	: Jun 11, 2015
 * @time	: 11:47:40 PM
 */
package com.tamil.learn.java.basics.beginners;

/**
 * @author Murugan_Nagarajan
 *
 */
public class Variables {

	/**
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		//For primitive types the memory will be allocated 
		//once they are declared, not the case for objects
		//like String
		int iNumber = 425;
		short sNumber = 25;
		long lNumber = 4590l;
		
		double dNumber = 239.987889786565d;
		float fNumber = 456.2384f;
		
		char cCharacter = '\u0000';
		boolean bFlag = true;
		byte byteEightBits = 127;
		
		byte alpha = 1; 	//1 byte -128 to 127 == 256 max = 2pow8
		short beta = 32767; 	//2 bytes - 2 pow 16
		int gamma = 2147483647;	//4 bytes - 2 poe 32
		long delta = -9223372036854775808l; //8 bytes - 2 pow 64
		
		
		System.out.println("int  :" + iNumber);
		System.out.println("short  :" + sNumber);
		System.out.println("long  :" + lNumber);
		System.out.println("double  :" + dNumber);
		System.out.println("float  :" + fNumber);
		System.out.println("char  :" + cCharacter);
		System.out.println("boolean  :" + bFlag);
		System.out.println("byte  :" + byteEightBits);
		
		
		System.out.println("Default character is :" + '\u0000');
	}

}
