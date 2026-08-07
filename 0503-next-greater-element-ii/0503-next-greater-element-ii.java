import java.util.Stack;
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[nums.length];
        for(int i = nums.length * 2 - 1; i >= 0; i--){
            int index = i % nums.length;
            while(!stack.isEmpty() && stack.peek() <= nums[index]){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans[index] = -1;
            }
            else{
                ans[index] = stack.peek();
            }
            stack.push(nums[index]);
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna