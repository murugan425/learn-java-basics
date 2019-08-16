/* Created by Murugan_Nagarajan on 12/27/2017 */
package com.tamil.learn.java.features.eight.streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.*;

public class StreamExample3 {
    //Stream Of Collection
    Collection<String> collection = Arrays.asList("a", "b", "c");
    Stream<String> streamOfCollection = collection.stream();

    //Stream of Array
    Stream<String> streamOfArray = Stream.of("a", "b", "c", "d", "e");

    //Passing array as a datasource for stream
    String[] arr = new String[]{"a", "b", "c", "d", "e"};
    Stream<String> streamOfArrayFull = Arrays.stream(arr);
    Stream<String> streamOfArrayPart = Arrays.stream(arr, 1, 4);


}
