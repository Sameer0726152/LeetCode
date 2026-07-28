class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> arr1 = new HashSet<>();
        HashSet<Integer> arr2 = new HashSet<>();
        ArrayList<Integer> idk = new ArrayList<>();
        for(int i = 0; i < nums1.length; i++){
            arr1.add(nums1[i]);
        }
        for(int i = 0; i < nums2.length; i++){  
            arr2.add(nums2[i]);
        }
        for(int i : arr1){
            if(arr2.contains(i)){
                idk.add(i);
            }
        }
        int[] ans = new int[idk.size()];
        for(int i = 0; i < idk.size(); i++)
        {
            ans[i] = idk.get(i);
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna