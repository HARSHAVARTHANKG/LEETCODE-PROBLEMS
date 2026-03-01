class Solution {
public:
    int minPartitions(string n) 
    {
        int max = INT_MIN;

       for(int i=0;i<n.length();i++)
       {
         int number = (int)(n[i]-'0');
         if(number>max)
         {
            max = number;
         }
       }
       return max;
        
    }
};