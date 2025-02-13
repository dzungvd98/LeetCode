class Solution {
    public static String reverseWords(String s) {
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            while(s.charAt(i) == ' ') {
                i++;
                if(i >= s.length()) return res.toString().trim();
            }
            StringBuilder word = new StringBuilder();
            while(s.charAt(i) != ' ') {
                word.append(s.charAt(i));
                i++;
                if(i >= s.length()) break;
            }
            res.insert(0, " ").insert(0, word);
        }
        return res.toString().trim();
    }
    
    public static void main(String args[]) {
        System.out.println(reverseWords("  hello world  "));
    }
}