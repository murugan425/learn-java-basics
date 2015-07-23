/**
 * @author	: Murugan_Nagarajan
 * @date	: Jul 9, 2015
 * @time	: 8:45:22 PM
 */
package com.tamil.learn.java.basics.casting;

/**
 * @author Murugan_Nagarajan
 *
 */
public class TypeCasting {

	/**
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		byte bValue = 1; 	//1 byte -128 to 127 == 256 max = 2pow8
		short sValue = 32767; 	//2 bytes - 2 pow 16
		int iValue = 2147483647;	//4 bytes - 2 poe 32
		long lValue = -9223372036854775808l; //8 bytes - 2 pow 64
		
		float fValue = 45454.9f;
		double dValue = 874.90932;
		
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Float.MAX_VALUE +"  "+Float.MAX_EXPONENT);
		System.out.println(Double.MAX_VALUE + "   "+Double.MAX_EXPONENT + "  " + (0f/0));
		
		int intCastedValue = (int)lValue;
		double doubCastedValue = sValue;
		int intfloCastedValue = (int)fValue;
		
		System.out.println("===========================");
		System.out.println(intCastedValue);
		System.out.println(doubCastedValue);
		System.out.println(intfloCastedValue);
		System.out.println((byte)134);
		//So always take careful that you have enough memory to cast a variable
		//to a lower memory data type to avoid data lose/truncations.
		
		//Type casting is not possible for User defined/Java Objects can also be achieved 
		//by polymorphism(Down casting/Up casting) - where we use one class/parent class to call a method in a child
		//class.
			
		
	}

}
