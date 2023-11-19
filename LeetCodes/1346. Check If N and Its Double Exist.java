/*
Given an array arr of integers, check if there exist two indices i and j such that :

    i != j
    0 <= i, j < arr.length
    arr[i] == 2 * arr[j]
*/
//O(N) 98% time

class Solution {
    public boolean checkIfExist(int[] arr) {
        
        Set<Integer> set = new HashSet<Integer> (); 
        for(int i=0;i<arr.length;i++)
        {
            if(set.contains(2*arr[i]))
            return true;
        
            if(arr[i]%2==0)
            {
                if(set.contains(arr[i]/2))
                return true;
            }

            set.add(arr[i]);
            
        }
        return false;
    }
}
