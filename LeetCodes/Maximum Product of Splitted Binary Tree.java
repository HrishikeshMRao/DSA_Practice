/*
Given the root of a binary tree, split the binary tree into two subtrees by removing one edge such that the product of the sums of the subtrees is maximized.

Return the maximum product of the sums of the two subtrees. Since the answer may be too large, return it modulo 109 + 7.

Note that you need to maximize the answer before taking the mod and not after taking it.*/


//97% time



/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private long maximum = 0;
    private long total_sum = 0;

    private long sum(TreeNode node)
    {
        if(node==null)
        return 0;

        total_sum += node.val;
        long left_sum = sum(node.left);
        long right_sum = sum(node.right);
        long product = right_sum < left_sum?((total_sum-left_sum)*left_sum):((total_sum-right_sum)*right_sum);
        maximum = Math.max(maximum,product);
        return left_sum+right_sum+node.val;
    }

    public int maxProduct(TreeNode root) {

        sum(root);
        return (int)(maximum%(Math.pow(10,9)+7));   
    }
}
