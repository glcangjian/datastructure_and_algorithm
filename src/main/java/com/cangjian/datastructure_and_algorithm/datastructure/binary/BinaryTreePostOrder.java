package com.cangjian.datastructure_and_algorithm.datastructure.binary;

/**
 * @ClassName：BinaryTreePostOrder.java
 * @Description: 二叉树的后序遍历
 * @Date: 2020/6/20 10:32 AM
 * @Author: lin.guo
 * 二叉树后序遍历，即先遍历左节点，右节点，根节点
 * 期望结果：4 5 2 6 7 3 1
 **/
public class BinaryTreePostOrder {
    private static BinaryTree root = new BinaryTree().root;

    public static void main(String[] args) {
        BinaryTreePostOrder instance = new BinaryTreePostOrder();
        instance.postOrder(root);
    }

    public void postOrder(BinaryTree root){
        if (root == null)
            return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val+" ");
    }
}
