class Solution {
    public List<Integer> getGoodIndices(int[][] variables, int target) {
        List<Integer> answer = new ArrayList<>();
        int i = -1;
        for(int[] variable:variables) {
            i++;
            int a = variable[0];
            int b = variable[1];
            int c = variable[2];
            int d = variable[3];
            int x = 1;
            for(int j=1;j<=b;j++) {
                x = (x* (a % 10)) % 10;
            }
            int y =1;
            for(int j=1;j<=c;j++) {
                y = (y * (x % d)) % d;
            }
            if(y == target) {
                answer.add(i);
            }

        }
        return answer;

    }
}