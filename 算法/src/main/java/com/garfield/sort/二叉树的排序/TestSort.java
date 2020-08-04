package com.garfield.sort.二叉树的排序;

import com.garfield.sort.bean.TreeNode;

/**
 * @author jingliyuan
 * @date 2020/8/4
 */
public class TestSort {

    public static void main(String[] args) {
        TreeNode treeNodeRoot = new TreeNode(41);

        TreeNode treeNodeLeft = new TreeNode(20);
        TreeNode treeNodeLeft1 = new TreeNode(11);
        TreeNode treeNodeRight1 = new TreeNode(29);
        TreeNode treeNodeRight2 = new TreeNode(32);

        treeNodeRoot.setLeft(treeNodeLeft);
        treeNodeLeft.setLeft(treeNodeLeft1);
        treeNodeLeft.setRight(treeNodeRight1);
        treeNodeRight1.setRight(treeNodeRight2);

        TreeNode treeNodeRight = new TreeNode(65);
        TreeNode treeNodeLeft2 = new TreeNode(50);
        TreeNode treeNodeRight3 = new TreeNode(91);
        TreeNode treeNodeLeft3 = new TreeNode(72);
        TreeNode treeNodeRight4 = new TreeNode(99);

        treeNodeRoot.setRight(treeNodeRight);
        treeNodeRight.setLeft(treeNodeLeft2);
        treeNodeRight.setRight(treeNodeRight3);
        treeNodeRight3.setLeft(treeNodeLeft3);
        treeNodeRight3.setRight(treeNodeRight4);

        System.out.println("前序==================");
        previous(treeNodeRoot);
        System.out.println();
        System.out.println("中序==================");
        middle(treeNodeRoot);
        System.out.println();
        System.out.println("后序==================");
        after(treeNodeRoot);
    }
    //前序：根–>左–>右
    public static void previous(TreeNode treeNode){
        System.out.print(treeNode.getVal()+", ");
        if(treeNode.getLeft() != null){
            previous(treeNode.getLeft());
        }
        if(treeNode.getRight() != null){
            previous(treeNode.getRight());
        }
    }

    //中序: 左–>根–>右
    public static void middle(TreeNode treeNode){

        if(treeNode.getLeft() != null){
            middle(treeNode.getLeft());
        }
        System.out.print(treeNode.getVal()+", ");
        if(treeNode.getRight() != null){
            middle(treeNode.getRight());
        }
    }

    //后序: 左–>右–>根
    public static void after(TreeNode treeNode){
        if(treeNode.getLeft() != null){
            after(treeNode.getLeft());
        }
        if(treeNode.getRight() != null){
            after(treeNode.getRight());
        }
        System.out.print(treeNode.getVal()+", ");
    }
}
