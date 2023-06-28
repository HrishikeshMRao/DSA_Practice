"""
Given an integer num, return the number of steps to reduce it to zero.

In one step, if the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.
"""  
//time O(n)
//space O(1)  


class Solution {
    public int numberOfSteps(int num) { int i=0;
    if(num!=0)
    {
    while(num!=1)
    {
        if(num%2==1)
        i+=2;
        else
        i++;
        num/=2;
        
    }
    i++;
    }
    return(i);    
    }
}
