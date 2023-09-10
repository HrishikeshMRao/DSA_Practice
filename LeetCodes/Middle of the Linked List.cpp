"""
Given the head of a singly linked list, return the middle node of the linked list.
If there are two middle nodes, return the second middle node.
"""  
//time -> O(n)
//space -> O(1)  






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
    ListNode* middleNode(ListNode* head) { 
        int num_nodes=1;
        ListNode* end = head;
        while((end!=NULL)&&(end->next!=NULL))
        {
        head = head->next;    
        end = end->next->next;
        }
        return(head);
    }
};
