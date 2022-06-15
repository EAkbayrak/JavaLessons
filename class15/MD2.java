package com.syntax.class15;

import java.awt.*;

public class MD2 {
    //MethodDemo2

    public static void main(String[] args) {

        int [] arr={10, 20, 30 ,40 ,50};

        ArrayUtils arrayUtils = new ArrayUtils();

        arrayUtils.printArray(arr);

        Task1 large = new Task1();

        large.printLarger(51,2);

        Task3 pali = new Task3();
        pali.printIsPalindrome("lol");


    }


}
