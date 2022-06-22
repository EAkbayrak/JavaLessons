package com.syntax.class17;

public class Dog {
    // constructor class
    String name;
    String breed;
    String color;
    int age;
    double weight;

    void printInfo(){
        System.out.println("Name: "+ name+ " Breed: "+breed+" colour: "+color);

    }
    public static void main(String[] args) {
        Dog dog1 = new Dog();

        dog1.name="Johny";
        dog1.color="black";
        dog1.breed="Pitbull";
        dog1.age= 13;
        dog1.weight=15;
        dog1.printInfo();

    Dog dog2 = new Dog();

    dog2.name="Johny";
    dog2.color="black";
    dog2.breed="Pitbull";
    dog2.age= 13;
    dog2.weight=15;
    dog2.printInfo();

}}
