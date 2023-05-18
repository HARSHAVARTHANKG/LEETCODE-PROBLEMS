class Solution {
    public int findMiddleIndex(int[] nums) 
    {

        int Rsum=0;
        int Lsum=0;

        for(int x : nums)
        {
            Rsum+=x;
        }
        Rsum=Rsum-nums[0];

        for(int i=0;i<nums.length;i++)
        {
            if(Lsum==Rsum)
            {
                return i;
            }
            Lsum+=nums[i];

            if(i==nums.length-1)
            {
                Rsum=0;
            }
            else
            {
                Rsum-=nums[i+1];
            }
        }
        return -1;
    }
}