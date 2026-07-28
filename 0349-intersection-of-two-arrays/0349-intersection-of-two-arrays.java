class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> arr1 = new HashSet<>();
        HashSet<Integer> arr2 = new HashSet<>();
        for(int num : nums1){
            arr1.add(num);
        }
        for(int num : nums2){
            if(arr1.contains(num)){
                arr2.add(num);
            }
        }
        int[] arr = new int[arr2.size()];
        int i = 0;
        for(int num : arr2){
            arr[i] = num;
            i++;
        }
        return arr;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna