package com.Java.LinkedList;

public class Linked {

    private Node head;
    private Node tail;
    private int size;

    
    public Linked() {
        this.size = 0;
    }


    // Node 
    class Node{
        private int value;
        private Node next;

        // node constructors

        private Node(int value){
            this.value = value;
        }
        private Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

        public void display(){
            Node temp = head;

            while(temp!=null){
                System.out.print(temp.value + "->");
                temp = temp.next;
            }
            System.out.println("END");
        }
        
        public void insertFirst(int val){
            Node node = new Node(val);
            node.next=head;
            head= node;

            if(tail == null){
                tail = head;
            }
            size = size+1;
        }

        public void deleteFirst(){
            
            if(head == null){
                tail = null;
            }
            head = head.next;
            
            size--;
        }

        public void insertLast(int val){

            if(tail==null){
                insertFirst(val);
            }
            Node node = new Node(val);
            tail.next = node;
            tail = node;
            size++;
        }

        public void deleteLast(){
            if(head == tail){
                deleteFirst();
            }
            Node secondLast = get(size-2);
            tail = secondLast;
            tail.next = null;
            size--;
        }

        private Node get(int index) {
            Node node = head;
            for(int i = 0; i<index; i++){
                node = node.next;
            }
            return node;
        }

        public int find(int val){
            Node node = head;
            for(int i =0; i<size; i++){
                if(node.value == val){
                   // System.out.println(i);
                    return i;
                }
                node = node.next;
            }
           // System.out.println("-1");
            return -1;
        }

        public void insert(int val, int index){
            if(index == 0){
                insertFirst(val);
            }
            if(index ==size){
                insertLast(val);
            }
            Node temp = head;
            for(int i =1; i<index; i++){
                temp = temp.next;
            }
            Node node = new Node(val, temp.next);
            temp.next = node;
            size++;
        }


}
