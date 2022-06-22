package com.syntax.class19;

public class Dog extends Animal{
    Dog(String name,String color){
        this.name=name; // using extends keyword we
        // are able to access the name field from the animal class
        this.color=color;
    }

}

