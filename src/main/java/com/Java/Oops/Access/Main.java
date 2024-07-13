package com.Java.Oops.Access;

public class Main {
    public static void main(String[] args) {
        Student1 student1 = new Student1(null, 0);
        Student2 student2 = new Student2(null, 0);

        // unable to access phone as it is private it can accesses only in same class
        // System.out.println("student1 phone no."+student1.phone);

        System.out.println("registration no. = " + student1.getRegno());
        System.out.println("registration no. = " + student2.regno);
    }

}
