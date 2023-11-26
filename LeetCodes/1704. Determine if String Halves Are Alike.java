/*
You are given a string s of even length. Split this string into two halves of equal lengths, and let a be the first half and b be the second half.

Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'). Notice that s contains uppercase and lowercase letters.

Return true if a and b are alike. Otherwise, return false.
*/

class Solution {
    public boolean halvesAreAlike(String s) {

        int n = s.length();
        int half = n/2,left_count=0,right_count=0;

        Set<Character> vowels = new HashSet<Character> ();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U'); 

        String first_half = new String(s.substring(0,half));
        String second_half = new String(s.substring(half,n));

        for(int i=0;i<half;i++)
        {
            if(vowels.contains(first_half.charAt(i)))
            left_count++;
        }
        
        for(int i=0;i<n-half;i++)
        {
            if(vowels.contains(second_half.charAt(i)))
            right_count++;
        }

        if(left_count==right_count)
        return true;
        else 
        return false;


        
    }
}
