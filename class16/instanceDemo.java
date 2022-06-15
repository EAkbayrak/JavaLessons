package com.syntax.class16;

public class instanceDemo {
        String str="instance";
        void strUpdater(){
                str="method1";
        }

        void method(){
                System.out.println(str);
        }

        public static void main(String[] args) {
                instanceDemo id=new instanceDemo();
                System.out.println(id.str);     // prints current value of str which is an instance
                id.str="inst";                  // method once simple prints the value of which is still instance
                id.strUpdater();                // this method changes the instance, value of str will change thereafter
                id.method();                    // prints str new value
                System.out.println(id.str);     // prints str new value
        }


}
