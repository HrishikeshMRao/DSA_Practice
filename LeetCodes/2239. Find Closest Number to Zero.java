/*
Given an integer array nums of size n, return the number with the value closest to 0 in nums. If there are multiple answers, return the number with the largest value.
*/


class Solution {
    public int findClosestNumber(int[] nums) {

        int n = nums.length;
        if(n==1)return nums[0];

        Arrays.sort(nums);
        int i;

        for(i=1;i<n;i++)
        {
            if(nums[i]>=0)
            {
                if((nums[i-1]<0))
                {
                    if(Math.abs(nums[i-1])<nums[i])
                    return nums[i-1];
                    else return nums[i];
                }
                
                else return nums[0]; 
            }            
        }
        
        return nums[i-1];

    }
}
