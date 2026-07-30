class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        int count = 0;
        if(n <= 8){
            return n;
        }
        else{
            count = 8;
            n -= 8;
            if(n <= 8){
                return count + (n * 2);
            }
            else{
                count = 24;
                n -= 8;
                if(n <= 8){
                    return count + (n * 3);
                }
            }
            count = 48;
            n -= 8;
        }
        return count + (n * 4);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna