
"""
The set [1, 2, 3, ..., n] contains a total of n! unique permutations.

By listing and labeling all of the permutations in order, we get the following sequence for n = 3:

    "123"
    "132"
    "213"
    "231"
    "312"
    "321"

Given n and k, return the kth permutation sequence.
"""
//Hard Question
//98% memory
//64% time

class Solution {
    public String getPermutation(int n, int k) {

        int i=1,pointer;
        String result="";
        Stack<Integer> reverse = new Stack<>();
        List<Integer> factrad = new ArrayList<>();
        k--;
        while(k!=0)
        {
            reverse.push(k%i);
            k/=i;
            i++;
        }
        while(i<n+1)
        {
            reverse.push(0);
            i++;
        }
        for(i=1;i<=n;i++)
        factrad.add(i);

        while(!reverse.isEmpty())
        {
            pointer = reverse.pop();
            result += Integer.toString(factrad.get(pointer));
            factrad.remove(pointer);
        }

        return result;

        

    }
}
