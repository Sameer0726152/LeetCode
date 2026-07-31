class Solution {
    public int searchInsert(int[] nums, int target) {
        int idk = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target || nums[i] > target){
                idk = i;
                break;
            }
            else{
                idk = nums.length;
            }
        }
        return idk;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna