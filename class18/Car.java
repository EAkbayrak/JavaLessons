package com.syntax.class18;


// you are not allowed to have two constructors in the same class of parameters of the same type

public class Car {
     String make;
    String model;
    String colour;

    public Car(String carMake, String carModel, String carColour){
       make = carMake;
        model = carModel;
        colour = carColour;
    }

    public Car(){};

    public Car(String carModel){
        model = carModel;
    }

    void printCarModel(){
        System.out.println("Model is "+ model);
    }

    void printInfo(){
        System.out.println("The make of the car is "+make+" and the car model is "+model+ " and the car colour will be " +
                 colour);
    }
}
