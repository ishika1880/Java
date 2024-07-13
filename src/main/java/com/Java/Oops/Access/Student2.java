package com.Java.Oops.Access;

public class Student2 extends Student1 {

    public String name;
    protected String regno;
    String mail;
    private int phone;

    public Student2(String regno, int phone) {
        super(regno, phone);

    }

    public String getRegno() {
        return regno;
    }

    public void setRegno(String regno) {
        this.regno = regno;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

}
