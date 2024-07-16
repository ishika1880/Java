package com.LinkedList;


public class DoubleLinkedList {

    private Node head;

     private class Node{
        int val;
        Node next;
        Node prev;
        
        public Node(int val){
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }

        
     }

     public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node;
    }

    public void insertLast(int val){
        Node node = new Node(val);
        Node last = head;

        while (last.next == null) {
            last = last.next;
        }
        last.next = node;
        node.next = null;
        node.prev = last;
    }

    public void display() {
        Node node = head;
        while (node != null) {
            System.out.print(node.val + " -> ");
            node = node.next;
        }
        System.out.println("END");

    }

    public void reverseDisplay(){
        Node node = head;
        while(node.next == null){

            node = node.next;
        }
        
        while(node != null){
            System.out.println(node.val+" -> ");
            node = node.prev;
        }
    }

    public Node find(int value){
        Node node = new Node(value);

        while(node != null){
            if(node.val == value){
                return node;
            }
            node = node.next;
        } 
        return null;
    }

    public void insert(int after, int val) {
        Node p = find(after);

        if (p == null) {
            System.out.println("does not exist");
            return;
        }

        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if (node.next != null) {
            node.next.prev = node;
        }
    }

}

