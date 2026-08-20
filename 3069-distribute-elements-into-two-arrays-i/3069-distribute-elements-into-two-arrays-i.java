class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;
        int arr1 = 0;
        int arr2 = n - 1;
        int[] result = new int[n];
        result[arr1] = nums[0];
        result[arr2] = nums[1];
        for(int i = 2; i < n; i++){
            if(result[arr1] > result[arr2]){
                arr1++;
                result[arr1] = nums[i];
            }
            else{
                arr2--;
                result[arr2] = nums[i];
            }
        }
        int left = arr2;
        int right = n - 1;
        while(left < right){
            int temp = result[right];
            result[right] = result[left];
            result[left] = temp;
            left++;
            right--;
        }
        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna