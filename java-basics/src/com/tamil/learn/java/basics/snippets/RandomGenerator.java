/**
 * 
 */
package com.tamil.learn.java.basics.snippets;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.apache.commons.lang3.RandomStringUtils;

import com.tamil.learn.java.basics.packages.country.City;

/**
 * @author atpsmnn
 *
 */
public class RandomGenerator {

	static Random rand;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		RandomStringUtils randStr = new RandomStringUtils();	
		List<String> someNum = new ArrayList<String>();
    	IntStream.range(1, 150).forEach(i -> someNum.add(randStr.randomNumeric(4)));  
    	System.out.println(someNum);
    	
		List<City> city = IntStream.range(0, 10).mapToObj(o -> new City()).collect(Collectors.toList());
		List<Employee> emp = IntStream.range(0, 10).mapToObj(o -> new Employee()).collect(Collectors.toList());
		System.out.println(city);
		System.out.println(emp);
    	
		rand = new Random();       
        IntStream.range(1, 10).forEach(i ->
        System.out.println(String.format("%02d", rand.nextInt(23)) + String.format("%02d", rand.nextInt(59))));
	}
}

class Employee {
	
	public Employee() {
		this.name = "";
	}
	
	String name;
}
