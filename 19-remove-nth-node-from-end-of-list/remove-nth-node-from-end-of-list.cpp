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
    ListNode* removeNthFromEnd(ListNode* head, int n) 
    {
        ListNode*tail=head;

        int count=0;
       
        while(tail!=nullptr)
        {
            count++;
            tail=tail->next;
        }
        
        int deleteValue= count-n;
       

        ListNode * temp = head;
        int c=0;

        while(temp!=nullptr && deleteValue!=0 && c != (deleteValue-1) )
        {
            temp=temp->next;
            c++;
        }
        

        if(deleteValue==0 && n==1)
        {
            return nullptr;
        }

        if(deleteValue==0 && n>=2)
        {
            head = head->next;
            return head;
        }

        if(temp!=nullptr && temp->next!=nullptr)
        {
            temp->next=temp->next->next;
        }
       

return head;


        
    }
};