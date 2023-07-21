"""
You are given an array nums of positive integers. In one operation, you can choose any number from nums and reduce it to exactly half the number. (Note that you may choose this reduced number in future operations.)

Return the minimum number of operations to reduce the sum of nums by at least half.
"""






class Solution 
{
    public int halveArray(int[] nums) 
    {
        double sum = 0;
        int count = 0;
        int n=nums.length;
        double prev_largest=nums[0] ;
        double[] add = new double[n];
        for(int i=0;i<n;i++)
        {
            sum+=nums[i];
            add[i]=nums[i];
            if(nums[i]>prev_largest)
            prev_largest = nums[i];
        }
        double half = sum/2;
        double total = sum;
        double next_largest;
        while((sum-total)<half)
        {
            next_largest = add[0];
            for(int i=0;i<n;i++)
            {
                if(add[i]==prev_largest)
                {
                    add[i]=nums[i]/2;
                    count++;
                }
                else 
                {
                    add[i]=nums[i];
                }
                total += add[i];
                if(add[i]>next_largest)
                {
                    next_largest = add[i];
                }
            }
            prev_largest = next_largest;
        }
        return count;        
    }
}
