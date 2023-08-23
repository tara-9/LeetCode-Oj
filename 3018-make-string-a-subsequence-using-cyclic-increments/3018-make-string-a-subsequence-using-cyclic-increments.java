class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int n1 = str1.length();
        int n2 = str2.length();
        int i = 0;
        int j = 0;
        while (j < n2 && i < n1) {
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(j);
            if(ch1 == ch2 || ch2 - ch1 == 1 || ch2 == 'a' && ch1 == 'z') j++;
            i++;

        }
        return j == n2;
    }
}
