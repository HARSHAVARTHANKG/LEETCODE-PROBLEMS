class Solution {
    public int smallestRangeI(int[] nums, int k) 
    {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
       for(int i=0;i<nums.length;i++)
       {
           if(min>nums[i])
           {
               min=nums[i];
           }

           if(max<nums[i])
           {
               max=nums[i];
           }
       }
       int result = (max-k) - (min+k) ;

       return result<0 ? 0 :result;
    }
}