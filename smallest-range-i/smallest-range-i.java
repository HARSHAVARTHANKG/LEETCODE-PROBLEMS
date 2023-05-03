class Solution {
    public int smallestRangeI(int[] nums, int k) 
    {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int low=nums[0]+k;
        System.out.println(low);
        int high=nums[nums.length-1]-k;
        System.out.println(high);
        int result=high-low;
        System.out.println(result);

        if(result<0)
        {
            return 0;
        }
        return result;
    }
}