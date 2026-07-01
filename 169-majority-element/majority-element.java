import java.util.Arrays;

class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);

        int m = n / 2;
        int res = 0;

        for(int i = 0; i < n; i++) {
            if(i == m) {
                res = nums[m];
            }
        }

        return res;
    }
}