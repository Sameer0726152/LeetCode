class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer, Integer> arr = new HashMap<>();
        for(int num : nums){
            arr.put(num, arr.getOrDefault(num, 0) + 1);
        }
        int sum = 0;
        for(int num : arr.keySet()){
            if(arr.get(num) == 1){
                sum += num;
            }
        }
        return sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna