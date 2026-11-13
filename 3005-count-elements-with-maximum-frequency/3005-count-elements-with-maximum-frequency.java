class Solution {
    public int maxFrequencyElements(int[] nums) {
        int n = nums.length;
        int hash[] = new int[101];

        //pre-compute hash
        for(int i = 0; i < n; i ++){
            hash[nums[i]] += 1;
        }

        //calculating the maximum frequency here
        int maxF = 0;
        for(int i = 0; i < hash.length; i ++){
            maxF = Math.max(hash[i], maxF);
        }

        //adding the maximum frequency
        int total = 0;
        for(int i = 0; i < hash.length; i ++){
            if(hash[i] == maxF){
                total += hash[i];
            }
        }

        return total;
        
    }
}