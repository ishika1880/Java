package com.Stack;

public class Main {
public static void main(String[] args) throws StackException{
    CustomStack stack = new CustomStack(5);
    stack.push(10);
    stack.push(45);
    stack.push(2);
    stack.push(9);

    stack.pop();
    System.out.println(stack.peek());
    System.out.println(stack.getMin());
}
}
