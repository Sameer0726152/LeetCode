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
    public ListNode partition(ListNode head, int x) {
        if(head == null){
            return head;
        }
        ListNode lessdummy = new ListNode(0);
        ListNode moredummy = new ListNode(0);
        ListNode less = lessdummy;
        ListNode more = moredummy;
        ListNode temp = head;
        while(temp != null){
            if(temp.val < x){
                less.next = temp;
                less = less.next;
            }
            else{
                more.next = temp;
                more = more.next;
            }
            temp = temp.next;
        }
        less.next = moredummy.next;
        more.next = null;
        return lessdummy.next;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna