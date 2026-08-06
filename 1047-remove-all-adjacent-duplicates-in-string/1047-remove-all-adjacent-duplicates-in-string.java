class Solution {
    public String removeDuplicates(String s) { 
        StringBuilder result = new StringBuilder();
        for(char ch : s.toCharArray()){
            int length = result.length();
            if(length != 0 && result.charAt(length - 1) == ch){
                result.deleteCharAt(length - 1);
            }
            else{
                result.append(ch);
            }
        }
        return result.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna