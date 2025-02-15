class Solution {
    public static String reverseWords(String s) {
        StringBuilder res = new StringBuilder();
        int i = s.length() - 1;

        while (i >= 0) {
            while (i >= 0 && s.charAt(i) == ' ') i--;
            if (i < 0) break; // Thoát nếu hết chuỗi

            int end = i; // Đánh dấu vị trí cuối từ

            // Tìm đầu từ
            while (i >= 0 && s.charAt(i) != ' ') i--;

            // Lấy từ từ s (i+1 đến end) và thêm vào res
            res.append(s, i + 1, end + 1).append(" ");
        }
        return res.toString().trim();
    }
    
    public static void main(String args[]) {
        System.out.println(reverseWords("  hello world  "));
    }
}