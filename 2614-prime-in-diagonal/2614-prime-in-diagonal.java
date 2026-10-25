class Solution {
    private boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; (long) i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public int diagonalPrime(int[][] nums) {
        int n = nums.length, greatest = 0;
        for (int i = 0; i < n; i++) {
            int a = nums[i][i];
            int b = nums[i][n - 1 - i];
            if (a > greatest && isPrime(a)) greatest = a;
            if (b > greatest && isPrime(b)) greatest = b;
        }
        return greatest;
    }
}