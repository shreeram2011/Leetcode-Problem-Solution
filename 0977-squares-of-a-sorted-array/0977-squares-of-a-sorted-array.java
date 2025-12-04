class Solution {
    public int[] sortedSquares(int[] nums) {
    ArrayList<Integer> neg = new ArrayList<>();
    ArrayList<Integer> pos = new ArrayList<>();
    
    for (int i = 0; i < nums.length; i++) {
        int sq = nums[i] * nums[i];
        
        if (nums[i] < 0) {
            neg.add(sq);
        } else {
            pos.add(sq);
        }
    }
    
    // reverse negative squares
    int[] revNeg = new int[neg.size()];
    for (int i = 0; i < neg.size(); i++) {
        revNeg[i] = neg.get(neg.size() - 1 - i);
    }

    int[] posArr = new int[pos.size()];
    for (int i = 0; i < pos.size(); i++) {
        posArr[i] = pos.get(i);
    }

    // merge two sorted arrays
    int[] res = new int[revNeg.length + posArr.length];
    int i = 0, j = 0, id = 0;

    while (i < revNeg.length && j < posArr.length) {
        if (revNeg[i] <= posArr[j]) {
            res[id++] = revNeg[i++];
        } else {
            res[id++] = posArr[j++];
        }
    }

    while (i < revNeg.length) res[id++] = revNeg[i++];
    while (j < posArr.length) res[id++] = posArr[j++];

    return res;
}

}