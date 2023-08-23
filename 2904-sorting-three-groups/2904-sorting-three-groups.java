class Solution {
    public int minimumOperations(List<Integer> nums) {
        int n = nums.size();
        int[][] dp = new int[n+1][3];
        for(int i=1;i<=n;i++) {
            int num = nums.get(i-1);
            for(int j=0;j<3;j++) {
                if(j == 0){
                    dp[i][j] = num == j+1? dp[i-1][j] : 1 +  dp[i-1][j];
                }
                else if(j == 1){
                    int previousMin = Math.min(dp[i-1][j], dp[i-1][j-1]);
                    dp[i][j] = num == j+1? previousMin : 1 +  previousMin;
                }
                else if(j == 2){
                    int previousMin = Math.min(Math.min(dp[i-1][j], dp[i-1][j-1]), dp[i-1][j-2]);
                    dp[i][j] = num == j+1? previousMin: 1 +  previousMin;
                }
            }
        }
        return Math.min(Math.min(dp[n][0], dp[n][1]), dp[n][2]);
    }
}