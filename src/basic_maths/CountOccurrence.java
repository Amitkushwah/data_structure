package basic_maths;

import java.util.Arrays;

public class CountOccurrence {
    static int findFirst(int[] arr, int target) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                ans = mid;
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    static int findLast(int[] arr, int target) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                ans = mid;
                low = mid + 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    static int[] findOccWithBinarySearch(int[] arr, int target) {
        int first = findFirst(arr, target);
        if (first == -1) return new int[]{-1, -1};
        int last = findLast(arr, target);
        return new int[]{first, last};
    }

    static int countOccurrence(int[] arr, int target){
        int[] ans = findOccWithBinarySearch(arr, target);
        if(ans[0] == -1)
            return 0;
        return ans[1] - ans[0] + 1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 8, 8, 11, 13};
        System.out.println(countOccurrence(arr, 8));
    }
}
