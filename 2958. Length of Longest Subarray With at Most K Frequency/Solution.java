class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        int goodIdx = 0;
        for(int i=0;i<n;i++) {
            int num = nums[i];
            int count = map.getOrDefault(num, 0);
            if(count +1 > k) {
                while(nums[goodIdx] != num){
                    int numCount = map.get(nums[goodIdx]);
                    map.put(nums[goodIdx], numCount-1);
                    goodIdx++;
                }
                goodIdx++;
                map.put(num,count);
            } else map.put(num, count+1);
            ans = Math.max(ans, i-goodIdx+1);
        }
        return ans;
    }
}