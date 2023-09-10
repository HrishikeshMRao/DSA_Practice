

"""
Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

You must write an algorithm that runs in O(n) time.
"""
//O(n) time
//O(1) space  
class Solution {
    public int longestConsecutive(int[] nums) 
    {
        int count = 1,max=0;
        //HashMap<Integer, Integer> Base = new HashMap<>();
        if(nums.length!=0)
        {
            Arrays.sort(nums); 
            max=1;
            for(int i=0;i<nums.length-1;i++)
            {
                if(nums[i+1]==nums[i])
                continue;
                if(nums[i+1]==nums[i]+1)  
                {
                    count++;
                    if (count>max)
                    max=count;
                }    
                else count =1;
            }
        }
        return(max);   
    }
}
