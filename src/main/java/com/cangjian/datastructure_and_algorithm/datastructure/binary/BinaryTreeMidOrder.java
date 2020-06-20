package com.cangjian.datastructure_and_algorithm.datastructure.binary;

/**
 * @ClassName：BinaryTreeMidOrder.java
 * @Description: 二叉树的中序遍历
 * @Date: 2020/6/20 10:16 AM
 * @Author: lin.guo
 * 二叉树中序遍历，即先遍历左节点，根节点，右节点
 * 期望结果：4 2 5 1 6 3 7
 **/
public class BinaryTreeMidOrder {
    private static BinaryTree root = new BinaryTree().root;

    public static void main(String[] args) {
        BinaryTreeMidOrder instance = new BinaryTreeMidOrder();
        instance.midOrder(root);
    }

    // 递归解法
    public void midOrder(BinaryTree root){
        if (root == null)
            return;
        midOrder(root.left);
        System.out.print(root.val+" ");
        midOrder(root.right);
    }

    // 非递归解法



}
