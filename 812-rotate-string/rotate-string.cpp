class Solution {
public:
    void rotateIt(string &s)
    {
        char c = s[0];

        for(int i=1;i<s.length();i++)
        {
            s[i-1]=s[i];
        }
        s[s.length()-1]=c;
    }
    bool rotateString(string s, string goal)
    {
        int i=0;

        while(i!=s.length())
        {
            if(s==goal)
            {
                return true;
            }
            rotateIt(s);
            i++;
        }
        return false;
    }
};