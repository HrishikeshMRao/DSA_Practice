/*
Given a non-negative integer num, return true if num can be expressed as the sum of any non-negative integer and its reverse, or false otherwise.
*/


class Solution {
    public boolean sumOfNumberAndReverse(int num) 
    {
        int num1,rev;
        for(int i=0;i<=num;i++)
        {
            num1 = i;
            rev = 0;
            while(num1!=0)
            {
                rev = rev*10 + num1%10;
                num1 /= 10;
            }
            if(num==rev+i)
            return true;
        }
        return false;
    }
}
