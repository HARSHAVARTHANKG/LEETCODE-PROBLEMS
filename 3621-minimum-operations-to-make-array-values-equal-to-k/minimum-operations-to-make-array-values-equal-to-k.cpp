class Solution {
public:
    int minOperations(vector<int>& nums, int k) 
    {
        int arr[101]={0};
        for(int x : nums)
        {
            if(x<k)
            {
                return -1;
            }
            arr[x]++;
        }
        int count=0;
        for(int i=0;i<101;i++)
        {
            if(arr[i]>=1)
            {
                if(i>k)
                {
                    count++;
                }
            }
        }
        return count;
                
    }
};