/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    int getDecimalValue(ListNode* head) 
    {
        string str = "";

        ListNode * temp = head;
       

        while(temp!=nullptr)
        {
            int value = temp->val;
            str=  str + (char)(value+'0') ;
            temp=temp->next;
        }
        cout<<str;

        int result =0;
        int pow = 1;

        for(int i=str.length()-1;i>=0;i--)
        {
            result = result + ((str[i]-'0')*pow);
            pow = pow * 2;
        }

        return result;
        
    }
};