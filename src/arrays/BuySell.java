package arrays;

public class BuySell {
    static int maximumProfit(int[] arr) {
        int n = arr.length;
        int maxProfit = 0;
        int mini = arr[0];

        for (int i = 1; i < n; i++) {
            int cost = arr[i] - mini;
            maxProfit = Math.max(maxProfit, cost);
            mini = Math.min(mini, arr[i]);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 6, 3, 4};
        System.out.println(maximumProfit(arr));
    }
}
