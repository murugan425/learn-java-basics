/**
 * 
 */
package com.tamil.learn.java.basics.files;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

import lombok.extern.slf4j.Slf4j;

/**
 * @author atpsmnn
 *
 */
@Slf4j
public class JsonFileReader {

	/**
	 * @param args
	 */
	public void readJsonData(String dataItem) {

		URL url = getClass().getResource("datasource.json");
		File file = new File(url.getPath());
        List<String> dataItems = new ArrayList<String>();       
       
        JsonFactory jfactory = new JsonFactory();
        try {
			JsonParser jParser = jfactory.createParser(FileUtils.readFileToString(file, StandardCharsets.UTF_8.name()));			
			while (jParser.nextToken() != JsonToken.END_OBJECT) {
				String fieldname = jParser.getCurrentName();
				if(dataItem.equals(fieldname)) {
					jParser.nextToken();
			        while (jParser.nextToken() != JsonToken.END_ARRAY) {
			        	dataItems.add(jParser.getText());
			        }
				}				
	        }			
			jParser.close();
		} catch (JsonParseException e) {
			log.error("Exception occurred while parsing the Json data" + e.getMessage());		
		} catch (IOException e) {
			log.error("Exception occurred while reading the Json file" + e.getMessage());
		}
        System.out.println(String.format("List of %s retreived from JSON datasource", dataItem));
        dataItems.forEach(System.out::println);
        //System.out.println(dataItems.stream().count());
        //System.out.println(dataItems.stream().distinct().count());
        //dataItems.stream().distinct().forEach(loc -> System.out.println(String.format("\"%s\",", loc)));
	}

}
