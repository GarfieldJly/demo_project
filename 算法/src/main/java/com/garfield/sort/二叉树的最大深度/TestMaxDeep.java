package com.garfield.sort.二叉树的最大深度;

import com.garfield.sort.bean.TreeNode;

import java.util.TreeMap;

/**
 * @author jingliyuan
 * @date 2020/8/6
 * https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/
 */
public class TestMaxDeep {
    /**
     * 给定一个二叉树，找出其最大深度。
     *
     * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
     *
     * 说明: 叶子节点是指没有子节点的节点。
     *
     * 示例：
     * 给定二叉树 [3,9,20,null,null,15,7]，
     *
     *     3
     *    / \
     *   9  20
     *     /  \
     *    15   7
     * 返回它的最大深度 3 。
     */
    public static void main(String[] args) {
        TestMaxDeep testMaxDeep = new TestMaxDeep();
        TreeNode rootTreeNode = new TreeNode(3);
        TreeNode leftTreeNode = new TreeNode(9);
        rootTreeNode.setLeft(leftTreeNode);

        TreeNode rightTreeNode = new TreeNode(20);
        TreeNode leftTreeNode1 = new TreeNode(15);
        TreeNode rightTreeNode1 = new TreeNode(7);
        rightTreeNode.setLeft(leftTreeNode1);
        rightTreeNode.setRight(rightTreeNode1);
        rootTreeNode.setRight(rightTreeNode);


        System.out.println(testMaxDeep.maxDeep(rootTreeNode));

    }

    public int maxDeep(TreeNode treeNode){
        if(treeNode == null){
            return 0;
        }
        //左子树和右子树取最大值，然后+1就是树的深度
        int leftMaxDeep = maxDeep(treeNode.getLeft());
        int rightMaxDeep = maxDeep(treeNode.getRight());
        return Math.max(leftMaxDeep + 1 , rightMaxDeep + 1);
    }
}
