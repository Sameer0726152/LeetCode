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
    public ListNode modifiedList(int[] nums, ListNode head) {
        ListNode temp = head;
        HashSet<Integer> arr = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            arr.add(nums[i]);
        }
        while(temp != null && temp.next != null){
            if(head != null && arr.contains(head.val)){
                head = head.next;
            }
            if(arr.contains(temp.next.val)){
                temp.next = temp.next.next;
            }
            else{
                temp = temp.next;
            } 
        }
        return head;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna