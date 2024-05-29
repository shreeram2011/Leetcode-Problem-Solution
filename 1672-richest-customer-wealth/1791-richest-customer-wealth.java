class Solution {
    public int maximumWealth(int[][] accounts) {
        int MaximumWealth = 0;
        for(int [] account : accounts){
            int sum = 0;
            for(int wealth : account){
                sum += wealth;
                MaximumWealth = Math.max(MaximumWealth,sum);
            }
        }
        return MaximumWealth;
    }
}