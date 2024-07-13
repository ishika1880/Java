package com.oops.Generics;

import java.util.ArrayList;
import java.util.function.Consumer;

//Lambda expressions are similar to methods, but they do not need a name and they can be implemented right in the body of a method.

public class LambdaExpression {

    // interface for the operations
    interface Operation{
        int operation(int a, int b);
    }

    private int operate(int a, int b, Operation op) {
        return op.operation(a, b);
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        LambdaExpression calculate = new LambdaExpression();


        for(int i=1; i<10; i++){
            arr.add(i+1);
        }
        // forEach will perform item*2 to every element on the array 
        arr.forEach((item) -> System.out.println(item*2));

        // using consumer function for the same
        Consumer<Integer> element = (i) -> System.out.println(i*2);
        arr.forEach(element);

        // define the sub function then use the operate function
        Operation sub = (a, b) -> a - b;
        System.out.println(calculate.operate(10,3, sub));
       
    }
}
