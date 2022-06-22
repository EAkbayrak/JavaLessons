package com.syntax.class18;

public class CarTester {
    public static void main(String[] args) {
        Car car1 = new  Car("Merc", "C-Class", "red" );
        car1.printInfo();

        Car car2 = new Car("toyota", "Camry","White");
        car2.printInfo();

        car1.printCarModel();
    }
}
