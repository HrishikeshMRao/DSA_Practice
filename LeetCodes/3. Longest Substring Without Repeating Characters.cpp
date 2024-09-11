/**
Given a string s, find the length of the longest
substring
without repeating characters.
**/

//O(n)
//O(n)




#include <unordered_map>

class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        int right_window = 0;
        int left_window = 0;

        std::unordered_map<char,int> char_collection;
        int max_length = 0 , check = 0;
        for(char c : s){

            right_window++;
            if (char_collection.find(c)==char_collection.end()){
                char_collection.insert({c,right_window});
                
            }
            else{

                left_window = (char_collection[c] > left_window)?
                char_collection[c] : left_window;
                char_collection[c] = right_window;
            } 
            check = right_window - left_window;
            if(max_length<check){
                max_length = check;
            }
        }

        return max_length;
        
    }
};
