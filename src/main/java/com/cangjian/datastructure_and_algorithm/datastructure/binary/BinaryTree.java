package com.cangjian.datastructure_and_algorithm.datastructure.binary;

/**
 * @ClassName：binary.java
 * @Description:
 * @Date: 2020/6/20 9:45 AM
 * @Author: lin.guo
 **/
public class BinaryTree {
    int val = 0;
    BinaryTree left;
    BinaryTree right;
    BinaryTree root;

    public BinaryTree() {
        //构造二叉树
        BinaryTree node1 = new BinaryTree(1);
        BinaryTree node2 = new BinaryTree(2);
        BinaryTree node3 = new BinaryTree(3);
        BinaryTree node4 = new BinaryTree(4);
        BinaryTree node5 = new BinaryTree(5);
        BinaryTree node6 = new BinaryTree(6);
        BinaryTree node7 = new BinaryTree(7);
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;
        node1.left = node2;
        node1.right = node3;
        root = node1;
    }

    public BinaryTree(int val) {
        this.val = val;
    }
}
