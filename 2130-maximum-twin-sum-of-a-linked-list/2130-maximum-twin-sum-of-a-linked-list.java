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
    public int pairSum(ListNode head) {
        ListNode temp = head;
        ListNode slow = head;
        ListNode fast = head;
        ListNode before = head;
        while(fast != null && fast.next != null){
            before = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode previous = null;
        temp = slow;
        while(temp != null){
            ListNode next = temp.next;
            temp.next = previous;
            previous = temp;
            temp = next;
            slow = temp;
        }
        ListNode first = head;
        ListNode second = previous;
        int ans = 0;
        while(second != null){
            int sum = first.val + second.val;
            if(sum > ans){
                ans = sum;
            }
            first = first.next;
            second = second.next;
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna