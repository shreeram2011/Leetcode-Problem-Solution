class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, res, 0, nums1.length);
        System.arraycopy(nums2, 0, res, nums1.length, nums2.length);
        Arrays.sort(res);

        int n = res.length;
        if (n % 2 == 0) {
            return ((double) res[n/2 - 1] + res[n/2]) / 2.0;
        }
        return res[n/2];
    }
}