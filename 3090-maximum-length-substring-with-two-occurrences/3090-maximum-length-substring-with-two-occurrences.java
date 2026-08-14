class Solution {
    public int maximumLengthSubstring(String s) {
        int[] freq = new int[26];
        int left = 0;
        int ans = 0;
        for(int right = 0; right < s.length(); right++){
            int index = s.charAt(right) - 'a';
            freq[index]++;
            while(freq[index] > 2){
                int leftindex = s.charAt(left) - 'a';
                freq[leftindex]--;
                left++;
            }
            int size = right - left + 1;
            ans = Math.max(ans, size);
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna