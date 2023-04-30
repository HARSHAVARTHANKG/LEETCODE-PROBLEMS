class Solution {
    public int[] runningSum(int[] nums) 
    {
        int sum[]=new int[nums.length];
        int var=0;
        for(int i=0;i<nums.length;i++)
        {
           sum[i]=var + nums[i];
           var=sum[i];
        }
        return sum;
        
    }
}