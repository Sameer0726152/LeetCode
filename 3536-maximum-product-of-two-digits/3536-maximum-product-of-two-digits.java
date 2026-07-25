class Solution {
    public int maxProduct(int n) {
        int largest = 0;
        int secondlargest = 0;
        String idk = String.valueOf(n);
        for(int i = 0;i < idk.length(); i++){
            if(idk.charAt(i) - '0' > largest){
                secondlargest = largest;
                largest = idk.charAt(i) - '0';
            }
            else if(idk.charAt(i) - '0' > secondlargest){
                secondlargest = idk.charAt(i) - '0';
            }
        }
        return largest * secondlargest;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna