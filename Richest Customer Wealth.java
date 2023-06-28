"""
You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.
A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.
"""
//Time complexity O(n^2)
//space complexity O(1)  

class Solution {
    public int maximumWealth(int[][] accounts) {
    for(int i = 0; i<accounts.length;++i)
    { 
        for(int j = 1;j<accounts[i].length;++j)
        accounts[i][j]+=accounts[i][j-1];
        if (accounts[i][accounts[i].length-1]>accounts[0][0])
        accounts[0][0]=accounts[i][accounts[i].length-1];
    } 
    return accounts[0][0];   
    }
}
