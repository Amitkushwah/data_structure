package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class MissingAndRepeatingNo {
    static int[] missingAnsRepeatingNo(int[] arr, int n) {
        int repeating = -1;
        int missing = -1;
        for (int i = 1; i <= n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (i == arr[j]) {
                    count++;
                }
            }
            if (count == 2) repeating = i;
            if (count == 0) missing = i;
            if (repeating != -1 && missing != -1)
                break;
        }
        return new int[]{repeating, missing};
    }

    static int[] missingAndRepeatingNoBetter(int[] arr, int n) {
        int[] hash = new int[n + 1];
        int repeating = -1;
        int missing = -1;
        for (int i = 0; i < n; i++) {
            hash[arr[i]]++;
        }
        for (int i = 1; i <= n; i++) {
            if (hash[i] == 2)
                repeating = i;
            if (hash[i] == 0)
                missing = i;
            if (repeating != -1 && missing != -1)
                break;
        }
        return new int[]{repeating, missing};
    }

    static int[] missingAndRepeatingNoOptimalMath(int[] arr, int n) {
        int sN = (n * (n + 1)) / 2;
        int s2N = (n * (n + 1) * (2 * n + 1)) / 6;
        int s = 0;
        int s2 = 0;
        for (int i = 0; i < n; i++) {
            s += arr[i];
            s2 += arr[i] * arr[i];
        }
        int val1 = s - sN; // x - y
        int val2 = s2 - s2N; // xsq - ysq = val2sq
        val2 = val2 / val1; // x + y
        int x = (val1 + val2) / 2;
        int y = x - val1;
        return new int[]{x, y};
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 1, 4, 2, 1};
        int n = 6;
        int[] result = missingAnsRepeatingNo(arr, n);
        Arrays.stream(result).forEach(System.out::println);
        System.out.println("---------------");
        int[] resultBetter = missingAndRepeatingNoBetter(arr, n);
        Arrays.stream(resultBetter).forEach(System.out::println);
        System.out.println("---------------");
        int[] resultOptimal = missingAndRepeatingNoOptimalMath(arr, n);
        Arrays.stream(resultOptimal).forEach(System.out::println);
    }
}
