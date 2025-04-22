class Solution {
public:
    string convertToString(int n)
    {
        string ret;
        while(n!=0)
        {
            ret = (char)(n%2+'0') + ret;
            n=n/2;
        }
        
        for(int i=0;i<ret.length();i++)
        {
            if(ret[i]=='0')
            {
                ret[i]='1';
            }
            else
            {
                ret[i]='0';
            }
        }
        return ret;
    }

    int convertToNumber(string str)
    {
        int ret=0;
        long long power = 1;
        for(int i=str.length()-1;i>=0;i--)
        {
            int number = (int)(str[i]-'0');
            ret = ret + number*power;
            power = power*2;
        }
        return ret;
    }
    int findComplement(int num) 
    {
       
         string str = convertToString(num);
        int result = convertToNumber(str);
        return result;
        
        
    }
};