class Solution {
    public int maxProductDifference(int[] nums) 
    {
        /*
       Arrays.sort(nums);
          int diff=(nums[nums.length-1]*nums[nums.length-2])-(nums[0]*nums[1]);
          */
          
         int max1=Integer.MIN_VALUE,max2=max1;
       int min1=Integer.MAX_VALUE,min2=min1;
      for(int i=0;i<nums.length;i++)
      {
          if(nums[i]>max1)
          {
              max2=max1;
              max1=nums[i];
          }
          else if(max2<nums[i])
          {
              max2=nums[i];
          }
          if(min1>nums[i])
          {
              min2=min1;
              min1=nums[i];
          }
          else if(min2>nums[i])
          {
              min2=nums[i];
          }
      }
      int diff=(max1*max2)-(min1*min2);
       return diff;
      
      
     
        
    }
}