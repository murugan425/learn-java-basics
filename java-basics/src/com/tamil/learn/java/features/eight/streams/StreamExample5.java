/**
 * 
 */
package com.tamil.learn.java.features.eight.streams;

import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * @author atpsmnn
 *
 */
public class StreamExample5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Intermediate & Terminal Operations on Stream.
		//Stream can't be used once the terminal operation is performed.
		Stream<String> numStream1 = Stream.of("I890", "I372", "I234", "I640", "I291");
		Stream<String> numStream2 = Stream.of("I530", "I372", "I852", "I702", "I842");
		
		//System.out.println(numStream1.count());
		System.out.println(Stream.concat(numStream1, numStream2).distinct().count());
		//IllegalStateException:: stream has already been operated upon or closed
		//System.out.println(Stream.concat(numStream1, numStream2).count());
				
		//User Suppliers if the stream data needs to be reused multiple times
		Supplier<Stream<String>> numStreamSupplier1 = () -> Stream.of("I890", "I372", "I234", "I640", "I291");
		Supplier<Stream<String>> numStreamSupplier2 = () -> Stream.of("I530", "I372", "I852", "I702", "I842");
		
		System.out.println(Stream.concat(numStreamSupplier1.get(), numStreamSupplier2.get()).distinct().count());
		System.out.println(Stream.concat(numStreamSupplier1.get(), numStreamSupplier2.get()).count());
		
		System.out.println(Stream.concat(numStreamSupplier1.get(), numStreamSupplier2.get()).distinct().sorted().peek(System.out::println).count());
		
	}

}
