"""
Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.

"""
//O(logn) Space
//O(n)   time


class Solution 
{
    HashMap<Integer,Integer> store = new HashMap<>();
    public boolean containsNearbyDuplicate(int[] nums, int k) 
    {
        for(int i=0;i<nums.length;i++)
        {
            int count = (store.get(nums[i])!=null)?(i-store.get(nums[i])):0;
            if((store.containsKey(nums[i]))&&(count<=k))
            return true;
            else
            store.put(nums[i],i);
        }
        return false;
    }
}
