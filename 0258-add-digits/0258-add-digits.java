class Solution {
    public int addDigits(int num) {
        String idk = String.valueOf(num);
        while(idk.length() > 1){
            int sum = 0;
            for(int i = 0; i < idk.length(); i++){
                sum += idk.charAt(i) - '0';
            }
                idk = String.valueOf(sum);
        }
        return Integer.parseInt(idk);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna