package com.Java.Oops.Properties.polymorphism;

public class Shapes {

    void info(){
        System.out.println("i am in Shapes");
    }

    //overloading - different argument with same name
     static void area(int a){
        System.out.println("area of square");
        System.out.println(a*a);
    }

    static void area(int a, int b){
        System.out.println("area of rectangle");
        System.out.println(a*b);
    }
    // final void area(){
    //     System.out.println("i am in shapes");
    //     }

}
