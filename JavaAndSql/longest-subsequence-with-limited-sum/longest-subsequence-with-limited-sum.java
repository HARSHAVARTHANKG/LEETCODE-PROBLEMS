class Solution {
    public int[] answerQueries(int[] nums, int[] queries) 
    {
        int ans[]=new int[queries.length];
        Arrays.sort(nums);
        for(int i=0;i<queries.length;i++)
        {
            int query = queries[i];
            int count=0;

            for(int n : nums)
            {
                if(query>=n)
                {
                    count++;
                    query = query - n;
                }
                else
                {
                    break;
                }
            }
            ans[i]=count;
        }
       return ans;
    }
}