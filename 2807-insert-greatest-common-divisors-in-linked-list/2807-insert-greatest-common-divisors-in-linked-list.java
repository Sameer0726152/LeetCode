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
import java.math.BigInteger;
class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp = head;
        while(temp != null && temp.next != null){
            BigInteger num1 = BigInteger.valueOf(temp.val);
            BigInteger num2 = BigInteger.valueOf(temp.next.val);
            BigInteger gcdvalue = num1.gcd(num2);
            int value = gcdvalue.intValue();
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