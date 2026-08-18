class Solution {
    public int largestInteger(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int left = 0;
        int right = k;
        int ans = -1;
        for(int j = 0; j <= nums.length - k; j++){
            HashSet<Integer> set = new HashSet<>();
            for(int i = left; i < right; i++){
                set.add(nums[i]);
            }
            for(int num : set){
                map.put(num, map.getOrDefault(num, 0) + 1);
            }   
            left++;
            right++;
        }
        for(int num : map.keySet()){
            if(map.get(num) == 1){
                ans = Math.max(ans, num);
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna