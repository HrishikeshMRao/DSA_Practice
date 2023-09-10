"""
You are given an integer array nums, and you can perform the following operation any number of times on nums:

Swap the positions of two elements nums[i] and nums[j] if gcd(nums[i], nums[j]) > 1 where gcd(nums[i], nums[j]) is the greatest common divisor of nums[i] and nums[j].
Return true if it is possible to sort nums in non-decreasing order using the above swap method, or false otherwise.
"""
//Not entirely my solution had learnet it from leetcode




class Solution {
    class UnionFindSet {
        int[] parent;
        int[] rank;
        
        UnionFindSet(int n) {
            parent = new int[n];
            rank = new int[n];
            for(int i = 0; i < n; i++) {
                parent[i] = i;
                rank[i] = 1;
            }
        }
        
        void union(int x, int y) {
            int root_x = find(x), root_y = find(y);
            if(root_x == root_y) return;
            
            if(rank[root_x] >= rank[root_y]) {
                parent[root_y] = parent[root_x];
                rank[root_x] += rank[root_y];
            }else {
                parent[root_x] = parent[root_y];
                rank[root_y] += rank[root_x];
            }
        }
        
        int find(int n) {
            if(parent[n] != n) parent[n] = find(parent[n]);
            return parent[n];
        }
    }
    public boolean gcdSort(int[] nums) {
        UnionFindSet uf = new UnionFindSet(100000 + 1);
        for(int num : nums) {
            for(int i = 2; i * i <= num; i++) {
                if(num % i != 0) continue;
                uf.union(num, i);
                uf.union(num, num / i);
            }
        }
        
        int[] clone = Arrays.stream(nums).sorted().toArray();
        for(int i = 0; i < nums.length; i++) {
            if(uf.find(clone[i]) != uf.find(nums[i])) return false;
        }
        return true;
    }
}
