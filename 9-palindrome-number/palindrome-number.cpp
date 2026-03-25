class Solution {
public:
    bool isPalindrome(int x)
    {
        string str ="";

        str = to_string(x);
        cout<<str;
        int start =0;
        int end=str.length()-1;

        while(start<=end)
        {
            if(str[start]!=str[end])
            {
                return false;
            }
            start++;
            end--;
        }
        return true;
        
    }
};