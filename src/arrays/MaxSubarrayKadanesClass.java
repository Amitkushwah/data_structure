package arrays;

import java.util.Arrays;

public class MaxSubarrayKadanesClass {
    static int[] maxSubarray(int[] arr) {
        int n = arr.length;
        int ansStart = -1;
        int ansEnd = -1;
        int maxi = Integer.MIN_VALUE;
        int sum = 0;
        int start = -1;

        for (int i = 0; i < n; i++) {
            if (sum == 0)
                start = i;

            sum += arr[i];

            if (sum > maxi) {
                maxi = sum;
                ansStart = start;
                ansEnd = i;
            }

            if (sum < 0)
                sum = 0;
        }
        return new int[]{ansStart, ansEnd};
    }

    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        int[] ans = maxSubarray(arr);
        Arrays.stream(ans).forEach(System.out::println);
    }
}
