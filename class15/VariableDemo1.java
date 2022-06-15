package com.syntax.class15;

public class VariableDemo1 {

    String name; //Instance variable
    static int num = 5; //static

    void printName(){
        String name="local"; //local variable
        System.out.println(name);
    }

    public static void main(String[] args) {
        VariableDemo1 v=new VariableDemo1();
        v.printName();
        System.out.println(VariableDemo1.num);
    }

}
