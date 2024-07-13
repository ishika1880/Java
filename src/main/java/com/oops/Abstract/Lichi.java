package com.oops.Abstract;

public class Lichi extends Fruit {

    public Lichi(String name) {
        super(name);
    }

    @Override
    void color(String color) {
        System.out.println("my color is "+color);
    }

    @Override
    void name() {
        System.out.println("i am "+name);
    }

}
