//First Solution

class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int result [] = new int[n];
        
        for(int i = 0; i < n; i ++)
            result[i] = nums[i] * nums[i];
        Arrays.sort(result);
        return result;
    }
}


//Second Solution

class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int result [] = new int[n];
        int l = 0;
        int r = n - 1;
        int ind = n - 1;

        while (l <= r){
            int SqoLeft = nums[l] * nums[l];
            int SqoRight = nums[r] * nums[r];

            if(SqoRight > SqoLeft){
                result[ind] = SqoRight;
                r --;
            }
            else{
                result[ind] = SqoLeft;
                l ++;
            }
            ind --;
        }
        return result;
    }
}
