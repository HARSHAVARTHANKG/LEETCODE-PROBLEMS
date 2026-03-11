class Solution {
public:
    int bitwiseComplement(int n) 
    {

        if(n==0)
        {
            return 1;
        }
        if(n==1)
        {
            return 0;
        }
        string str = "";

        while(n!=0)
        {
            int rem=n%2;
            if(rem==0)
            {
                str = str + '1';
            }
            else
            {
                str=str+'0';
            }
            n=n/2;
        }
        cout<<str;
        int result =0;

        int pow=1;
        for(int i=0;i<str.length();i++)
        {
            int value = (int)(str[i]-'0');
            result = result + (pow*value);
            pow=pow*2;
        }
        return result;
    }
};