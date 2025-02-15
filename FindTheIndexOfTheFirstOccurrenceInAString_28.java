class Solution {
    public static int strStr(String haystack, String needle) {
        int i = 0, j, count;
        while( i < haystack.length()) {
            if(haystack.charAt(i) == needle.charAt(0)) {
                j = 0;
                
                int k = i;
                count = 0;
                while(k < haystack.length() && j < needle.length()) {
                    if(haystack.charAt(k) == needle.charAt(j)) {
                        count++;
                        k++;
                        j++;
                    } else break;
                }
                if(count == needle.length()) return i;
            }
            i++;
        }
        return -1;
    }
    
    public static void main(String[] args) {
        System.out.println(strStr("sadbutsad", "sad"));
    }
}