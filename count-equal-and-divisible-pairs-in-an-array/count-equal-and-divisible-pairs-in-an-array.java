class Solution {
    public int countPairs(int[] nums, int k) 
    {
         int count=0;
           for(int i=0;i<nums.length;i++)
           {
               for(int j=i;j<nums.length;j++)
               {
                   if(nums[i]==nums[j] && i!=j)
                   {
                       int pro=i*j;
                       if(pro%k==0)
                       {
                           count++;
                       }
                   }
               }
           }
          
              return count;
    
        
    }
}