/*
Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
*/
//90.4% time

class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<Integer> sub = new ArrayList<>();
        List<List<Integer>> pascal = new  ArrayList<>();

        sub.add(1);
        pascal.add(sub);
        for(int i=0;i<numRows-1;i++)
        {
            sub = new ArrayList<>();
            sub.add(1);
            for(int j=0;j<pascal.get(i).size()-1;j++)
            {
                sub.add(pascal.get(i).get(j)+pascal.get(i).get(j+1));
            }
            sub.add(1);
            pascal.add(sub);    
        }
        return pascal;
        
    }
}
