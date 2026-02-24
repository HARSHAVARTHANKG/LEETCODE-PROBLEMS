class Solution {
public:
    char findTheDifference(string s, string t) 
    {
        // sort(s.begin(),s.end());
        // sort(t.begin(),t.end());
        // int flag=0;
        
        // for(int i=0;i<t.length()-1;i++)
        // {
        //     if(s[i]!=t[i])
        //     {
        //         return t[i];            
        //     }
        // }
        // return t[t.length()-1];
         int result=0;
        
        for(int x : s)
        {
            result = result^x;
        }
        
        
        for(int x : t)
        {
            result = result^x;
        }
        
        return result;
    }
};