/*
You are given an m x n binary matrix mat of 1's (representing soldiers) and 0's (representing civilians). The soldiers are positioned in front of the civilians. That is, all the 1's will appear to the left of all the 0's in each row.

A row i is weaker than a row j if one of the following is true:

    The number of soldiers in row i is less than the number of soldiers in row j.
    Both rows have the same number of soldiers and i < j.

Return the indices of the k weakest rows in the matrix ordered from weakest to strongest.

*/

// 97% time
//47% space


class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {

        int c = k;
        int m = mat.length;
        int n = mat[0].length;

        int[] index = new int[k];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(mat[j][i]==0)
                {
                    for(int h=i;h<n;h++)
                    mat[j][h] = 2;
                    index[c-k]=j;
                    k--; 
                }
                if(k==0)
                return(index);
            }
        }
        int j=0;
        while(k!=0)
        {
            if(mat[j][n-1]==1)
            {
                index[c-k]=j;
                k--; 
            }
            j++;
        }
        return index;
    }
}
