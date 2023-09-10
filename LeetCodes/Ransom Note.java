"""
Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.
"""





class Solution {
    public boolean canConstruct(String ransomNote, String magazine)
    {
        HashMap<Character,Integer> Dik = new HashMap <>();
        boolean state = true;
        for(int i=0;i<magazine.length();i++)
        {
            int count = Dik.getOrDefault(magazine.charAt(i),0);
            Dik.put(magazine.charAt(i),count+1);
        }
        for(int i=0;i<ransomNote.length();i++)
        { 
            int count_n = Dik.getOrDefault(ransomNote.charAt(i),-1);
            Dik.put(ransomNote.charAt(i),count_n-1); 
            count_n = Dik.getOrDefault(ransomNote.charAt(i),-1);
            if(count_n<0)
            state = false;
        }
        return(state);
    }
  
}
