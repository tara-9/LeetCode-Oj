class Solution {
    public int minimumSum(int n, int k) {
        int sum = 0;
        int i=1;
        int count=1;
        while(i <= k/2 && count <= n) {
            sum+=i;
            count++;
            i++;
        }
        i = k;
        while(count <= n) {
            sum+=i;
            count++;
            i++;
        }

        return sum;

    }
}