package com.Java.Oops.Vectors;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

// the Vector class is a part of the Java Collections Framework and provides a dynamic array implementation of the List interface.

public class Vectors {
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);

        List<Integer> vector = new Vector<>();
        vector.add(3);
        vector.add(10);

    }

}
