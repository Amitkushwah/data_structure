package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutive {
    static int longestConsecutive(int[] arr) {
        int n = arr.length;

        if(arr.length == 0)
            return 0;

        int longest = 1;

        for (int i = 0; i < n; i++) {
            int count = 1;
            int value = arr[i];
            while (linearSearch(arr, value + 1)) {
                count++;
                value += 1;
            }
            longest = Math.max(longest, count);
        }
        return longest;
    }

    static boolean linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == target)
                return true;
        return false;
    }

    static int longestConsecutiveBetter(int[] arr) {
        int n = arr.length;

        if(arr.length == 0)
            return 0;

        int longest = 1;
        int count = 0;
        int lastSmaller = Integer.MIN_VALUE;
        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            if (arr[i] - 1 == lastSmaller) {
                count += 1;
                lastSmaller = arr[i];
            }
            if (arr[i] != lastSmaller) {
                count = 1;
                lastSmaller = arr[i];
            }
            longest = Math.max(longest, count);
        }
        return longest;
    }

    static int longestConsecutiveOptimal(int[] arr) {
        int longest = 1;

        if(arr.length == 0)
            return 0;

        Set<Integer> set = new HashSet<>();

        for (int i : arr) {
            set.add(i);
        }

        for (int i : set) {
            if (!set.contains(i - 1)) {
                int count = 1;
                int x = i;
                while (set.contains(x + 1)) {
                    count++;
                    x++;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 3, 7, 9, 10, 4, 11};
        System.out.println(longestConsecutive(arr));
        System.out.println("-----------------");
        System.out.println(longestConsecutiveBetter(arr));
        System.out.println("-----------------");
        System.out.println(longestConsecutiveOptimal(arr));
    }
}
