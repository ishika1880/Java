package com.Tree.Intro;

public class BinarySearchTree {
  public class Node {
    private int val;
    private Node right;
    private Node left;
    private int height;

    public Node(int val) {
      this.val = val;
    }

    public int getvalue() {
      return val;
    }
  }

  private Node root;

  public BinarySearchTree() {

  }

  public int height(Node node) {
    if (node == null) {
      return -1;
    }
    return node.height;
  }

  public void insert(int val) {
    root = insert(val, root);
  }

  private Node insert(int val, Node node) {
    if (node == null) {
      node = new Node(val);
      return node;
    }
    if (val > node.val) {
      node.right = insert(val, node.right);
    }

    if (val < node.val) {
      node.left = insert(val, node.left);
    }
    node.height = Math.max(height(node.left), height(node.right)) + 1;
    return node;
  }

  public boolean balanced() {
    return balanced(root);
  }

  private boolean balanced(Node node) {
    if (node == null) {
      return true;
    }
    return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
  }

  public void populate(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      this.insert(nums[i]);
    }
  }

  public void display() {
    display(root, 0);
  }

  private void display(Node node, int level) {
    if (node == null) {
      return;
    }
    display(node.right, level + 1);
    if (level != 0) {
      for (int i = 0; i < level - 1; i++) {
        System.out.print("|\t");
      }
      System.out.println("|------->" + node.val);
    } else {
      System.out.println(node.val);
    }
    display(node.left, level + 1);
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
    inOrder(node.left);
    System.out.print(node.val + " ");
    inOrder(node.right);
  }

  public void postOrder() {
    postOrder(root);
  }

  private void postOrder(Node node) {
    if (node == null) {
      return;
    }
    postOrder(node.left);
    postOrder(node.right);
    System.out.print(node.val + " ");
  }

}
