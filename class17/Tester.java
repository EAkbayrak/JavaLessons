package com.syntax.class17;

import com.syntax.class16.Dog;

public class Tester {
    public static void main(String[] args) {

        Employee employee = new Employee();

        /*
        if classes exist inside the same package they are imported automatically
         */

        Dog dog = new Dog();
        employee.name="Emre"; // this method is public
     //   employee.salary=150000; // this doesn't work because in the Employee class the salary method is private
        employee.department="IT Saver"; // its default and its in the same package so its accessible
        employee.printDepartment(); // its

    }
}
