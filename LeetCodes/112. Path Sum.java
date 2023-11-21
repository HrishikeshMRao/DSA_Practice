/*
Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path such that adding up all the values along the path equals targetSum.

A leaf is a node with no children.
*/
//100% time

class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return helper(root, 0, targetSum);
    }

    private boolean helper(TreeNode root, int currSum, int targetSum){
        if(root == null) 
        return false;

        if(root.left == null && root.right == null) 
        return (currSum + root.val == targetSum);

        return helper(root.left, currSum + root.val, targetSum) || helper(root.right, currSum + root.val, targetSum);
    }
}
