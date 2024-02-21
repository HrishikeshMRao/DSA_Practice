
// You are given a 0-indexed array of integers nums.

// A prefix nums[0..i] is sequential if, for all 1 <= j <= i, nums[j] = nums[j - 1] + 1. In particular, the prefix consisting only of nums[0] is sequential.

// Return the smallest integer x missing from nums such that x is greater than or equal to the sum of the longest sequential prefix.


#include <bits/stdc++.h>
class Solution {
public:
    int missingInteger(vector<int>& nums) {

        int length = nums.size(),i,sum=nums[0];

        for(i=1;i<length;i++)
        {
            if(nums[i]!=nums[i-1]+1) break;

            sum += nums[i];
        }

        std::sort(nums.begin()+i,nums.end());

        for(i=0;i<length;i++)
        {
            if(sum>nums[i]) continue;
            if(sum==nums[i]) sum++;
            else break;
        }

        return sum;
    
        
    }
};
