import java.util.Stack;
class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for(String op : operations){
            if(op.equals("+")){
                int last = stack.pop();
                int second_last = stack.peek();
                stack.push(last);
                stack.push(last + second_last);
            }
            else if(op.equals("D")){
                stack.push(stack.peek() * 2);
            }
            else if(op.equals("C")){
                stack.pop();
            }
            else{
                stack.push(Integer.parseInt(op));
            }
        }
        int sum = 0;
        while(!stack.isEmpty()){
            sum += stack.pop();
        }
        return sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna