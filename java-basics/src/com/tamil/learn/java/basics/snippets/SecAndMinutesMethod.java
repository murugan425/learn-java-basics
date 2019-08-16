/* Created by Murugan_Nagarajan on 5/30/2018 */
package com.tamil.learn.java.basics.snippets;

/**
 * @author Murugan_Nagarajan
 * @created date 5/30/2018 / 5:18 PM
 */
public class SecAndMinutesMethod {
    public static void main(String []args) {
        System.out.println(getDurationString(124, 33));
        System.out.println(getDurationString(23595));
    }
    private static String getDurationString(long minutes, int seconds) {
        if(minutes < 0 || seconds < 0 || seconds > 59) {
            return "Invalid Value";
        }
        long hr = minutes / 60;
        long min = minutes % 60;
        return hr + "h " +  min + "m " + seconds + "s ";
    }

    private static String getDurationString(long seconds) {
        long min = seconds / 60;
        int remainingSec = (int) seconds % 60;
        return getDurationString(min, remainingSec);
    }
}
