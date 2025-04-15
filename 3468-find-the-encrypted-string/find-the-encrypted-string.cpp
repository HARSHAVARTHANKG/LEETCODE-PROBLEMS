class Solution {
public:
    void rotateString(string &str)
    {
        char ch = str[0];
        for(int i = 1; i < str.length(); i++)
        {
            str[i - 1] = str[i];
        }
        str[str.length() - 1] = ch;
    }
    string getEncryptedString(string s, int k) 
    {
       while(k--)
        {
            rotateString(s);
        } 
        return s;
        
    }
};