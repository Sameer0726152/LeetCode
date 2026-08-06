import java.util.Stack;
class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> Stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(!Stack.isEmpty() && Stack.peek() == s.charAt(i)){
                Stack.pop();
            }
            else{
                Stack.push(s.charAt(i));
            }
        }
        StringBuilder result = new StringBuilder();
        while(!Stack.isEmpty()){
            result.append(Stack.pop());
        }
        return result.reverse().toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna