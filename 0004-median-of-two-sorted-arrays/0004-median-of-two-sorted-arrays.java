class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length + nums2.length;
        int[] sorted = new int[n];
        int index = 0;
        int i = 0;
        int j = 0;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] <= nums2[j]){
                sorted[index++] = nums1[i++];
            }
            else{
                sorted[index++] = nums2[j++];
            }
        }
        while(i < nums1.length){
            sorted[index++] = nums1[i++];
        }
        while(j < nums2.length){
            sorted[index++] = nums2[j++];
        }
        if(n % 2 == 1){
            return sorted[n / 2];
        }
        return (sorted[n / 2 - 1] + sorted[n / 2]) / 2.0;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna