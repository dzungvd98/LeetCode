class Solution {
    public static int lengthOfLongestSubstring(String s) {
        boolean check[] = new boolean[255] ;
        int left = 0, maxLen = 0, count = 0;
        for(int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            if(check[c] == false) {
                check[c] = true;
                count++;
                maxLen  = Math.max(maxLen, count);
                continue;
            }
           
            if(check[c] == true) {
                while(s.charAt(left) != c) {
                    check[s.charAt(left)] = false;
                    left++;
                } 
                left++;
                count = right - left + 1;
            }
        }
        return maxLen;
    }
    
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
}