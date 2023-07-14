"""
Given a 0-indexed integer array nums, determine whether there exist two subarrays of length 2 with equal sum. Note that the two subarrays must begin at different indices.

Return true if these subarrays exist, and false otherwise.

A subarray is a contiguous non-empty sequence of elements within an array.
"""
//O(n) time
//O(logn)space


class Solution 
{
    HashMap<Integer, Integer> sub = new HashMap<>(); 
    public boolean findSubarrays(int[] nums) 
    {
        for(int i=0; i<nums.length-1;i++)
        {
            if(sub.containsKey(nums[i]+nums[i+1]))
            {
                return(true);    
            }
            sub.put(nums[i]+nums[i+1],1);
        }
        return(false); 
    }
}
