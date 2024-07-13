package com.Java.Oops.Cloning;

public class Citizen implements Cloneable {
    String name;
    int age;
    int [] arr;
    public Citizen(String name, int age) {
        this.name = name;
        this.age = age;
        this.arr = new int[]{1,2,3,4,5,6};
    }

    // @Override
    // public Object clone() throws CloneNotSupportedException{
    //     // shallow copy - if you make changes in twin then it will also chnage in the citizen
    //     return super.clone();
    // }

    @Override
    public Object clone() throws CloneNotSupportedException{
        // deep copy - if you make changes in twin then it will not chnage in the citizen
        Citizen twin = (Citizen)super.clone();
        twin.arr = new int[twin.arr.length];
        for(int i=0; i< twin.arr.length; i++){
            twin.arr[i] = this.arr[i];
        }
        return twin;
    } 

}
