class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length + nums2.length];
        int idx = 0;
        for(int num : nums1){
            res[idx] += num;
            idx ++;
        }

        for(int n : nums2){
            res[idx] += n;
            idx ++;
        }

        Arrays.sort(res);
        
        double median = 0;
        int n = res.length;
        if(n % 2 == 0){
            median = (double)(res[n/2] + res[n/2 - 1])/2;
        }
        else{
            median = res[n / 2];
        }

        return median;
    }
}