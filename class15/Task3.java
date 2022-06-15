package com.syntax.class15;

public class Task3 {

    // create a method that will print whether the palindrone

    void printIsPalindrome(String str){
        StringBuilder stringBuilder=new StringBuilder(str);
        stringBuilder.reverse();
        String reversedStr = stringBuilder.toString();
        if(str.equalsIgnoreCase(reversedStr)){
            System.out.println(str+" is a palindrome");
        }else {
            System.out.println("String is not palindrone");
        }
    }

}
