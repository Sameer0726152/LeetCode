class Solution {
    public String minWindow(String s, String t) {
        if(s.length() < t.length()){
            return "";
        }
        HashMap<Character, Integer> need = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();
        for(char i : t.toCharArray()){
            need.put(i, need.getOrDefault(i, 0) + 1);
        }
        int left = 0;
        int satisfied = 0;
        int min = Integer.MAX_VALUE;    
        int start = 0;
        for(int right = 0; right < s.length(); right++){
            char current = s.charAt(right);
            window.put(current, window.getOrDefault(current, 0) + 1);
            if(need.containsKey(current) && window.get(current).intValue() == need.get(current).intValue()){
                satisfied++;
            }
            while(satisfied == need.size()){
                if(right - left + 1 < min){
                    min = right - left + 1;
                    start = left;
                }
                char lchar = s.charAt(left);
                window.put(lchar, window.getOrDefault(lchar, 0) - 1);
                if(need.containsKey(lchar) && window.get(lchar).intValue() < need.get(lchar).intValue()){
                    satisfied--;
                }
                left++;
            }
        }
        if(min == Integer.MAX_VALUE){
            return "";
        }
        return s.substring(start, start + min);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna