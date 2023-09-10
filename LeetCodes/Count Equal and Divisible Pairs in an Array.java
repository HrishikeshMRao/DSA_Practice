

/*
Given a 0-indexed integer array nums of length n and an integer k, return the number of pairs (i, j) where 0 <= i < j < n, such that nums[i] == nums[j] and (i * j) is divisible by k.

 */


//time O(n)
//space O(1)
class Solution {
    public int countPairs(int[] nums, int k) 
    {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
           for(int j=0;j<i;j++)
           {
               if(((i*j)%k==0)&&(nums[i]==nums[j]))
               {
                   count++;
               }
           }
        }
        return(count);    
    }
}

///alternate solution with hashmap but unnecessarily lengthy

int check ;
            if(reg.containsKey(nums[i]))
            {
                check = reg.getValue(nums[i]);
                int dig=10;
                while(check/dig!=0)
                {
                    if(i/dig>=1)
                    {}dig*=10;
                    compare=
                    if((check*i)/k==0)
                    {
                        count++;
                    }
                    int enhance = check*10+i;
                    reg.put(nums[i],enhance)
                }
            }
            else
            reg.put(nums[i],i);
