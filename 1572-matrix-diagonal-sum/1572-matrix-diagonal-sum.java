class Solution {
    public int diagonalSum(int[][] mat) {
       int r = mat.length;
       int c = mat[0].length;
       int sum = 0;

       for(int i = 0; i < r; i ++){
        int PrimaryDiagonal = mat[i][i];
        sum += PrimaryDiagonal;
        int SecondaryDiagonal = mat[i][c - 1 - i];
        if(i != (c - 1 - i)){
            sum += SecondaryDiagonal;
        }
       }
       return sum;
    }
}
