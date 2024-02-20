
// Given an integer array nums, find the
// subarray
// with the largest sum, and return its sum.

class Solution {
public:
    int maxSubArray(vector<int>& nums) {

        int current_max = nums[0], maximum= nums[0];
        for(int i=1;i<nums.size();i++)
        {
            current_max = max(nums[i],nums[i]+current_max);
            maximum = max(current_max,maximum);   
        }

        return maximum;
        
    }
};
