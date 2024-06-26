class Solution {
    public int removeDuplicates(int[] nums) {
        int TraversalPtr = 0;
        int k = 0; 
        int prev = Integer.MIN_VALUE;

        
        for(; TraversalPtr < nums.length; TraversalPtr ++){
            int currentElement = nums[TraversalPtr];
            if(prev != currentElement){
                nums[k] = currentElement;
                k ++;
                prev = currentElement;
            }
        }
        return k;
    }
}