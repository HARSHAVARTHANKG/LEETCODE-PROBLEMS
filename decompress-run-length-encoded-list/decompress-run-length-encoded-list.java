class Solution {
    public int[] decompressRLElist(int[] nums)
    {
        int a=0;
        int j=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i%2==0)
            {
                a=a+nums[i];   
            }
        }
        int arr[]=new int[a];
        for(int i=0;i<nums.length/2;i++)
        {
            for(int k=0;k<nums[2*i];k++)
            {
               
                arr[j]=nums[2*i+1];
                j++;
            }
             
        }
        return arr;
        
        
        
    }
}