/*
An alphabetical continuous string is a string consisting of consecutive letters in the alphabet. In other words, it is any substring of the string "abcdefghijklmnopqrstuvwxyz".

    For example, "abc" is an alphabetical continuous string, while "acb" and "za" are not.

Given a string s consisting of lowercase letters only, return the length of the longest alphabetical continuous substring.
*/
// 74.6%


class Solution {
    public int longestContinuousSubstring(String s) {

        int max = 1, count = 1;
        for(int i = 0;i<s.length()-1;i++)
        {
            count = (s.charAt(i)==(s.charAt(i+1)-1))? count+1: 1;
            if(count>max) max=count;
        }
        return max;
        
    }
}
