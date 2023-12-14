class Solution {
    public long countSubarrays(int[] nums, int k) {
        int maxEle = -1;
        long ans = 0;
        for(int i:nums) {
            maxEle = Math.max(maxEle, i);
        }
        int n = nums.length;
        int currentCount = 0;
        int prevIdx = 0;
        for(int i=0;i<n;i++) {
            if(nums[i] == maxEle) {
                currentCount++;
                while (currentCount >= k) {
                    ans+=n-i;
                    if(nums[prevIdx] == maxEle) currentCount--;
                    prevIdx++;
                }
            }
        }
        return ans;
    }
}