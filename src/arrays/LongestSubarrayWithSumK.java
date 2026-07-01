package arrays;

public class LongestSubarrayWithSumK {
    static int longestSubarray(int[] arr, int k) {
        int n = arr.length;
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum == k)
                    maxLen = Math.max(maxLen, j - i + 1);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 1, 1, 4, 2, 3};
        int target = 4;
        System.out.println(longestSubarray(arr, target));
    }
}
