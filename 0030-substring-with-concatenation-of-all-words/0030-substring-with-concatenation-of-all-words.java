class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> ans = new ArrayList<>();
        if(s.length() == 0 || words.length == 0){
            return ans;
        }
        HashMap<String, Integer> need = new HashMap<>();
        for(String idk : words){
            need.put(idk, need.getOrDefault(idk, 0) + 1);
        }
        int wordlength = words[0].length();
        int totalwords = words.length;
        for(int offset = 0; offset < wordlength; offset++){
            HashMap<String, Integer> window = new HashMap<>();
            int left = offset;
            int count = 0;
            for(int right = offset; right + wordlength <= s.length(); right += wordlength){
                String word = s.substring(right, right + wordlength);
                if(!need.containsKey(word)){
                    window.clear();
                    count = 0;
                    left = right + wordlength;
                    continue;
                }
                window.put(word, window.getOrDefault(word, 0) + 1);
                count++;
                while(window.get(word) > need.get(word)){
                    String lword = s.substring(left, left + wordlength);
                    window.put(lword, window.get(lword)- 1);
                    count--;
                    left += wordlength;
                }
                if(count == totalwords){
                    ans.add(left);
                }
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna