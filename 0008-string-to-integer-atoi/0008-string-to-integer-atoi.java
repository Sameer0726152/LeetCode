class Solution {
    public int myAtoi(String s) {
        StringBuilder ans = new StringBuilder();
        boolean isnegative = false;
        int i = 0;
        while(i < s.length() && s.charAt(i) == ' '){
            i++;
        }
        if(i < s.length() && s.charAt(i) == '-'){
            isnegative = true;
            i++;
        }
        else if(i < s.length() && s.charAt(i) == '+'){
            i++;
        }
        while(i < s.length() && Character.isDigit(s.charAt(i))){
            ans.append(s.charAt(i));
            i++;
        }
        if(ans.length() == 0){
            return 0;
        }
        long value = 0;
        for(int j = 0; j < ans.length(); j++){
            int digit = ans.charAt(j) - '0';
            if(value > (Integer.MAX_VALUE - digit) / 10) {
                return isnegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            value = value * 10 + digit;
        }
        if(isnegative){
            value = -value;
        }
        if(value > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        if(value < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return (int)value;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna