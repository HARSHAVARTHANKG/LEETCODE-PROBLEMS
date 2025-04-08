class Solution {
public:
    int hasDuplicate(vector<int> &v)
    {
        for(int x : v)
        {
            cout<<x<<" ";
        }
            cout<<endl;
        int status=0;
        
        vector<int> arr(101);
        
        for(int x : v)
        {
            arr[x]++;
        }
        
        for(int i=0;i<101;i++)
        {
            if(arr[i]>=2)
            {
                status=1;
            }
        }
        return status;
    }
    int minimumOperations(vector<int>& nums) 
    {
       int count=0;
     auto i=nums.begin();
     while(hasDuplicate(nums)==1)
     {
        if(nums.size()>=3)
        {
            nums.erase(i,i+3);
            count++;
        }
        else
        {
            if(hasDuplicate(nums)==1)
            {
                count++;
                nums.erase(i,i+nums.size()-1);
            }
            else
            {
                break;
            }
        }
        
        
     }
        return count;
    }

};