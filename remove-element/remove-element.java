class Solution {
    public int removeElement(int[] nums, int val) 
    {
        	int count=0;
		for(int i=0;i<nums.length;i++)
		{
		    if(nums[i]==val)
		    {
		        nums[i]=-1;
		    }
		    else
		    {
                count++;
		        nums[i]=nums[i];
		    }
		}
	    sort(nums);

        return count;
		
        
    }

    	public static void sort(int[] arr)
	{
	    for(int i=0;i<arr.length;i++)
	    {
	        for(int j=1;j<arr.length;j++)
	        {
	            if(arr[j-1]<arr[j])
	            {
	                int temp=arr[j-1];
	                arr[j-1]=arr[j];
	                arr[j]=temp;
	            }
	        }
	    }
	}
}