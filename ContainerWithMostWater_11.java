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
    }
    
    public static void main(String[] args) {
        int[] height = {1,1};
        System.out.println(maxArea(height));
    }
}