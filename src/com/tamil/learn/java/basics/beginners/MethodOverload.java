/* Created by Murugan_Nagarajan on 5/30/2018 */
package com.tamil.learn.java.basics.beginners;

/**
 * @author Murugan_Nagarajan
 * @created date 5/30/2018 / 4:23 PM
 */
public class MethodOverload {
    public static void main(String []args) {
        if(calcFeetAndInchesToCentimeters(78, 10) < 0) {
            System.out.println("Invalid Inputs");
        };
        if(calcFeetAndInchesToCentimeters(345) < 0) {
            System.out.println("Invalid Inputs");
        };
        if(calcFeetAndInchesToCentimeters(-44) < 0) {
            System.out.println("Invalid Inputs");
        };
        if(calcFeetAndInchesToCentimeters(56, -34) < 0) {
            System.out.println("Invalid Inputs");
        };
    }

    /*public static void calcFeetAndInchesToCentimeters(double feet, double inches) {
        double cm = 0;
        if(feet > 0 && (inches > 0 && inches <= 12)) {
            cm = inches * 2.54 + feet * 12 * 2.54;
            System.out.println(feet + " feet & "+ inches + " inches = " + cm + " centimeters");
        } else {
            System.out.println("Invalid Inputs");
        }
    }

    public static void calcFeetAndInchesToCentimeters(double inches) {
        double cm = 0;
        if(inches >= 0 && inches <= 12) {
            cm = inches * 2.54;
            System.out.println(inches + " inches = " + cm + " centimeters");
        }
        else {
            System.out.println("Invalid Inputs");
        }
    }*/
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if(feet < 0 || inches < 0 || inches > 12) {
            return -1;
        }
        double cm = inches * 2.54 + feet * 12 * 2.54;
        System.out.println(feet + " feet & "+ inches + " inches = " + cm + " centimeters");
        return cm;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if(inches < 0) {
            return -1;
        }
        double feets = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches = " + feets +" feet and " + remainingInches + " inches");
        return calcFeetAndInchesToCentimeters(feets, remainingInches);
    }
}
