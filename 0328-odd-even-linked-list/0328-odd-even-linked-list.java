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
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode temp = head;
        int size = 1;
        ListNode tail = head;
        ListNode prev = null;
        while(tail.next != null){
            tail = tail.next;
            size++;
        }
        for(int i = 1; i <= size; i++){
            ListNode temp1 = temp.next;
            if(i % 2 == 0 && temp != tail){
                prev.next = temp.next;
                tail.next = temp;
                temp.next = null;
                tail = temp;
            }
            else{
                prev = temp;
            }
            temp = temp1;
        }
        return head;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna