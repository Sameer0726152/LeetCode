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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || left == right){
            return head;
        }
        ListNode temp = head;
        ListNode previous = null;
        for(int i = 0; i < left - 1; i++){
            previous = temp;
            temp = temp.next;
        }
        ListNode before = previous;
        ListNode start = temp;
        previous = null;
        for(int i = 0; i < right - left + 1; i++){
            ListNode next = temp.next;
            temp.next = previous;
            previous = temp;
            temp = next;
        }
        if(before != null){
            before.next = previous;
        }
        else{
            head = previous;
        }
        start.next = temp;
        return head;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna