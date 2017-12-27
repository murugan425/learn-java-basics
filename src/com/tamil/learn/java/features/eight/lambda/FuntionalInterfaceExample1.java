/* Created by Murugan_Nagarajan on 12/26/2017 */
package com.tamil.learn.java.features.eight.lambda;

@FunctionalInterface
public interface FuntionalInterfaceExample1 {
    void method1(String str);
    default void method2(String str) {
        System.out.println("Default Method Implementation " + str);
    };

    static void method3(String str) {
        System.out.println("Static Method Implementation");
    };
}

