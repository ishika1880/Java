package com.Tree.Intro;

import java.util.Scanner;

public class BinaryTree {
    public BinaryTree(){

    }

    private static class Node{
        int val;
        Node left;
        Node right;

        public Node(int value){
            this.val = value;
        }
    }

    private Node root;

    public void insert(Scanner in){
        System.out.println("Enter thr root node: ");
        int val = in.nextInt();
        this.root = new Node(val);
        insert(in, this.root);
    }

    private void insert(Scanner in, Node node) {
        System.out.println("Want to enter left of "+node.val);
        boolean left = in.nextBoolean();
        if(left){
            System.out.println("Enter the value to the left " + node.val);
            int val = in.nextInt();
            node.left = new Node(val);
            insert(in, node.left);
        }
        System.out.println("Want to enter right of " +node.val);
        boolean right = in.nextBoolean();
        if(right){
            System.out.println("Enter the value to the right " + node.val);
            int val = in.nextInt();
            node.right = new Node(val);
            insert(in, node.right);
        }
    }

    public void display(){
        display(this.root, "");
    }

    private void display(Node node, String indent) {
        if(node == null){
            return;
        } 
        System.out.println(indent + node.val);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");  
    }
    public void newDisplay(){
        newDisplay(root, 0);
    }

    private void newDisplay(Node node, int level) {
        if(node == null){
            return;
        }
        newDisplay(node.right, level+1);

        if(level != 0){
            for(int i=0; i<level - 1; i++){
                System.out.print("|\t\t");
            }
            System.out.println("|------->"+ node.val);
        }
        else{
            System.out.println(node.val);
        }
        newDisplay(node.left, level+1);
    }

    public void preOrder() {
        preOrder(root);
      }
    private void preOrder(Node node) {
        if (node == null) {
          return;
        }
        System.out.print(node.val + " ");
        preOrder(node.left);
        preOrder(node.right);
      }
    
      public void inOrder() {
        inOrder(root);
      }
    
      private void inOrder(Node node) {
        if (node == null) {
          return;
        }
        preOrder(node.left);
        System.out.print(node.val + " ");
        preOrder(node.right);
      }
    
      public void postOrder() {
        postOrder(root);
      }
    
      private void postOrder(Node node) {
        if (node == null) {
          return;
        }
        preOrder(node.left);
        preOrder(node.right);
        System.out.print(node.val + " ");
      }

}
