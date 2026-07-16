package arrays;

import java.util.HashMap;
import java.util.Map;

public class PrefixSumCount {
    static int prefixSumCount(int[] arr, int k) {
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int l = i; l <= j; l++)
                    sum += arr[l];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }

    static int prefixSumCountBetter(int[] arr, int k) {
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum == k)
                    count++;
            }
        }
        return count;
    }

    static int prefixSumCountOptimal(int[] arr, int k) {
        Map<Integer, Integer> preMap = new HashMap<>();
        preMap.put(0, 1);
        int sum = 0, count = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            int rem = sum - k;
            count += preMap.getOrDefault(rem, 0);
            preMap.put(sum, preMap.getOrDefault(sum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -3, 1, 1, 1, 4, 2, -3};
        int k = 3;
        System.out.println(prefixSumCount(arr, k));
        System.out.println(prefixSumCountBetter(arr, k));
        System.out.println(prefixSumCountOptimal(arr, k));
    }
}
