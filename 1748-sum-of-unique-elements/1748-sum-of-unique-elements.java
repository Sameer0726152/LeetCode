class Solution {
    public int sumOfUnique(int[] nums) {
        HashSet<Integer> arr = new HashSet<>();
        ArrayList<Integer> array = new ArrayList<>();
        for(int num : nums){
            if(!array.contains(num)){
                array.add(num);
                arr.add(num);
            }
            else{
                arr.remove(num);
            }
        }
        int sum = 0;
        for(int num : arr){
            sum += num;
        }
        return sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna