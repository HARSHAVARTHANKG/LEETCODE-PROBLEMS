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
    ListNode* removeElements(ListNode* head, int val) 
    {

        ListNode * tail=head;
        
        if(tail==nullptr)
        {
            return head;
        }
        if(tail->next==nullptr)
        {
           if(tail->val==val)
           {
             head = nullptr;
             return head;
           }
        }

     while(tail != nullptr && tail->val == val)
    {
        head = tail->next;
        tail = head;
    }
        
        while(tail!=nullptr && tail->next !=nullptr)
        {
           
           if(tail->next->val == val )
           {
                tail->next = tail->next->next;
           }
           else
           {
            tail=tail->next;
           }
        }
        return head;
        
    }
};