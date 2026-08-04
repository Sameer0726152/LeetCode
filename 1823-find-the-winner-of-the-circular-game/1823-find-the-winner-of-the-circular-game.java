class Solution {
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> player = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            player.add(i);
        }
        int index = 0;
        while(player.size() > 1){
            index = (index + k - 1) % player.size();
            player.remove(index);
        }
        return player.get(0);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna