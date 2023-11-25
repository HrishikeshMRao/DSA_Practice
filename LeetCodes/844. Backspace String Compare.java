/*
Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.

Note that after backspacing an empty text, the text will continue empty.
*/
//O(n) space
//O(n) time

class Solution {
    public boolean backspaceCompare(String s, String t) {

        Stack<Character> judge_s = new Stack<>();
        Stack<Character> judge_t = new Stack<>();
        for(int i = 0;i<s.length();i++)
        {
            if((!judge_s.isEmpty())&&(s.charAt(i)=='#'))
            judge_s.pop();
            else if(s.charAt(i)!='#')
            judge_s.push(s.charAt(i));
        }
        for(int i = 0;i<t.length();i++)
        {
            if((!judge_t.isEmpty())&&(t.charAt(i)=='#'))
            judge_t.pop();
            else if(t.charAt(i)!='#')
            judge_t.push(t.charAt(i));
        }
        while((!judge_t.isEmpty())&&(!judge_s.isEmpty()))
        {
            if(judge_t.pop()!=judge_s.pop())
            return false;
        }
        if((judge_t.isEmpty())&&(judge_s.isEmpty()))
        return true;
        else 
        return false;
        
    }
}
