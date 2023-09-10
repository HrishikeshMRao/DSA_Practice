"""
  There is an integer array nums sorted in ascending order (with distinct values).

Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].

Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.

You must write an algorithm with O(log n) runtime complexity.
"""




//BINARY SEARCH TIME LIMIT EXCEED FOR SMALL ARRAYS BUT FASTER FOR BIGGER ARRAYS
class Solution
{
    public int search(int[] nums, int target) 
    {
        int first = nums[0];
        int length = nums.length;
        int last= nums[length-1];
        int i=0, old_middle = 0;
        boolean inverted;
        if(length>1)
        {
            for(i=0;i<length-1;i++)
            {
                if(nums[i]>nums[i+1])
                break;
            }
        }
        else if(nums[i]==target) return(i);
        else return(-1);
        if(i==length-1) inverted = false;
        else inverted = true;
        if (inverted)
        {
            if(target<=last)
            {
                int lower_middle = (i+length)/2;
                while(lower_middle!=old_middle)
                {
                    if(target==nums[lower_middle])
                    return(lower_middle);
                    old_middle = lower_middle;
                    if(target<nums[lower_middle])
                    lower_middle = (i+lower_middle)/2;
                    else lower_middle = (lower_middle+length)/2; 
                }   
            }
            else if(target>=first)    
            {    
                int higher_middle = (i+1)/2;
                while(higher_middle!=old_middle)
                {
                    if(target==nums[higher_middle])
                    return(higher_middle);
                    old_middle = higher_middle;
                    if(target<nums[higher_middle])
                    higher_middle = higher_middle/2;
                    else
                    higher_middle = (higher_middle + i)/2;
                }  
            }
        }
        else
        {
            int new_middle = length/2;
            while(new_middle!=old_middle)
            {
                if(target==nums[new_middle])
                return(new_middle);
                old_middle = new_middle;
                if(target<nums[new_middle])
                new_middle = new_middle/2;
                else
                new_middle = (new_middle + length)/2;
            }
        }
        return -1;    
    }
}




//LINEAR SEARCH BRUTE FORCE GOOD FOR SMALL ARRAYS
class Solution
{
    public int search(int[] nums, int target) 
    {
         for(int i=0;i<nums.length;i++)
        {
            if(target==nums[i])
            return i;
        }
        return(-1);      
    }
}
