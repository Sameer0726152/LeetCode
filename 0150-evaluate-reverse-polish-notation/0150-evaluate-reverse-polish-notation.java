import java.util.Stack;
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String op : tokens){
            switch(op){
                case "+":{
                    int num1 = stack.pop();
                    int num2 = stack.pop();
                    stack.push(num2 + num1);
                    break;
                }
                case "-":{
                    int num1 = stack.pop();
                    int num2 = stack.pop();
                    stack.push(num2 - num1);
                    break;
                }
                case "*":{
                    int num1 = stack.pop();
                    int num2 = stack.pop();
                    stack.push(num2 * num1);
                    break;
                }
                case "/":{
                    int num1 = stack.pop();
                    int num2 = stack.pop();
                    stack.push(num2 / num1);
                    break;
                }
                default:{
                    stack.push(Integer.parseInt(op));
                }
            }
        }
        return stack.pop();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna