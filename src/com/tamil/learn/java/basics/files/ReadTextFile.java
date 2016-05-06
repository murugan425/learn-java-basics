/**
 * @author	: Murugan_Nagarajan
 * @date	: Jul 16, 2015
 * @time	: 12:47:34 PM
 */
package com.tamil.learn.java.basics.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Murugan_Nagarajan
 *
 */
public class ReadTextFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Actual Path -
		// D:\Workspace\Java_V1.0\JavaBasics\src\com\tamil\learn\java\basics\files\
		String filePath = "E:\\ProgramData\\Repository\\GITV0.0\\LearnJavaBasics\\src\\com\\tamil\\learn\\java\\basics\\files\\";
		// Here we are adding \\ in the path because in java '\n\b\t' will be
		// considered as special non-printing characters.
		String fileName = "SampleText1.txt";

		File fileObj = new File(filePath + fileName);

		try {
			Scanner fileInput1 = new Scanner(fileObj); // For keyboard input we
														// use System.in
			System.out.println("Simple reading of a file");
			System.out.println("================================");
			while (fileInput1.hasNextLine()) {
				System.out.println(fileInput1.nextLine());
			}
			fileInput1.close();
			System.out.println("================================");
			// Lets analyze the difference between nextLine & nextInt
			Scanner fileInput2 = new Scanner(fileObj);
			int firstLineInt = fileInput2.nextInt();
			/*
			 * nextInt will read only the integers and will not move to the next
			 * line to read/or it will not read the /n character which will
			 * result in a empty blank line introduced.To avoid that use nextLine once.
			 */
			fileInput2.nextLine();
			System.out.println("Integer Value is " + firstLineInt);
			while (fileInput2.hasNextLine()) {
				System.out.println(fileInput2.nextLine());
			}
			fileInput2.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found Exception " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unknown Exception " + e.getMessage());
		}

	}

}
