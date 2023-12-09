class Solution {
    public int getMaximumConsecutive(int[] coins) {
        Arrays.sort(coins);
        int maxValue = 0;
        for(int coin:coins) {
            if(coin > maxValue+1) return maxValue+1;
            else {
                maxValue+=coin;
            }

        }
        return maxValue+1;
    }
}