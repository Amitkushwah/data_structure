package arrays;

import java.util.HashMap;
import java.util.Map;

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

    static int longestSubarrayBetter(int[] arr, int k) {
        int n = arr.length;
        int sum = 0;
        int maxLen = 0;
        Map<Integer, Integer> preSumMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum == k)
                maxLen = Math.max(maxLen, i + 1);

            int rem = sum - k;
            if (preSumMap.containsKey(rem)) {
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }

            if (!preSumMap.containsKey(sum))
                preSumMap.put(sum, i);

        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 1, 1, 4, 2, 3};
        int target = 3;
        System.out.println(longestSubarrayBetter(arr, target));
    }
}
