class Solution {
    public static int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int  j = numbers.length - 1;
        int result[] = new int[2];
        int tong = 0;
        while(i < j) {
            tong = numbers[i] + numbers[j];
            if(tong > target) {
                j--;
            } else if(tong < target) {
                i++;
            } else {
                result[0] = i + 1;
                result[1] = j + 1;
                break;
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        int numbers[] = {0, 1,2,5,6,8,15};
        int result[] = twoSum(numbers, 9);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}