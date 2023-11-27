/*
You are given an m x n matrix M initialized with all 0's and an array of operations ops, where ops[i] = [ai, bi] means M[x][y] should be incremented by one for all 0 <= x < ai and 0 <= y < bi.

Count and return the number of maximum integers in the matrix after performing all the operations.
*/
//100% time
//68% space
class Solution {
    public int maxCount(int m, int n, int[][] ops) {

        int min_a = m, min_b = n;
        for(int i=0;i<ops.length;i++)
        {
            int a = ops[i][0];
            int b = ops[i][1];
            if(a<min_a) min_a=a;
            if(b<min_b) min_b=b;
        }
        return min_a*min_b;
        
    }
}
