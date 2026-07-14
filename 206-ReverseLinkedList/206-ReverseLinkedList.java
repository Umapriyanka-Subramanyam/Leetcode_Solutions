// Last updated: 7/14/2026, 2:18:50 PM
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode next=null;
        ListNode curr=head;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}