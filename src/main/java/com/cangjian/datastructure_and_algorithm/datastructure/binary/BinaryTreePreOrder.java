package com.cangjian.datastructure_and_algorithm.datastructure.binary;

/**
 * @ClassName：preOrder.java
 * @Description: 二叉树的先序遍历
 * @Date: 2020/6/20 9:55 AM
 * @Author: lin.guo
 * 二叉树先序遍历，即先遍历根节点，左节点，右节点
 * 期望结果：1 2 4 5 3 6 7
 **/
public class BinaryTreePreOrder {

    private static BinaryTree root = new BinaryTree().root;

    public void preOrder(BinaryTree root){
        if (root == null)
            return;
        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        BinaryTreePreOrder instance = new BinaryTreePreOrder();
        instance.preOrder(root);
    }
}
