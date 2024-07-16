package com.Java.LinkedList;

public class Main {
    public static void main(String[] args) {
        Linked list = new Linked();
        list.insertFirst(10);
        list.insertFirst(3);
        list.insertFirst(40);
        list.insertFirst(20);
        list.insertFirst(90);
        list.insertFirst(5);
        
        list.display();
        list.deleteFirst();
        list.display();
        System.out.println(list.find(10));
        list.insertLast(100);
        list.display();
        
    }

}
