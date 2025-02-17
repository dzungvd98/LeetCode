class Solution {
    
    public static char[] check(String s) {
        char charStr[] = s.toCharArray();
        char[] converted = new char[s.length()];
        int k = 0;
        for(int i = 0; i < s.length(); i++) {
            if(charStr[i] >= 'A' && charStr[i] <= 'Z') {
                converted[k++] = (char) (charStr[i] + 32);
            }
            else if(charStr[i] >= 'a' && charStr[i] <= 'z') {
                converted[k++] = charStr[i];
            } else if(charStr[i] >= 48 && charStr[i] <= 57) {
                converted[k++] = charStr[i];
            }
        }
        return converted;
    }
    
    public static boolean isPalindrome(String s) {
        char converted[] = check(s);
        int i = 0;
        int j = s.length() - 1;
        while(j >= 0 && converted[j] == '\0') {
                j--;
        }
        while(i <= j) {
            if(converted[i] != converted[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    
    public static void main(String[] args) {
        System.out.println(isPalindrome("0P"));
    }
}