public class Candy_135 {
    public static int Candy(int[] ratings) {
        int n = ratings.length;
        int[] candies = new int[n];

        // Bước 1: Mỗi trẻ nhận ít nhất 1 kẹo
        for (int i = 0; i < n; i++) {
            candies[i] = 1;
        }

        // Bước 2: Duyệt từ trái sang phải
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }

        // Bước 3: Duyệt từ phải sang trái
        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
        }

        // Bước 4: Tính tổng số kẹo
        int totalCandies = 0;
        for (int candy : candies) {
            totalCandies += candy;
        }

        return totalCandies;
    }
    
    public static void main(String args[]) {
        int[] ratings = {1,2,87,87,87,2,1};
        System.out.println(Candy(ratings));
    }
}

