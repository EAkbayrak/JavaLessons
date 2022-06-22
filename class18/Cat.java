package com.syntax.class18;

public class Cat {
    String name;
    String breed;
    String colour;
    int age;
    double weight;


    public Cat(String name, String breed, String colour) {
        this.name = name;
        this.breed = breed;
        this.colour = colour;
    }



    public Cat (String name, String breed, String colour, int age, double weight) {
        this.name = name;
        this.breed = breed;
        this.colour = colour;
        this.age = age;
        this.weight = weight;
    }

    void printCatInfo(){
        System.out.println(name+" is "+age+" years old and is of "+breed+" breed with the colour of "+ colour);
    }
}
