package com.syntax.class16;

public class googleEmployees {
    String name;
    double salary=25000;
    static int noOfEmployees; // as this will be used everywhere in the class
    static String companyName; // this name won't change across the class, so it's best to save memory save

    void displayEmployeeInfo(){
        System.out.println("Name "+name +", Salary is  "+ salary+ "  Company name: "+ companyName);
    }

    public static void main(String[] args) {

        googleEmployees emp1 = new googleEmployees();

        emp1.name="Emre";
        emp1.salary=250000;
        emp1.noOfEmployees=500;
        emp1.companyName="Google";

        googleEmployees emp2 = new googleEmployees();

        emp2.name="Adem";
        emp2.salary=25000;
        emp2.noOfEmployees=5;
        emp2.companyName="Google now";

        emp1.displayEmployeeInfo();
    }


}
