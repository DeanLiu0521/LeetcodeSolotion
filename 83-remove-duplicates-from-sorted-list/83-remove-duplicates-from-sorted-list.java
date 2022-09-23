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
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head ==null) return null;
        ListNode slow=head, fast=head;
        for(;fast!=null;fast=fast.next){
            if(fast.val!=slow.val){
                slow.next = fast;
                slow = slow.next;
            }
        }
        slow.next = null;
        return head;
    }
}