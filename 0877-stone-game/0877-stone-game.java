class Solution {
    public boolean stoneGame(int[] piles) {
        Integer dp[][] = new Integer[piles.length][piles.length];
        int difference  = solve(piles, 0, piles.length - 1, dp);
        return difference > 0;
    }
    private int solve(int[] piles, int left, int right, Integer[][] dp) {
    if (left == right) {
        return piles[left];
    }
    if(dp[left][right] != null){
        return dp[left][right];
    }
    int takeLeft = piles[left] - solve(piles, left + 1, right, dp);
    int takeRight = piles[right] - solve(piles, left, right - 1, dp);
    dp[left][right] = Math.max(takeLeft, takeRight);
    return Math.max(takeLeft, takeRight);
}
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna