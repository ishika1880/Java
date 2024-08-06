package com.Tree.Intro;

//import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        int[] num = {7,3,0,2,4,6,5,8,9,1};
        tree.populate(num);
        tree.display();
        System.out.println();
        tree.inOrder();
        System.out.println();
        tree.postOrder();
        System.out.println();
        tree.preOrder();

        // Scanner in = new Scanner(System.in);
        // BinaryTree tree = new BinaryTree();
        // tree.insert(in);
        // tree.newDisplay();
    }

}
/* Pre-order traversal - N-L-R  - to evaluate math expression, or making a copy, in serialization
 * In-order traversal - L-N-R - to visit node in sorted manner in BST
 * Post-order traversal - L-R-N - to delete the node, because you need to children first; for calculating bottom to up 
*/
