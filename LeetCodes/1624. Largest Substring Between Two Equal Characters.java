/*
Given a string s, return the length of the longest substring between two equal characters, excluding the two characters. If there is no such substring return -1.

A substring is a contiguous sequence of characters within a string.
*/


class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {

        HashMap<Character,Integer[]> track = new HashMap<>();
        int i=0;
        for(char c : s.toCharArray())
        {
            if(track.containsKey(c))
            {
                track.put(c,new Integer[]{track.get(c)[0],i});
            }
            else
            track.put(c,new Integer[]{i,-1});
            i++;
        }

        int max = -1,length;
        for(Map.Entry<Character,Integer[]> entry : track.entrySet())
        {
            length= entry.getValue()[1]-entry.getValue()[0];
            if(length>max) max = length-1;
        }

        return max;
        
    }
}
