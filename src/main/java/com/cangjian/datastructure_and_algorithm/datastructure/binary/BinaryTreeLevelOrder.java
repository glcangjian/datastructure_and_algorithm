package com.cangjian.datastructure_and_algorithm.datastructure.binary;

import java.util.LinkedList;

/**
 * @ClassName：BinaryTreeLevelOrder.java
 * @Description: 二叉树的层遍历
 * @Date: 2020/6/20 10:38 AM
 * @Author: lin.guo
 * 也就是按层顺序打印二叉树
 **/
public class BinaryTreeLevelOrder {
    private static BinaryTree root = new BinaryTree().root;

    public static void main(String[] args) {
       BinaryTreeLevelOrder instance = new BinaryTreeLevelOrder();
       instance.levelOrder(root);
    }

    public void levelOrder(BinaryTree root){
        if (root == null)
            return;
        LinkedList<BinaryTree> list = new LinkedList();
        list.add(root);
        list.add(null);
        while (!list.isEmpty()){
            BinaryTree cur = list.poll();
            if (cur == null){
                System.out.println(); // 标识此层结束，换行
            } else {
                System.out.print(cur.val+" ");
                if (cur.left != null)
                    list.add(cur.left);
                if (cur.right != null)
                    list.add(cur.right);
                if (list.peek() == null)
                    list.add(null); //先确定此行元素是否结束，再添加换行标识符；
            }
        }
    }
}
