class Solution {
    public int maximumWealth(int[][] accounts) {
        int wealth = 0;
        for (int i = 0; i < accounts.length; i++){
            int current = 0;
            for(int j = 0; j < accounts[i].length; j++){
                current += accounts[i][j];
            }
            if(current > wealth){
                wealth = current;
            }
        }
        return wealth;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna