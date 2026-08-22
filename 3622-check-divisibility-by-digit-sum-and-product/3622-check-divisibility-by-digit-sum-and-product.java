class Solution {
    public boolean checkDivisibility(int n) {
        int s = 0;
        int p = 1;
        int idk = n;
        while(n > 0){
            int digit = n % 10;
            s += digit;
            p *= digit;
            n /= 10;
        }
        return idk % (s + p) == 0;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna