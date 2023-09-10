"""
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
"""  
//time O(n^2)
//space O(1)  



class Solution {
    public int[] twoSum(int[] nums, int target)
    {
        int j=0, i;
        for(i=0;i<nums.length;i++)
        {
            for(j = i+1 ; j<nums.length;j++)      
            if(nums[i]==target-nums[j])
            return( new int[] { i, j});
        }        
        return( new int[] { i, j});   
    }
}
