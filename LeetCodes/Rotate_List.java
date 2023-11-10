/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
/*
Given the head of a linked list, rotate the list to the right by k places.

 

Example 1:

Input: head = [1,2,3,4,5], k = 2
Output: [4,5,1,2,3]

Example 2:

Input: head = [0,1,2], k = 4
Output: [2,0,1]
*/

class Solution {
    public ListNode rotateRight(ListNode head, int k) {

        if(head==null) return null;

        int j=1;
        ListNode temp = head;
        
        while(temp.next!=null)
        {
            temp = temp.next;
            j++;
        }
        temp.next = head;

        k%=j;
        j-=k;

        for(int i=0;i<j-1;i++)
        {
            head = head.next;
        }
        temp=head.next;
        head.next = null;
        return(temp);
    }
}
