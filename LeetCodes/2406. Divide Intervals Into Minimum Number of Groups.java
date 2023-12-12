
/*
You are given a 2D integer array intervals where intervals[i] = [lefti, righti] represents the inclusive interval [lefti, righti].

You have to divide the intervals into one or more groups such that each interval is in exactly one group, and no two intervals that are in the same group intersect each other.

Return the minimum number of groups you need to make.

Two intervals intersect if there is at least one common number between them. For example, the intervals [1, 5] and [5, 8] intersect.
*/
// O(nlogn)




class Solution {
    public int minGroups(int[][] intervals) {

        int length = intervals.length;
        List<Integer> start = new ArrayList<>();
        List<Integer> end = new ArrayList<>();
        int count=0,i=0,j=0;

        for(i=0;i<length;i++)
        {
            start.add(intervals[i][0]);
            end.add(intervals[i][1]); 
        }

        Collections.sort(start);
        Collections.sort(end); 

        i=0;
        while(i<length)
        {
            if(start.get(i)<=end.get(j))
            count++;
            else 
            j++;
            i++;
        }
        return count;

        
    }
}
