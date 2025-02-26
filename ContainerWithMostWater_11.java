class Solution {
    public static int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int dienTichMax = 0;
        while(i <= j) {
            int chieuCao;
            if(height[i] < height[j]) {
                chieuCao = height[i];
            } else {
                chieuCao = height[j];
            }
            int dienTichHienTai = chieuCao * (j - i);
            if(dienTichHienTai > dienTichMax) {
                dienTichMax = dienTichHienTai;
            }
            if(height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return dienTichMax;
        
//        int left = 0;
//        int right = height.length-1;
//        int maxVal = 0;
//        while(left < right)
//        {
//            int minHeight = Math.min(height[left], height[right]);
//            int area = minHeight * (right - left);
//            maxVal = Math.max(maxVal, area);
//            while(left < right && height[left] <= minHeight) left++;
//            while(left < right && height[right] <= minHeight) right--;
//        }
//        return maxVal;
    }
    
    public static void main(String[] args) {
        int[] height = {1,1};
        System.out.println(maxArea(height));
    }
}