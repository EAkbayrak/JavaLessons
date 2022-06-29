package com.syntax.Class24;

public abstract class Phone {

    abstract void  displayPictures();
    abstract void unlock();

}

class Iphone extends Phone{
    @Override
    void displayPictures() {
        System.out.println("Use the Photo app");
    }

    @Override
    void unlock() {
        System.out.println("use FaceID to unlock the phone");
    }
}

class Samsung extends Phone{
    @Override
    void displayPictures() {
        System.out.println("Use the Gallery app to display pictures");
    }

    @Override
    void unlock() {
        System.out.println("User Finger print sensor or face unlock to unlock your phone");
    }
}

class tester{

    public static void main(String[] args) {
        Phone phone = new Samsung();
        phone.displayPictures();

    }

}
