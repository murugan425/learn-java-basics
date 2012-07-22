/**
 * LearnJavaBasics
 */
package org.learnjavabasics.overview;


/**
 * @author MURUGAN NAGARAJAN
 * @created date Jul 14, 2012 / 9:42:50 PM
 */
public class RoomArea {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		float area;
		
		Room room1 = new Room();
		room1.getdata(5, 4);
		area = room1.length * room1.breadth;
		System.out.println("Area of the room is :::" + area);

	}	

}
