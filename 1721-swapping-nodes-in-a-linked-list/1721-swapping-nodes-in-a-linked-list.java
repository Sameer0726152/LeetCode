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
    public ListNode swapNodes(ListNode head, int k) {
        int size = 1;
        ListNode tail = head;
        while(tail.next != null){
            size++;
            tail = tail.next;
        }
        int x = size - k + 1;
        ListNode temp = head;
        ListNode knode = temp;
        ListNode xnode = temp;
        for(int i = 1; i <= size; i++){
            if(temp != null){
                if(i == k){
                    knode = temp;
                }
                if(i == x){
                    xnode = temp;
                }
                temp = temp.next;
            }
        }
        int value = knode.val;
        knode.val = xnode.val;
        xnode.val = value;
        return head;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna