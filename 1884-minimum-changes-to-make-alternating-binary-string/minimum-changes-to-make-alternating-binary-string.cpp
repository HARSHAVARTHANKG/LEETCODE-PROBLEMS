class Solution {
public:
    int minOperations(string s) 
    {
       int odd=0;
       int even=0;
       
      for(int i = 0; i < s.length(); i++)
{
    if(i % 2 != 0)
    {
        if(s[i] != '0')
        {
            odd++;
        }

        if(s[i]!='1')
        {
            even++;
        }
    }
    else
    {
        if(s[i] != '1')
        {
            odd++;
        }

        if(s[i]!='0')
        {
            even++;
        }
    }
}

      return min(odd,even);
    }
};