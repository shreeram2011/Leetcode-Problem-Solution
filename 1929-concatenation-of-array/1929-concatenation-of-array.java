class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = 2 * nums.length;
        int res[] = new int[n];
        int idx = 0;

        for(int num : nums){
            res[idx ++] = num;
        }

        for(int num : nums){
            res[idx ++] = num;
        }

        return res;
    }
}