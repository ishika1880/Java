package com.oops.Cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Citizen XYZ = new Citizen("kavya", 10);

       // Citizen twin = new Citizen("kavya", 10);

       Citizen twin = (Citizen)XYZ.clone();
       System.out.println(twin.age+" " + twin.name);
       System.out.println(Arrays.toString(twin.arr));

       twin.arr[0] = 100;

       System.out.println(Arrays.toString(twin.arr));
       System.out.println(Arrays.toString(XYZ.arr));

    }

}
