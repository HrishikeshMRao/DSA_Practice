
//Given a positive integer n, return the smallest positive integer that is a multiple of both 2 and n.

//100% time


class Solution {
    public int smallestEvenMultiple(int n) {

        if(n%2==0) return n;
        return n*2;
        
    }
}
