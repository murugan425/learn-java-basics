/**
 * 
 */
package com.tamil.learn.java.basics.files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * @author atpsmnn
 *
 */
public class CsvFileWriter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		createFile("test");
	}

	public static void createFile(String file) {
		List<List<String>> rows = Arrays.asList(
		    Arrays.asList("Jean", "author", "Java"),
		    Arrays.asList("David", "editor", "Python"),
		    Arrays.asList("Scott", "editor", "Node.js")
		);
		try {					
			FileWriter csvWriter = new FileWriter(file+".csv");
			csvWriter.append("Name");
			csvWriter.append(",");
			csvWriter.append("Role");
			csvWriter.append(",");
			csvWriter.append("Topic");
			csvWriter.append("\n");

			for (List<String> rowData : rows) {
			    csvWriter.append(String.join(",", rowData));
			    csvWriter.append("\n");
			}

			csvWriter.flush();
			csvWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
