/*
The Tribonacci sequence Tn is defined as follows: 

T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.

Given n, return the value of Tn.
*/
//64% space
//48% time
class Solution {
public:
    int tribonacci(int n) {
        if(n<2)
        return n;

        if(n==2)
        return 1;

        int T0=0,T1=1,T2=1,prev;

        for(int i=2;i<n;i++)
        {
            prev = T2;
            T2 = T0+T1+T2;
            T0 = T1;
            T1 = prev;
        }
        return T2;
    }
};
