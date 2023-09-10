"""
Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.
Note that after backspacing an empty text, the text will continue empty.
  
"""  



class Solution 
{
	    public boolean backspaceCompare(String s, String t) 
	    {
	        boolean state = false;
	        while(t.startsWith("#"))
	        t = t.substring(1,t.length());
	        s = s+t;
	        while(s.startsWith("#"))
	        s = s.substring(1,s.length());
	        int mark = s.length();
	        int mark1 = mark;
	        for(int i = 0; i<s.length();i++)
	        {
	            if((s.charAt(i)=='#')&&(i-1==0))
	            {
	                s = s.substring(i+1,s.length());
	                mark-=2;
	            }
	            else if(s.charAt(i)=='#')
	            {    
	                s = (s.substring(0,i-1)+ s.substring(i+1,s.length()));
	                if(i<=mark1)
	                mark-=2;        
	            }    
	        }
	        if(mark!=0)
	        if(s.substring(0,mark)==s.substring(mark,s.length()))
	        state = true;
	        else if ((mark==0)&&(s==""))
	        state = true;
	        return state;
	        println(state);
	    }
}
