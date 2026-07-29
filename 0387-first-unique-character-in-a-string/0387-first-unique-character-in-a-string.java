class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char i : s.toCharArray()){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for(int i = 0; i < s.length(); i++){
            if(map.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna