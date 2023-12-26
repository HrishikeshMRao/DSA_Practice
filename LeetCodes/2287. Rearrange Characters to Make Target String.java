/*
You are given two 0-indexed strings s and target. You can take some letters from s and rearrange them to form new strings.

Return the maximum number of copies of target that can be formed by taking letters from s and rearranging them.
*/


class Solution {
    public int rearrangeCharacters(String s, String target) {

        HashMap<Character,Integer> vault = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(target.contains(String.valueOf(s.charAt(i))))
            {
                vault.put(s.charAt(i),vault.getOrDefault(s.charAt(i),0)+1);
            }
        }
        
        for(int i=0;i<target.length();i++)
        {
            if(!vault.containsKey(target.charAt(i)))
            {
                vault.put(target.charAt(i),0);
            }
        }
        int repeat = 0;
        char min = Collections.min(vault.entrySet(), Map.Entry.comparingByValue()).getKey();
        for(int i=0;i<target.length();i++)
        {
            if(target.charAt(i)== min)
            repeat++;
        }
        
        return(vault.get(min)/repeat);
        
        
    }
}
