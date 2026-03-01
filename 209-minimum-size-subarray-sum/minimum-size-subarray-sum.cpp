class Solution {
public:
    int minSubArrayLen(int target, vector<int>& nums) 
    {

        int minLength=INT_MAX;
        int start =0;
        int end=0;
        int length =0;
        int csum=0;

        while(end != nums.size())
        {
            csum = csum+nums[end];

            while(csum >= target)
            {
                 length = end - start +1;
                 minLength = min(length,minLength);
                 csum = csum - nums[start];
                 start++;
            }
            end++;
        }
        if(minLength ==INT_MAX)
        {
            return 0;
        }
        return minLength;
        
    }
};