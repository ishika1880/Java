package com.Java.Oops.Properties.inheritance;

public class Child extends Parents {

    int standard;
    public Child(){
        this.standard = 0;
    }
    public static void info(){
        System.out.println("child");
    }
    public void greet(){
        System.out.println("hello");
    }

    Child(String name, int age, String gender, int standard){
        super(name, age, gender);
        this.standard = standard;
    }

    Child(Child other){
        super(other);
        this.standard = other.standard;
    }
}
