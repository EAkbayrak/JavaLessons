package com.syntax.Class23;

public class Animal {

    void eat(){
        System.out.println("All the animal eat");
    }
}

class Panda extends Animal{
    // no other class can inherit from animal class because it is declared final
}