"""
Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect. If the two linked lists have no intersection at all, return null.

For example, the following two linked lists begin to intersect at node c1:

The test cases are generated such that there are no cycles anywhere in the entire linked structure.

Note that the linked lists must retain their original structure after the function returns.

Custom Judge:

The inputs to the judge are given as follows (your program is not given these inputs):

    intersectVal - The value of the node where the intersection occurs. This is 0 if there is no intersected node.
    listA - The first linked list.
    listB - The second linked list.
    skipA - The number of nodes to skip ahead in listA (starting from the head) to get to the intersected node.
    skipB - The number of nodes to skip ahead in listB (starting from the head) to get to the intersected node.

The judge will then create the linked structure based on these inputs and pass the two heads, headA and headB to your program. If you correctly return the intersected node, then your solution will be accepted.

"""
//O(n)time
//O(n)space




public class Solution 
{
    private boolean decider;
    int i;
    ListNode index=null;
    
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) 
    {
        int ListA_size = 0;
        int ListB_size = 0;
        ListNode headA_fake=headA,headB_fake=headB;
        while(headA_fake!=null)
        {
            headA_fake=headA_fake.next;
            ListA_size++;
        }
        while(headB_fake!=null)
        {
            headB_fake=headB_fake.next;
            ListB_size++;
        }
        boolean decider = (ListA_size>ListB_size) ? true : false ;
        int length_offset = (ListA_size>ListB_size) ? (ListA_size-ListB_size):(ListB_size-ListA_size);
        int effective_length = (ListA_size>ListB_size) ? ListB_size : ListA_size;
        if(decider)
        {
            while((headA!=null)&&(length_offset!=0))
            {
                headA = headA.next;
                length_offset--;
            }
        }
        else
        {
            while((headB!=null)&&(length_offset!=0))
            {
                headB = headB.next;
                length_offset--;
            }
        }
        while((headB!=null)&&(headA!=null)&&(effective_length!=0))
        {
            if(headA==headB)
            {
                index = headA;
                break;
            }
            effective_length--;
            headA = headA.next;
            headB = headB.next;
        }
        return(index);    
    }
}
