"""
You are given a 0-indexed integer array nums of size n and a positive integer k.

We call an index i in the range k <= i < n - k good if the following conditions are satisfied:

The k elements that are just before the index i are in non-increasing order.
The k elements that are just after the index i are in non-decreasing order.
Return an array of all good indices sorted in increasing order.
"""

//O(n) time 
//O(n) space 
//Dynamic programming approach


class Solution {
    public List<Integer> goodIndices(int[] nums, int k)
    {
        List<Integer> Sub_arr = new ArrayList<>();
        int i,j,front_index=0,back_index=0;
        for(j=0;j<k;j++)
        {
            if(nums[j]>=nums[j+1])
            front_index = j;
            else
            break;
        }
        if((2*k<=nums.length)&&(k+1<2*k-1))
        {
            for(j=k+1;j<2*k-1;j++)
            {
                if(nums[j]<=nums[j+1])
                back_index = j;
                else
                break;
            }
        }
        if((front_index==k-1)&&(back_index==2*k))
        for(i=k;i<nums.length-k;i++)
        {
            if((nums[i]<=nums[front_index])&&(nums[i+k]>=nums[back_index]))    
            {
                front_index=i;
                back_index = i+k;
                Sub_arr.add(i);
            }        
        }
        return(Sub_arr);
    }
}
