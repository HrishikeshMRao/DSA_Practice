// Given a string s and an integer k, return true if you can use all the characters in s to construct k palindrome strings or false otherwise.

class Solution {

private:
    map<char,int> hist;
    int count = 0;
public:
    bool canConstruct(string s, int k) {

        if(s.size()<k) return false;

        for(auto itr : s)
        {
            if(hist.count(itr))
            hist[itr] = hist.at(itr)+1;
            else hist[itr] = 1;
        }

        for(auto ele : hist)
        {
            if(ele.second%2==1) count++;
        }

        if(count>k) return false;

        return true;
        
    }
};
