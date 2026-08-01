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
    public int getDecimalValue(ListNode head) {
        ListNode temp1 = head;
        ListNode temp2 = head;
        int count = 0;
        while(temp1.next != null){
            count++;
            temp1 = temp1.next;
        }
        int decimal = 0;
        while(temp2 != null){
            if(temp2.val == 1){
                decimal += Math.pow(2, count--);
                temp2 = temp2.next;
            }
            else{
                count--;
                temp2 = temp2.next;
            }
        }
        return decimal;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna