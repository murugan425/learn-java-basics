/**
 * 
 */
package com.tamil.learn.java.basics.snippets;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.zip.GZIPInputStream;

import org.apache.commons.lang3.StringUtils;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Murugan_Nagarajan
 *
 */
//This class helps to decompress all the *.gz files in a directory 
@Slf4j
public class FilesDecompressor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String directoryPath = "C:\\subs\\utst";
		try (Stream<Path> walk = Files.walk(Paths.get(directoryPath))) {
			List<String> fileslist = walk.filter(Files::isRegularFile).filter(file -> file.endsWith(".gz"))
					.map(x -> x.getFileName().toString()).collect(Collectors.toList());
			log.info("NUMBER OF FILES TO BE DECOMPRESSED: " + fileslist.size());
			fileslist.forEach(gzfile -> {
				log.info(gzfile);
				String targetfile = StringUtils.substring(gzfile, 0, gzfile.length()-3);				
				FileInputStream fis;
				try {
					fis = new FileInputStream(directoryPath + File.separator + gzfile);
					GZIPInputStream gzis = new GZIPInputStream(fis);
					FileOutputStream fos = new FileOutputStream(directoryPath + File.separator + targetfile);
					byte[] buffer = new byte[2048];
					int length;
					while ((length = gzis.read(buffer)) > 0) {
						fos.write(buffer, 0, length);
					}
					gzis.close();
					fos.close();
				} catch (FileNotFoundException e) {
					log.error("Exception occurred while trying to read the zipped file " + gzfile +". Exception Details: " + e.getMessage());	
				} catch (IOException e) {
					log.error("Exception occurred while trying to write to target file " + targetfile +". Exception Details: " + e.getMessage());
				}
				log.info(targetfile);
			});	
		} catch (IOException e) {
			log.error("Exception occurred while trying to access the file directory " + directoryPath +". Exception Details: " + e.getMessage());	
		}
		finally {
			log.info("FILES DECOMPRESSED SUCCESSFULLY");
		}
	}

}
