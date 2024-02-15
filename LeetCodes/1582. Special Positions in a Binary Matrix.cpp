// Given an m x n binary matrix mat, return the number of special positions in mat.

// A position (i, j) is called special if mat[i][j] == 1 and all other elements in row i and column j are 0 (rows and columns are 0-indexed).


class Solution {
private:
    map<int,int> mpr;
    map<int,int> mpc;

    int count=0;
public:
    int numSpecial(vector<vector<int>>& mat) {

        int rows = mat.size(), cols = mat[0].size();

        for(int row=0;row<rows;row++)
        for(int col=0;col<cols;col++)
        {
            if(mat[row][col]==1)
            {
                if(!mpr.count(row))
                mpr[row] = col;
                else mpr[row] = -1;   

                if(!mpc.count(col))
                mpc[col] = row;
                else mpc[col] = -1;  
            }
        }

        for(auto eler : mpr)
        {
            for(auto elec : mpc)
            {
                if((elec.second==eler.first)&&(eler.second==elec.first))
                count++;
            }
        }

        return count;

        
    }
};
