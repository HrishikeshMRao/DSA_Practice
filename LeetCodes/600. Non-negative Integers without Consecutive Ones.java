/*
Given a positive integer n, return the number of the integers in the range [0, n] whose binary representations do not contain consecutive ones.
*/



class Solution {
    public int findIntegers(int n) {
        String binary = Integer.toBinaryString(n);
        int k = binary.length();

        int[] fib = new int[k+1];
        fib[0] = 1;
        fib[1] = 2;
        for(int i=2;i<=k;i++){
            fib[i] = fib[i-1]+fib[i-2];
        }
        
        boolean isLastBitOne = false;
        int res=0;
        int bit = k-1;
        while(bit>=0){
            if((n & (1<<bit))==0){
                isLastBitOne=false;
            } else {
                res+=fib[bit];
                if(isLastBitOne){
                    return res;
                }
                isLastBitOne=true;
            }
            bit--;
        }
        
        return res+1; 
    }
}
