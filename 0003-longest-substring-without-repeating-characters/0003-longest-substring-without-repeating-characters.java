class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        int longest = 0;
        for(int right = 0; right < s.length(); right++){
            char current = s.charAt(right);
            if(map.containsKey(current)){
                left = Math.max(left, map.get(current) + 1);
            }
            map.put(current, right);
            longest = Math.max(longest, right - left + 1);
        }
        return longest;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna