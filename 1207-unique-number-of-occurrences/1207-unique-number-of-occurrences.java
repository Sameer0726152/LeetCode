class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for(int key : map.keySet()){
            int freq = map.get(key);
            if(set.contains(freq)){
                return false;
            }
            else{
                set.add(freq);
            }
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna