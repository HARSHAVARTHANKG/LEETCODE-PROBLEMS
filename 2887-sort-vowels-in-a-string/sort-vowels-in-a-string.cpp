class Solution {
public:
    string sortVowels(string s) 
    {
        string str;
   for(char c : s)
   {
       if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
            c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') 
            {
                str+=c;
            }
   }
   std::sort(str.begin(),str.end());

   
   for(int i=0,j=0;i<s.length();i++)
   {
       if (s[i] == 'a' || s[i] == 'e' || s[i] == 'i' || s[i] == 'o' || s[i] == 'u' ||
            s[i] == 'A' || s[i] == 'E' || s[i] == 'I' || s[i] == 'O' || s[i] == 'U') 
            {
                s[i]=str[j];
                j++;
            }
   }
   return s;
        
    }
};