package com.syntax.class16;

public class StaticDemo {

    static int noOfEmployees=10;
    String name;

    static void method1(){
        System.out.println(noOfEmployees);
        // System.out.println(name) will not work because each object will have a separate copy
        // of this name - variable java gets confused

    }

    void method2(){
        noOfEmployees=50;
        name="Luv luv luv";
    }

    public static void main(String[] args) {
        StaticDemo st=new StaticDemo();
        st.name="Omid";

        StaticDemo st2=new StaticDemo();
        st2.name="Emre";

    }


}
