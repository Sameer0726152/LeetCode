class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        ArrayList<Integer> idk1 = new ArrayList<>();
        ArrayList<Integer> idk2 = new ArrayList<>();
        for(int num : nums1){
            set1.add(num);
        }
        for(int num : nums2){
            set2.add(num);
        }
        for(int num : set1){
            if(!set2.contains(num)){
                idk1.add(num);
            }
        }
        for(int num : set2){
            if(!set1.contains(num)){
                idk2.add(num);
            }
        }
        List<List<Integer>> idk = new ArrayList<>();
        idk.add(idk1);
        idk.add(idk2);
        return idk;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna