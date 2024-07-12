package com.oops.Properties.inheritance;

public class Main {
    public static void main(String[] args) {
        
        Parents parent = new Parents("hi", 40, "female");
        System.out.println(parent.getage());
        // startic methods doesn't depent on the object of that class hence they can be called directly by the class name
        Parents.info();

        // method access depend on the child class and variable access depend on parents class
        Parents pchild = new Child();
        pchild.greet();
        // System.out.println(pchild.standard);
        // in this the parent method will be called becuase it is static, it don't depend on object 
        // therefore no matter from which object you will call it, it will always run the parent class method
        pchild.info();
        Child childern = new Child();
        Child.info();
    }
}