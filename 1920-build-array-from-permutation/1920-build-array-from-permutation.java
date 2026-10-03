class Solution {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        if(n == 0) return new int[0];
        int res[] = new int[n];

        for(int i = 0; i < n; i ++){
            res[i] = nums[nums[i]];
        }

        return res;
    }
}