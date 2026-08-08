import java.util.Stack;
class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int ans = 0;
        int n = heights.length;
        int[] prev = new int[n];
        int[] next = new int[n];
        for(int i = 0; i < n; i++){
            while(!stack.isEmpty() && heights[stack.peek()] >= heights[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                prev[i] = -1;
            }
            else{
                prev[i] = stack.peek();
            }
            stack.push(i);
        }
        stack.clear();
        for(int i = n - 1; i  >= 0; i--){
            while(!stack.isEmpty() && heights[stack.peek()] >= heights[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                next[i] = n;
            }
            else{
                next[i] = stack.peek();
            }
            stack.push(i);
        }
        for(int i = 0; i < n; i++){
            int width = next[i] - prev[i] - 1;
            int height = heights[i];
            int area = width * height;
            ans = Math.max(ans, area);
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna