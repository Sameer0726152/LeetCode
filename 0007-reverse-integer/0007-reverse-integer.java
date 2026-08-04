class Solution {
    public int reverse(int x) {
        int ans = 0;
        while( x != 0){
            int digit = x % 10;
            if(ans > Integer.MAX_VALUE / 10 || ans == Integer.MAX_VALUE / 10 && digit > 7){
                return 0;
            }
            if(ans < Integer.MIN_VALUE / 10 || ans == Integer.MIN_VALUE / 10 && digit < -8){
                return 0;
            }
            ans = ans * 10 + digit;
            x /= 10;
        }
        
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna