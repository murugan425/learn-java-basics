/**
 * @author	: Murugan_Nagarajan
 * @date	: Jul 3, 2015
 * @time	: 6:48:22 PM
 */
package com.tamil.learn.java.basics.snippets;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * @author Murugan_Nagarajan
 *
 */
public class GetTimeZoneTime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Get a time Zone Timestamp
		Calendar c = Calendar.getInstance();
	    Date date = c.getTime(); //current date and time in UTC
	    System.out.println("UTC Time:: "+date.toString());
	    SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
	    df.setTimeZone(TimeZone.getTimeZone("Europe/London")); //format in given timezone
	    String strDate = df.format(date);
	    System.out.println("Time :: " + date.toString());
	    System.out.println("Europe Time:: " + strDate.toString());
	}

}
