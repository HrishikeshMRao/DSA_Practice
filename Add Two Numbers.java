"""
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.

"""
//Space 0(1)
//time O(n)




class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
        ListNode head = new ListNode(0);
        head.next=l1;
        ListNode head_l1 = head;
        int sum =0,digit1; 
        while(!((head.next==null)&&(l2==null)))
        {
            if(head.next != null) 
            digit1 = head.next.val;
            else
            {
                ListNode node = new ListNode(0);
                head.next = node;
                digit1 = 0; 
            }
            int digit2 = (l2 != null) ? l2.val : 0;
            sum = digit1+digit2+sum;
            head.val=sum%10;  
            sum = sum/10;
            if(head.next.next==null)
            {
                if(sum!=0)
                {
                    head.next.val = sum;
                    head = head.next;
                }
                else
                head.next = null;
            }
            else    
            head = head.next;
            l2 = (l2!= null) ? l2.next : null;  
        }
        
        return (head_l1);        
    }
}
