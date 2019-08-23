/**
 * 
 */
package com.tamil.learn.java.basics.files;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import org.apache.commons.io.FileUtils;

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
	public void readJsonData() {

		URL url = getClass().getResource("datasource.json");
		File file = new File(url.getPath());
		 
        String content = "";
		try {
			content = FileUtils.readFileToString(file, StandardCharsets.UTF_8.name());
		} catch (IOException e) {
			log.error(e.getMessage());
		}       
        System.out.println(content);
	}

}
