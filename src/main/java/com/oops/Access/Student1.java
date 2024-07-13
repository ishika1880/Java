package com.oops.Access;

public class Student1 {
    // can be accessed from anywhere
    public String name;
    // can be accessed only in subclasses also in different package but in subclass
    protected String regno;
    // can be accessed in same package
    String mail;
    // can be accessed in same class
    private int phone;

    public Student1(String regno, int phone) {
        this.regno = regno;
        this.phone = phone;
    }

    public String getRegno() {
        return regno;
    }

    public void setRegno(String regno) {
        this.regno = regno;
    }

    

}
