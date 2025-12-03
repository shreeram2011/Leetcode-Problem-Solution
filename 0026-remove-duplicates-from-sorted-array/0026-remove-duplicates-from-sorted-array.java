class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        int cu = 1;

        while(cu < nums.length){
            if(nums[k] != nums[cu]){
                k ++;
                nums[k] = nums[cu];
            }
            cu ++;
        }
        return k + 1;
    }
}