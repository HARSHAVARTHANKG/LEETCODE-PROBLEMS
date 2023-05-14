class Solution {
    public int searchInsert(int[] nums, int target) 
    {

        int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<target)
            {
                ans = i+1;
            }
        }
        
        if(ans==0)
        {
            return 0;
        }
        else
        {
            return ans;
        }
       
    }
}