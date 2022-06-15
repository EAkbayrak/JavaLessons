package com.syntax.class15;

public class Task1 {

    void printLarger(int a, int b){
        int larger =0;
        if (a > b){
            larger=a;
        }else if( b>a){
            larger=b;
        }else {
            larger = 0;
        }

        System.out.println(larger);

    }
}
