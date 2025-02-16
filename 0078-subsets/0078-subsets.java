class Solution {
    public List<List<Integer>> FinalAns = new ArrayList<>();
    public void helper(int[] nums , int index, List<Integer> Combination){
        
        //base case
        if(index == nums.length){
            FinalAns.add(new ArrayList<>(Combination));
            return;
        }

        //do not pick the element for combination
        helper(nums, index + 1, Combination);


        //pick the element and include in combination
        Combination.add(nums[index]);
        helper(nums, index + 1, Combination);
        Combination.remove(Combination.size() - 1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        helper(nums,0, new ArrayList<>());
        return FinalAns;
    }
}