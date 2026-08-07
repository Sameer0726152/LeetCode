import java.util.Stack;
class Solution {
    public String decodeString(String s) {
        Stack<Character> stack = new Stack<>(); 
        int k = 0;
        for(char ch : s.toCharArray()){
            if(ch != ']'){
                stack.push(ch);
            }
            else{
                StringBuilder str = new StringBuilder();
                while(stack.peek() != '['){
                    str.append(stack.pop());
                }
                str.reverse();
                stack.pop();
                StringBuilder number = new StringBuilder();
                while(!stack.isEmpty() && Character.isDigit(stack.peek())){
                    number.append(stack.pop());
                }
                number.reverse();
                k = Integer.parseInt(number.toString());
                StringBuilder finalstring = new StringBuilder();
                for(int i = 0; i < k; i++){
                    finalstring.append(str);
                }
                for(char c : finalstring.toString().toCharArray()){
                    stack.push(c);
                }
            }
        }
        StringBuilder result = new StringBuilder();
        while(!stack.isEmpty()){
            result.append(stack.pop());
        }
        return result.reverse().toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna