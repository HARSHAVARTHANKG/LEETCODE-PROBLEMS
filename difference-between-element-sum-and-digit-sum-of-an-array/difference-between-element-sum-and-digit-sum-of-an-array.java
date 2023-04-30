class Solution {
    public int differenceOfSum(int[] nums) 
    {
        int elementSum=0;
        int digitSum=0;
       for(int x:nums)
       {
           elementSum+=x;
           
           while(x!=0)
           {
               digitSum+=x%10;
               x=x/10;
           }
       }
        return elementSum-digitSum;

        
        
    }
}