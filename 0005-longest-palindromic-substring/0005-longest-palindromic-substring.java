class Solution {
    public String longestPalindrome(String s) {
        int length = s.length();
        String ans = "";
        int maxLength = 0;

        for(int mid = 0; mid < length; mid ++){
            int i = mid - 1;
            int j = mid + 1;
            int currentLength = 1;
            while(i >= 0 && j < length && s.charAt(i) == s.charAt(j)){
                i --;
                j ++;
                currentLength += 2;
            }
            if(currentLength > maxLength){
                ans = s.substring(i + 1, j);
                maxLength = currentLength;
            }
        }

        for(int mid = 0; mid < length - 1; mid ++){
            int i = mid;
            int j = mid + 1;
            int currentLength = 0;
            while(i >= 0 && j < length && s.charAt(i) == s.charAt(j)){
                i --;
                j ++;
                currentLength += 2;
            }
            if(currentLength > maxLength){
                ans = s.substring(i + 1, j);
                maxLength = currentLength;
            }
        }
        return ans;
    }
}