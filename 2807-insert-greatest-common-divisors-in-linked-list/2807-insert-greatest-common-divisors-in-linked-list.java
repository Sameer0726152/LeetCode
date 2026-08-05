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
    private int gcd(int a, int b){
        while(b != 0){
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp = head;
        while(temp != null && temp.next != null){
            int value = gcd(temp.val, temp.next.val);
            ListNode newnode = new ListNode(value);
            ListNode next = temp.next;
            temp.next = newnode;
            newnode.next = next;
            temp = temp.next.next;
        }
        return head;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna