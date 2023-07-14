
Given an integer array nums, your goal is to make all elements in nums equal. To complete one operation, follow these steps:

Find the largest value in nums. Let its index be i (0-indexed) and its value be largest. If there are multiple elements with the largest value, pick the smallest i.
Find the next largest value in nums strictly smaller than largest. Let its value be nextLargest.
Reduce nums[i] to nextLargest.
Return the number of operations to make all elements in nums equal.

  
class Solution {
public:
    int reductionOperations(vector<int>& nums) {
        sort(nums.begin(),nums.end(),greater<int>());
        int ans=0;
        int idx=0;
        int c=0;
        int n=nums[nums.size()-1];
        while(idx<nums.size() and nums[idx]!=n)
        {
            int ele=nums[idx];
            //c=0;
            while(idx<nums.size() and ele==nums[idx])
            {
                c++;
                idx++;
            }
            if(idx<nums.size() and ele!=nums[idx])
            ans=ans+c;
        }
        return ans;
    }
};





