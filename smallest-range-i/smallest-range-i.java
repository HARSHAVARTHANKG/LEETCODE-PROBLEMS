class Solution {
    public int smallestRangeI(int[] nums, int k) 
    {
        Arrays.sort(nums);
        
        int low=nums[0]+k;
        
        int high=nums[nums.length-1]-k;
       
        int result=high-low;
    

        if(result<0)
        {
            return 0;
        }
        return result;
    }
}