/*
You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.

Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.
*/
// O(n) both time and space
// beats 98.14% in time
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        int length = flowerbed.length;
        int helper[] = new int[length +2]; 

        helper[0] = 0;
        for(int i=1;i<=length;i++)
        helper[i] = flowerbed[i-1];
        helper[length+1] = 0;

        for(int i=0;i<length;i++)
        {
            if((helper[i+2]==0)&&(helper[i+1]==0)&&(helper[i]==0))
            {
                n--;
                helper[i+1]=1;
            }
            
            if(n<1) return true;
        }

        return false;
        
    }
}
