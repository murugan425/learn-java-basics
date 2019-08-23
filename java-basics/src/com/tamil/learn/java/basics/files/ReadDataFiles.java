/**
 * 
 */
package com.tamil.learn.java.basics.files;

/**
 * @author atpsmnn
 *
 */
public class ReadDataFiles {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JsonFileReader reader = new JsonFileReader();
		reader.readJsonData("locations");
		reader.readJsonData("weekdays");
	}

}
