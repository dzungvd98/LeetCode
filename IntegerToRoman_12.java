class Solution {
    public static String intToRoman(int num) {
//        char roman[] = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
//        int i = 0;
//        StringBuilder result = new StringBuilder();
//        while(i < roman.length && num > 0) {
//            int n = num % 10;
//            
//            StringBuilder subtext = new StringBuilder();
//            if(n == 9) {
//                subtext.append(roman[i]);
//                subtext.append(roman[i + 2]);
//                n = 0;
//            }else if (n == 4) {
//                subtext.append(roman[i]);
//                subtext.append(roman[i+1]);
//                n = 0;
//            }else if(n >= 5) {
//                subtext.append(roman[i+1]);
//                n = n - 5;
//            }
//            while(n > 0) {
//                subtext.append(roman[i]);
//                n--;
//            }
//            result.insert(0, subtext);
//            i = i + 2;
//            num/= 10;
//        }
//        return result.toString();

          int[] value = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
          String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
          StringBuilder result = new StringBuilder();
          for(int i = 0; num > 0; i++) {
              while(num >= value[i]) {
                  result.append(symbols[i]);
                  num -= value[i];
              }
          }
          return result.toString();
          
    }
    
    public static void main(String args[]) {
        System.out.println(intToRoman(4));
    } 
}