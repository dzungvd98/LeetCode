class Solution {
    public static int findAndCopyMethod(char[] c, char[] res, int i, int ri) {
        while(i < c.length && c[i] == ' ') {
            i++;
        }
        int end = i;
        while(end < c.length && c[end] != ' ') {
            end++;
        }
        if(end == i) {
            return ri;
        }
        ri = findAndCopyMethod(c, res, end + 1, ri);
        
        if(ri > 0) {
            res[ri++] = ' ';
        }
        
        for(int j = i; j < end; j++) {
            res[ri++] = c[j];
        }
        return ri;
    }
    public static String reverseWords(String s) {
//        StringBuilder res = new StringBuilder();
//        for(int i = 0; i < s.length(); i++) {
//            while(s.charAt(i) == ' ') {
//                i++;
//                if(i >= s.length()) return res.toString().trim();
//            }
//            StringBuilder word = new StringBuilder();
//            while(s.charAt(i) != ' ') {
//                word.append(s.charAt(i));
//                i++;
//                if(i >= s.length()) break;
//            }
//            res.insert(0, " ").insert(0, word);
//        }
//        return res.toString().trim();

//          char[] charStr =  s.toCharArray();
//          char[] reverse = new char[charStr.length];
//          int i = charStr.length - 1, r = 0, k, j;
//          while(i >= 0 && charStr[i] == ' ') {
//              i--;
//          }
//          
//          while(i >= 0) {
//              j = i;
//              while(i >= 0 && charStr[i] != ' ') {
//                  i--;
//              }
//              
//              if(r > 0) {
//                  reverse[r++] = ' ';
//              }
//              
//              for(k = i + 1; k <= j; k++) {
//                  reverse[r++] = charStr[k];
//              }
//              
//              while(i >= 0 && charStr[i] == ' ') {
//                  i--;
//              }
//          }
//          return new String(reverse, 0 , r);
            
            char[] c = s.toCharArray();
            char[] res = new char[c.length];
            int ri = findAndCopyMethod(c, res, 0, 0);
            return new String(res, 0, ri);
            
    }
    
    public static void main(String args[]) {
        System.out.println(reverseWords("the sky is blue"));
    }
}