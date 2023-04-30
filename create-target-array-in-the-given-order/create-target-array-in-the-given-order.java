class Solution {
    public int[] createTargetArray(int[] nums, int[] index)
    {
        int target[]=new int[nums.length];
        for(int i=0;i<target.length;i++)
        {
                    for(int j=i,k=i;j!=index[i];j--,k--)
                    {
                        target[k]=target[j-1];

                    }
                    target[index[i]]=nums[i];
        }
       
        return target;
        
    }
}