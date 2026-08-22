class Solution {
    public int findNumbers(int[] nums) {
        int t = 0;

        for (int i = 0; i < nums.length; i++) {
            int s = 0;
            int n = nums[i];

            while (n > 0) {
                s++;
                n = n / 10;
            }

            if (s % 2 == 0) {
                t++;
            }
        }

        return t;
    }
}