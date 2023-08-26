class Solution {
    public int longestEqualSubarray(List<Integer> nums, int k) {
        int n = nums.size();
        int end = 0;
        int start = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxF = 0;
        while(end < n) {
            int ele = nums.get(end);
            map.put(ele, map.getOrDefault(ele, 0)+1);
            maxF = Math.max(maxF, map.get(ele));
            if(end-start+1 - maxF > k) {
                int startEle = nums.get(start);
                map.put(startEle, map.get(startEle) -1);
                start++;
            }
            end++;

        }
        return maxF;
    }
}