class Solution {
    public static boolean isSubsequence(String s, String t) {
        char[] charS = s.toCharArray();
        char[] charT = t.toCharArray();
        
        if(charS.length == 0) return false;
        int i = 0;
        int j = 0;
        while(j < charT.length) {
            if(charS[i] == charT[j]) {
                i++;
                j++;
                if(i >= charS.length) return true;
            } else {
                j++;
            } 
        }
        return false;   
       
    }
    
    public static void main(String[] args) {
        System.out.println(isSubsequence("", "ahbgdc"));
    }
}