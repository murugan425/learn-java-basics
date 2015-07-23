/**
 * @author	: Murugan_Nagarajan
 * @date	: Jul 15, 2015
 * @time	: 4:56:41 PM
 */
package com.tamil.learn.java.basics.snippets;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author Murugan_Nagarajan
 *
 */
public class TimeStampToString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
	    Date date = c.getTime(); //current date and time in UTC
	    SimpleDateFormat df = new SimpleDateFormat("dd-MMM-yyyy hh:mm");
	    String strDate = df.format(date);
	    System.out.println("String Time :: " + date.toString());
	    System.out.println("String Formatted Time:: " + strDate.toString());
	}

}
