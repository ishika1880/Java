package com.LinkedList;

public class Main {
    public static void main(String[] args) {
        // Linked list = new Linked();
        // list.insertFirst(10);
        // list.insertFirst(3);
        // list.insertFirst(40);
        // list.insertFirst(20);
        // list.insertFirst(90);
        // list.insertFirst(5);
        
        // list.display();
        // list.deleteFirst();
        // list.display();
        // System.out.println(list.find(10));
        // list.insertLast(100);
        // list.display();


       DoubleLinkedList list2 = new DoubleLinkedList();
       list2.insertFirst(3);
       list2.insertFirst(2);
       list2.insertFirst(8);
       list2.insertFirst(17);
       list2.insertLast(99);
       list2.insert(8, 65);
       list2.display();

    //    CLL list = new CLL();
    //    list.insert(23);
    //    list.insert(3);
    //    list.insert(19);
    //    list.insert(75);
    //    list.display();
    //    list.delete(19);
    //    list.display();
        
    }

}
