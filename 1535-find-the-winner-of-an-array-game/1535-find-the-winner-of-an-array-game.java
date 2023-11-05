class Solution {
    public int getWinner(int[] arr, int k) {
        int champ = arr[0];
        int consecutiveWins = 0;

        for (int i = 1; i < arr.length; i++) {
            if (champ > arr[i]) {
                consecutiveWins++;
            } else {
                champ = arr[i];
                consecutiveWins = 1;
            }

            // Once a player has k consecutive wins, they're the winner.
            if (consecutiveWins == k) {
                return champ;
            }
        }

        // If we complete the loop without finding a winner, it means no player has won k times in a row.
        // The player with the highest strength will be the winner.
        return champ;
    }
}