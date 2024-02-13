// Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise, return the number of negative numbers in grid.


class Solution {
public:
    int countNegatives(vector<vector<int>>& grid) {

    int cols = grid.size();
    int rows = grid[0].size();

    int row = 0, col = rows - 1, cnt = 0;
        while (row < cols && col >= 0) 
        {
            if (grid[row][col] < 0) 
            {
                --col;
                cnt += cols - row; 
            }
            else 
            {
                ++row;
            }
        }
        return cnt;
    }

};
