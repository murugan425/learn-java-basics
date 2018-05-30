/* Created by Murugan_Nagarajan on 5/30/2018 */
package com.tamil.learn.java.basics.snippets;

/**
 * @author Murugan_Nagarajan
 * @created date 5/30/2018 / 9:09 PM
 */
public class AreaCalculatorMethods {
    public static void main(String[] args) {
        System.out.println(area(5.0));
        System.out.println(area(-1));
        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1, 4));
    }

    public static double area(double radius) {
        if(radius < 0) {
            return -1;
        }
        return Math.PI * radius * radius;
    }

    public static double area(double x, double y) {
        if(x < 0 || y < 0) {
            return -1;
        }
        return x * y;
    }
}
