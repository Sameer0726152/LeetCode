class Solution {
    public int minimumPushes(String word) {
        int[] arr = new int[26];
        for(char c : word.toCharArray()){
            arr[c - 'a']++;
        }
        Arrays.sort(arr);
        int num = 0;
        int idk = 0;
        for(int i = 25; i >= 0; i--){
            if(arr[i] == 0){
                break;
            }
            num += arr[i] * ((idk / 8) + 1);
            idk++;
        }
        return num;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna