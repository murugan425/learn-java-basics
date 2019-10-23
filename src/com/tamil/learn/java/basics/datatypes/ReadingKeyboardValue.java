/**
 * LearnJavaBasics
 */
package com.tamil.learn.java.basics.datatypes;

import java.io.DataInputStream;
import java.io.IOException;

/**
 * @author MURUGAN NAGARAJAN
 * @created date Jul 19, 2012 / 8:43:33 PM
 */
public class ReadingKeyboardValue {

	/**
	 * @param args
	 */
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		DataInputStream in = new DataInputStream(System.in);
				
		try {
			String name;
			int age;
			float height;
			
			System.out.print("Enter your name:::  ");
			name = in.readLine();			
			System.out.print("Enter your age:::  ");
			age = Integer.parseInt(in.readLine());
			System.out.print("Enter your height:::  ");				
			height = Float.valueOf(in.readLine()).floatValue(); //Else use in.readFloat()
			System.out.println("Your name is entered as ::"+name.toUpperCase()+". \n" +
					"Your age is :: "+age+" and your height is "+height+". \nPls verify....");
		}
		catch (IOException e) {
			System.out.println("IO Exception occured in ReadingKeyboardValue class. \n Exception Details:::"+e.getMessage());
		}
		catch (Exception e) {
			System.out.println("Exception occured in ReadingKeyboardValue class. \n Exception Details:::"+e.getMessage());
		}

	}

}
