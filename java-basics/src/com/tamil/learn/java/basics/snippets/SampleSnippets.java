/**
 * 
 */
package com.tamil.learn.java.basics.snippets;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

/**
 * @author atpsmnn
 *
 */
public class SampleSnippets {

	static Random rand;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		rand = new Random(); 
		DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();       
        // IntStream.range(1, 25).forEach(o->System.out.println(String.valueOf(rand.nextInt(6)+1)));      
        // System.out.println(Integer.valueOf("000"));
		System.out.println(Arrays.asList("S,T,U"));
        System.out.println(LocalDate.now().plusMonths(23));
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("YYYYMMDD");
        System.out.println(LocalDate.now().plusMonths(23).format(DateTimeFormatter.BASIC_ISO_DATE));
        System.out.println("Performance Test Data : %s".length());
        // System.out.println(IntStream.range(1, 999).filter(i -> i != 0).);
        // IntStream.range(1, 25).forEach(o-> { Integer i = rand.nextInt(999); if(i==0) i++; System.out.println(i);});
        IntStream.range(1, 100).forEach(o-> System.out.println(ThreadLocalRandom.current().nextInt(999)));
        
	}

}
