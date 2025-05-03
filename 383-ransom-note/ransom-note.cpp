class Solution {
public:

bool compareString(char c,string &magazine)
{
    int flag=0;
    for(int i=0;i<magazine.length();i++)
    {
        if(c==magazine[i])
        {
           magazine.erase(i,1);
            flag=1;
            break;
        }
    }
    if(flag)
    {
        return true;
    }
    return false;
}
    bool canConstruct(string ransomNote, string magazine) 
    {
            
    int flag=1;
    for(int i=0;i<ransomNote.length();i++)
    {
        if(!(compareString(ransomNote[i],magazine)))
        {
           flag =0;
        }
    }
    if(flag)
    {
        return true;
    }
    else
    {
        return false;
    }

    }
};