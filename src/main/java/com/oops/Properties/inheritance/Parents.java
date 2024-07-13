package com.oops.Properties.inheritance;

public class Parents {
    String name;
    private int age;
    String gender;

    Parents(){
        this.name = "";
        this.age = 0;
        this.gender = "NA";
    }

    public static void info(){
        System.out.println("parents");
    }

    public void greet(){
        System.out.println("hi there");
    }

    public int getage(){
        return age;
    }

    public Parents(String name, int age, String gender){
        System.out.println("parent class constructor");
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    Parents(Parents other){
        this.name = other.name;
        this.age = other.age;
        this.gender = other.gender;
    }

}

