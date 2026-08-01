class Solution {
    public boolean predictTheWinner(int[] nums) {
        int difference = solve(nums, 0, nums.length - 1);
        return difference >= 0;
    }
    private int solve(int[] nums, int left, int right){
        if(left == right){
            return nums[left];
        }
        int takeleft = nums[left] - solve(nums, left + 1, right);
        int takeright = nums[right] - solve(nums, left, right - 1);
        return Math.max(takeleft, takeright);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna