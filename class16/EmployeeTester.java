package com.syntax.class16;
import com.syntax.class17.Employee;

public class EmployeeTester {
    public static void main(String[] args) {

    Employee ha = new Employee();

    ha.name="Merve";
    ha.printName();
    // ha.department(); this won't work because department method is set to default and they are in different packages

}
}
