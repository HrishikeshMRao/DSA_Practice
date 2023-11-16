/*
Given an integer num, return the number of steps to reduce it to zero.

In one step, if the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.
*/

// 100% time

class Solution {
    public int numberOfSteps(int num) {

        int i=0;
        while(num!=0)
        {
            i++;
            if(num%2==1)
            num--;
            else
            num /= 2;
        }
        return i;
        
    }
}
