class Solution {
    public int removeElement(int[] nums, int val) 
    {
        if(nums==null)
				{
					return -1;
				}

				int count=0;

				for(int n : nums)
				{
					if(n!=val)
					{
						nums[count++]=n;
					}
				}

				return count;
		
        
    }
}