/* Created by Murugan_Nagarajan on 12/27/2017 */
package com.tamil.learn.java.features.eight.streams;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StreamExample2 {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        for(int i=0; i<15; i++) myList.add(i);

        System.out.println(sumStream(myList));

    }

    //Stream implementation to filter a list
    private static int sumStream(List<Integer> list) {
        return list.stream().filter(i -> i > 10).mapToInt(i -> i).sum();
    }

    //Normal way of iteration. Not possible ot do parallel filter
    private static int sumIterator(List<Integer> list) {
        Iterator<Integer> it = list.iterator();
        int sum = 0;
        while (it.hasNext()) {
            int num = it.next();
            if (num > 10) {
                sum += num;
            }
        }
        return sum;
    }
};


