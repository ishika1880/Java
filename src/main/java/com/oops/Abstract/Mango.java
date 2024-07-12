package com.oops.Abstract;

public class Mango extends Fruit {

    public Mango(String name) {
        super(name);
    }

    @Override
    void color(String color) {
        System.out.println("my color is "+color);
    }

    @Override
    void name() {
        System.out.println("i am " + name);
    }

}
