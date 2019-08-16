/* Created by Murugan_Nagarajan on 12/26/2017 */
package com.tamil.learn.java.features.eight.inheritance;

public class DiamondProblem {
    public static void main(String args[])
    {
        Vehicle v = new Vehicle();
        v.drive();
    }
}

interface Car
{
    default void drive()
    {
        System.out.println("Car is driving");
    }

    static void keyOn() {
        System.out.println("Car is Started");
    }

    void accelerate();

    default void accessDoor(){
        System.out.println("Open/Close the Car door");
    };
}
interface Bike
{
    default void drive()
    {
        System.out.println("Bike is driving");
    }

    static void keyOn() {
        System.out.println("Bike is Started");
    }

    void accelerate();

    default void applyStand() {
        System.out.println("Apply stand while starting/stopping the bike");
    }
}

class Vehicle implements Car, Bike
{
    //Comment the below override method to see the diamond problem
    //compilation issue

    /* The child class must override the interface
    defaults if there are multiple implementations */
    @Override
    public void drive()
    {
        /*Not necessary to override the static method even when there are multiple implementations*/
        Car.keyOn();
        Bike.keyOn();

        System.out.println("Vehicle is driving");

        //If we still need the super/parent class implementation of one of the defaults
        //use the super keyword of the required class
        Car.super.drive();
        Bike.super.drive();

        /* accessDoor and applyStand are default methods which are implemented only once*/
        /* so there is no confusion during runtime which one to execute*/
        this.accessDoor();
        this.applyStand();
        this.accelerate();

        if(this.getClass().getSuperclass().isInstance(Car.class)) {
            this.accessDoor();
        }
        if(this.getClass().getSuperclass().isInstance(Bike.class)) {
            this.applyStand();
        }

        this.accelerate();
    }

    // The optional methods should be implemented for must.
    @Override
    public void accelerate() {
        System.out.println("Increase/Decrease the speed");
    }

}


