
// You are given a 0-indexed string word, consisting of lowercase English letters. You need to select one index and remove the letter at that index from word so that the frequency of every letter present in word is equal.

// Return true if it is possible to remove one letter so that the frequency of all letters in word are equal, and false otherwise.

// Note:

//     The frequency of a letter x is the number of times it occurs in the string.
//     You must remove exactly one letter and cannot choose to do nothing.




class Solution {
private: 
    map<char, int> alpha;
    int max, min; 

public:
    bool equalFrequency(string word) {

        for(int i=0;i<word.length();i++)
        {
            char letter = word[i];

            if(alpha.count(letter)>0)
            {
                alpha[letter] = alpha.at(letter)+1;
            }
            else 
            {
                alpha[letter] = 1;
            }

            auto count = alpha.at(letter);

        }

        max = alpha.at(word[0]);
        min = alpha.at(word[0]);

        for(auto it: alpha)
        {
            if(it.second>max) max=it.second;
            else if(it.second<min) min=it.second;
        }

        if(max-min==1) return true;
        return false;        
    }
};

<----------------------------------------------------------------------->

class Solution {
public:
    bool equalFrequency(string word) {
        int n=word.size();
        map<char,int> mp;
        for(auto it:word)
        {
            mp[it]++;
        }
        vector<int> freq(256,0);
        for(auto it: word)
        {
            freq[it]++;
        }
        set<char> st;
        for(auto it: word)
        {
            st.insert(it);
        }
        
        
        for(auto it: mp)
        {
            set<char> temp;
            freq[it.first]--;
            for(auto i:st)
            {
                if(freq[i]!=0)
                temp.insert(freq[i]);
            }
            if(temp.size()==1)
            {
                return true;
            }
            freq[it.first]++;
        }
        return false;
        
    }
};
