class Solution {
public:
    int countLargestGroup(int n) 
    {
        vector<int> v(n+1,0);
    
        for(int i=1;i<=n;i++)
        {
            int temp=i;
            int sum=0;
            while(temp!=0)
            {
                sum+=temp%10;
                temp=temp/10;
            }
            v[sum]++;
        }
        
        
        
        int max = INT_MIN;
        for(int i=0;i<n+1;i++)
        {
            if(v[i]!=0 && v[i]>max)
            {
                max=v[i];
            }
        }
        int count=0;
        for(int i=0;i<n+1;i++)
        {
            if(max==v[i])
            {
                count++;
            }
        }
        return count;
            
        }
};