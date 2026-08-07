import java.util.Stack;
class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int ans = 0;
        for(int i = 0; i <= heights.length; i++){
            int currheight = (i == heights.length) ? 0 : heights[i];
            while(!stack.isEmpty() && heights[stack.peek()] > currheight){
                int index = stack.pop();
                int height = heights[index];
                int width;
                if(stack.isEmpty()){
                    width = i;
                }
                else{
                    width = i - stack.peek() - 1;
                }
                int area = height * width;
                ans = Math.max(ans, area);
            }
            stack.push(i);
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna