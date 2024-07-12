package com.oops.Abstract;

public class Main {
    public static void main(String[] args) {
        Mango mango = new Mango("mango");
        mango.color("yellow");

        Lichi lichi = new Lichi("Lichi");
        lichi.name();
        // can't make the object of abstract classes
        //   Fruit fruit = new Fruit("fruit");

       // instance method can be called by subclass or by the instance of the class
        mango.naming();

        // since fruit class can't have any object therefore we can't access the normal methods from it's class name as normal methods reqire a object 

        // Fruit.naming(); - invalid
    }
}
