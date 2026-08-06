class Solution {
    public int smallestNumber(int n, int t) {
        while(n <= 100){
            int product = 1;
            int num = n;
            while(num > 0){
                product *= num % 10;
                num /= 10;
            }
            if(product % t == 0){
                return n;
            }
            n++;
        }
        return 0;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna