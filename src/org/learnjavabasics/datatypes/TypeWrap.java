/**
 * LearnJavaBasics
 */
package org.learnjavabasics.datatypes;

/**
 * @author MURUGAN NAGARAJAN
 * @created date Jul 22, 2012 / 9:47:56 AM
 */
public class TypeWrap {

	/**
	 * @param args
	 */
	static public void main(String[] args) {
		System.out.println("Variables Created.");
		char c = 'x';
		byte b = 50;	//1 byte
		short s = 32767;	//2 byte
		int i = 2147483647;	//4 byte
		long l = 9223372036854775807l;	//8 byte
		float f1 = 3.142f;	//4 byte
		float f2 = 3.4e+38f;	//4 byte
		double d = 1.7e+308;	//8 byte
		
		System.out.println(" c = "+ c);
		System.out.println(" b = "+ b);
		System.out.println(" s = "+ s);
		System.out.println(" i = "+ i);
		System.out.println(" l = "+ l);
		System.out.println(" f1 = "+ f1);
		System.out.println(" f2 = "+ f2);
		System.out.println(" d2 = "+ d);
		System.out.println("  ");
		
		System.out.println("Type Converted");
		
		short s1 = (short)b;
		short s2 = (short)i;
		float n1 = (float)l;
		int m = (int)f1;
		
		System.out.println("(short)b ="+ s1);
		System.out.println("(short)i ="+ s2);
		System.out.println("(short)l ="+ n1);
		System.out.println("(int)f="+ m);

	}

}
