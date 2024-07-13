package com.Java.Oops.Abstract;

public abstract class Fruit {

    String color;
    String name;
    final int rate;

    public Fruit(String name){
        this.name = name;
        rate = 100;
    }

    static void classname(){
        System.out.println("i am in fruit class");
    }

    void naming(){
        System.out.println("this is a fruit");
    }

    abstract void color(String color);
    abstract void name();

}
