package com.syntax.class18;

public class ThisKeyWordDemo {
    String name="Instance";
    void printName(){
        String name="Local";
        System.out.println(this.name);  // This prints the instance name
        System.out.println(name);       // This prints the local name
    }

    public static void main(String[] args) {
        ThisKeyWordDemo t = new ThisKeyWordDemo();
        t.printName();
    }
}
