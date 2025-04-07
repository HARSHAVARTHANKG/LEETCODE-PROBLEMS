class Solution {
public:
    bool isValid(string s) 
    {
       vector<char> stack;
       
       for(char x : s)
       {
            if(x=='{' || x=='[' || x=='(')
            {
                stack.push_back(x);
            }
            else
            {
                if((!(stack.empty())))
                {
                    int top=stack.back();
                        if(top=='{' && (x!='}') || top=='[' && (x!=']') || top=='(' && (x!=')'))
                    {
                        return false;
                    }
                    else 
                    {
                        stack.pop_back();
                    }
                }
                else
                {
                    return false;
                }
            }
       }
       if(stack.size()==0)
       {
        return true;
       }
       else
       {
        return false;
       }
    }

};