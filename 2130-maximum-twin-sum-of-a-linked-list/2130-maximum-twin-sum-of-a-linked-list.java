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
        int size = 0;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        int[] arr = new int[size];
        temp = head;
        for(int i = 0; i < size; i++){
            arr[i] = temp.val;
            temp = temp.next;
        }
        int left = 0; 
        int right = size - 1;
        int ans = 0;
        while(left < right){
            int sum = 0;
            sum += arr[left] + arr[right];
            if(sum > ans){
                ans = sum;
            }
            left++;
            right--;
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna