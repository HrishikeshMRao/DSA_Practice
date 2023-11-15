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

        return sum(node.left)+sum(node.right)+node.val;
    }

    public int product(TreeNode node){

        if(node==null){
            return 0;
        }
        int left_sum = product(node.left);
        int right_sum = product(node.right);
        long product = (total_sum-right_sum)>(total_sum-left_sum)?((total_sum-left_sum)*left_sum):((total_sum-right_sum)*right_sum);
        maximum = Math.max(maximum,product);
        return left_sum+right_sum+node.val;

    }

    public int maxProduct(TreeNode root) {

        total_sum = sum(root);
        product(root);
        return (int)(maximum%(Math.pow(10,9)+7));   
    }
}
