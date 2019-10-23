/* Created by Murugan_Nagarajan on 12/26/2017 */
package com.tamil.learn.java.features.eight.lambda;

import java.util.function.DoubleToIntFunction;

public class LambdaExample1   {
    public static void main(String[] args) {
        FunctionalImpl f = new FunctionalImpl();

        f.method1("Method1 of functional class");
        f.method2("Method2");

        //Even without implementing we can get access to a interface.
        FuntionalInterfaceExample1 lambdaExpression = (str) -> {
            System.out.println("Lambda method overriding Implementation");
            System.out.println(str);
        };
        lambdaExpression.method1("Lambda Method1");

    }
}

class FunctionalImpl implements FuntionalInterfaceExample1 {

    @Override
    public void method1(String str) {
        System.out.println("Normal way of  method overriding Implementation");
        System.out.println(str);
    }
}
