class Solution {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        int n = strs.length;
        String firstStr = strs[0];
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < firstStr.length(); i++) {
            for(String str : strs) {
                if(i >= str.length() || firstStr.charAt(i) != str.charAt(i)) {
                    return result.toString();
                }
            }
            result.append(firstStr.charAt(i));
        }
        return result.toString();
        
    }
    
    public static void main(String args[]) {
        String[] strs = {"a"};
        System.out.println(longestCommonPrefix(strs));

    }
}