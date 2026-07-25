class Solution {
    public int maxProduct(int n) {
        String idk = String.valueOf(n);
        int max = 0;
        for(int i = 0; i < idk.length(); i++){
            for(int j = i + 1; j < idk.length();j++){
                int d1 = idk.charAt(i) - '0';
                int d2 = idk.charAt(j) - '0';
                int mul = d1 * d2;
                if(mul > max){
                    max = mul;
                }
            }
        }
        return max;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna