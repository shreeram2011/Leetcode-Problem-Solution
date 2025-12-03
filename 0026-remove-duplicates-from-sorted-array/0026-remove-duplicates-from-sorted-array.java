class Solution {
    public int removeDuplicates(int[] nums) {
        int traversalPtr = 0;
        int k = 0;
        int prev = Integer.MIN_VALUE;

        for(; traversalPtr < nums.length; traversalPtr ++){
            if(prev != nums[traversalPtr]){
                nums[k] = nums[traversalPtr];
                k ++;
                prev = nums[traversalPtr];
            }
        }
        return k;
    }
}