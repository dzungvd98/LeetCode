class Solution {
    public static int lengthOfLastWord(String s) {
        int count = 0;
        for(int i = s.length() - 1; i >=0; i--) {
            if(s.charAt(i) != ' ') {
                while(s.charAt(i) != ' ' && i >= 0) {
                    count++;
                    if(i > 0) {
                        i--;
                    } else break;
                    
                }
                break;
            }
        }
        return count;
    }
    
    public static void main(String args[]) {
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
    }
}