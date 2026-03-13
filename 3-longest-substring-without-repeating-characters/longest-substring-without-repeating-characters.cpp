class Solution {
public:
    int lengthOfLongestSubstring(string s) 
    {
       unordered_set<int> st;

       int start=0;
       int end=0;
       int size=s.length();

       int length=0;
       int maxLength=0;

       while(end < size)
       {
            while(st.find(s[end])!=st.end())
            {
                st.erase(s[start]);
                start++;
            }

            length=end-start+1;
            maxLength=max(length,maxLength);
            st.insert(s[end]);
            end++;
       }

       return maxLength;
        
    }
};