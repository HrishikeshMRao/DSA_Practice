
/*
Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
*/
// 50% time


class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> freq = new HashMap<>();
        Map.Entry<Integer,Integer>            entry;
        Iterator<Map.Entry<Integer,Integer>>  it;

        int[] result = new int[k];

        for(int i : nums)
        {
            freq.put(i,freq.getOrDefault(i,0)+1);
        }
        int i=0;
        
        while(i!=k)
        {
            int max = Collections.max(freq.values());
            it = freq.entrySet().iterator();
            while (it.hasNext())
            {
                entry = it.next();
                if (entry.getValue().equals(max))
                {
                    result[i] = entry.getKey();
                    entry.setValue(-1);
                    i++;
                }
            }
        }
        return result;

        
    }
}
