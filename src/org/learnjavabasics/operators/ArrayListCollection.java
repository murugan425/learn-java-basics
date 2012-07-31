/**
 * LearnJavaBasics
 */
package org.learnjavabasics.operators;

/**
 * @author Murugan Nagarajan
 * @created date 28-Jul-2012 / 7:56:02 AM
 */
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListCollection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Numberinglist(list);
		
		int total = 0;
		Iterator<Integer> iter = list.iterator();
		while(iter.hasNext()) {
			Integer val = iter.next();
			total = total + val;
		}
		System.out.println("The Total Amount is "+ total);		
	}

	private static void Numberinglist(ArrayList<Integer> list) {
		list.add(new Integer(4));
		list.add(new Integer(5));
		list.add(new Integer(6));
		list.add(new Integer(2));
		list.add(new Integer(3));	
	}

}
