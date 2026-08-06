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
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        ListNode temp = head.next;
        int value = 0;
        while(temp != null){
            if(temp.val == 0){
                ListNode newnode = new ListNode(value);
                tail.next = newnode;
                tail = newnode;
                value = 0;
            }
            else{
                value += temp.val;
            }
            temp = temp.next;
        } 
        return dummy.next;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna