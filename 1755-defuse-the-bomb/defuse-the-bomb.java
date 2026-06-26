class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] ans = new int[n];
        if (k == 0)
            return ans;
        int start, end;
        int sum = 0;
        if (k > 0) {
            start = 1;
            end = k;
        } else {
            start = n + k;
            end = n - 1;
        }
        for (int i = start; i <= end; i++) {
            sum += code[i];
        }
        for (int i = 0; i < n; i++) {
            ans[i] = sum;
            // Remove left element
            sum -= code[start % n];
            // Move window
            start++;
            end++;
            // Add new right element
            sum += code[end % n];
        }
        return ans;
    }
}