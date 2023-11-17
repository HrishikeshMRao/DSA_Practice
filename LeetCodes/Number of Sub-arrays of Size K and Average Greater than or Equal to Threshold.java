/*
Given an array of integers arr and two integers k and threshold, return the number of sub-arrays of size k and average greater than or equal to threshold.
*/
// 100% time
// 60.7% space


class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        
        threshold *= k;
        int count =0;
        int j=0,i=0,sum=0;
        while(j<arr.length)
        {
            sum += arr[j];
            
            if(j-i+1==k)
            {
                if(sum>=threshold)
                count++;
                sum -=arr[i];
                i++;
            }
            j++;
        }
        return count;
    }
}
