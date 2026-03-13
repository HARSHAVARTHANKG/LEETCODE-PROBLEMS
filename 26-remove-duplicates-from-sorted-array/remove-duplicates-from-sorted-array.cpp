class Solution {
public:
    int removeDuplicates(vector<int>& nums) 
    {
        int dup=0;

        for(int i=0;i<nums.size();i++)
        {
            if(nums[dup]!=nums[i])
            {
                dup++;
                nums[dup]=nums[i];
            }
        }
        return dup+1;
        
    }
};