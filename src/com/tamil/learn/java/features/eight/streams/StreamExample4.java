/**
 * 
 */
package com.tamil.learn.java.features.eight.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author atpsmnn
 *
 */
public class StreamExample4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> someRandomData = Arrays.asList("N25", "n45", "G43", "G23", "g10", "G12", "U08", "U72", "I75", "I34", "I65", "K70");
		
		//Filter a specific sublist that starts with a given character from above list, sort it and print them.
		//Normal java implementation
		List<String> sublist = new ArrayList<String>();
		System.out.println("Before Sorting");
		someRandomData.forEach(data -> {
			if(data.toUpperCase().startsWith("G")) {
				sublist.add(data.toUpperCase());
				System.out.println(data.toUpperCase());
			}
		});
		sublist.sort((s1,s2)->s1.compareTo(s2));
		System.out.println("After Sorting");
		sublist.forEach(data -> System.out.println(data));
		
		//Method References: String::toUppercase, System.out::println
		//map(String::toUpperCase) == map(s->s.toUppercase())
		
		//JAVA8 implementation - Using Streams
		System.out.println("Using Java Stream to filter, sort and print in a better way");
		someRandomData.stream().map(String::toUpperCase).filter(s->s.startsWith("G")).sorted().forEach(System.out::println);
	}

}
