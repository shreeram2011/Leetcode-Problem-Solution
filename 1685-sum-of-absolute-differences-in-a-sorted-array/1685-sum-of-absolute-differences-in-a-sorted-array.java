class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        int total = 0;
        for (int x : nums) total += x;

        int leftSum = 0;
        for (int i = 0; i < n; i++) {
            int rightSum = total - leftSum - nums[i];
            res[i] = (nums[i] * i - leftSum) + (rightSum - nums[i] * (n - 1 - i));
            leftSum += nums[i];
        }
        return res;
    }
}