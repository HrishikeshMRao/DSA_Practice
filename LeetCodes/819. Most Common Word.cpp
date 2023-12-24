
/*
Given a string paragraph and a string array of the banned words banned, return the most frequent word that is not banned. It is guaranteed there is at least one word that is not banned, and that the answer is unique.

The words in paragraph are case-insensitive and the answer should be returned in lowercase.
*/


class Solution {
public:
    string mostCommonWord(string str, vector<string>& banned) {
        unordered_map<string, int> hash;
        for(auto& it : str)
		    it = ispunct(it) ? ' ' : tolower(it);

        unordered_set<string> st(banned.begin(), banned.end());  
        string res, temp;      
        int maxi =0;
        stringstream ss(str);
        while(ss >> temp) hash[temp]++;
        
        for(auto& it:hash){
            if(it.second > maxi && !st.count(it.first)){
                maxi = it.second;
                res = it.first;
            }
        }
        return res;
    }
};
