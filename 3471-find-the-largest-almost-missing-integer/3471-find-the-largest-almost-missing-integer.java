class Solution {
    public int largestInteger(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int ans = -1;
        if(k == n){
            for(int num : nums){
                ans = Math.max(ans, num);
            }
        }
        else if(k == 1){
            for(int num : nums){
                if(map.get(num) == 1){
                    ans = Math.max(ans, num);
                }
            }
        }
        else{
            if(map.get(nums[0]) == 1){
                ans = Math.max(ans, nums[0]);
            }
            if(map.get(nums[n - 1]) == 1){
                ans = Math.max(ans, nums[n - 1]);
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna