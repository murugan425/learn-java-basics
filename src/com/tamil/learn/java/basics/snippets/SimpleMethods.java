/* Created by Murugan_Nagarajan on 5/30/2018 */
package com.tamil.learn.java.basics.snippets;

/**
 * @author Murugan_Nagarajan
 * @created date 5/30/2018 / 1:14 PM
 */
public class SimpleMethods {
    public static void main(String[] args) {
        MegaBytesConverter mbConverter = new MegaBytesConverter();
        mbConverter.printMegaBytesAndKiloBytes(2050);

        BarkingDog barkingDog = new BarkingDog();

        System.out.println(barkingDog.bark(true, 1));
        System.out.println(barkingDog.bark(false, 2));
        System.out.println(barkingDog.bark(true, 8));
        System.out.println(barkingDog.bark(true,-1));

        LeapYear isLeapCheck = new LeapYear();
        System.out.println(isLeapCheck.isLeapYear(-1600));
        System.out.println(isLeapCheck.isLeapYear(1600));
        System.out.println(isLeapCheck.isLeapYear(2017));
        System.out.println(isLeapCheck.isLeapYear(2000));
    }
}

class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kbytes) {
        if(kbytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int mbytes = kbytes / 1024;
            int remKb = kbytes % 1024;
            System.out.println(kbytes + " KB = " + mbytes + " MB and " + remKb + " KB");
        }
    }
}

class BarkingDog {
    public static boolean bark(boolean barking, int hourOfDay){
        boolean wakeUpInd = false;
        /*if(hourOfDay < 0 || hourOfDay > 23) {
            wakeUpInd = false;
        } else*/ if((hourOfDay >= 0 && hourOfDay <= 23) && (hourOfDay < 8 || hourOfDay > 22) && barking) {
            wakeUpInd = true;
        }
        return wakeUpInd;
    }
}

class LeapYear {
    public static boolean isLeapYear(int year) {
        boolean isLeap = false;
        /*if(year < 0 || year > 9999) {
            return isLeap;
        }
        else */if ((year > 0 && year <= 9999) && (year%4 == 0 && year%100 !=0 || year%400 == 0)){
            isLeap = true;
        }
        return isLeap;
    }
}