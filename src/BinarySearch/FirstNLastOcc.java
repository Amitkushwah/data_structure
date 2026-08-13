package BinarySearch;

import java.util.Arrays;

public class FirstNLastOcc {
    static int[] findOcc(int[] arr, int target) {
        int n = arr.length;
        int first = -1;
        int last = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                if (first == -1)
                    first = i;
                last = i;
            }
        }
        return new int[]{first, last};
    }

    static int lowerBond(int[] arr, int target) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int ans = n;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] >= target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    static int upperBond(int[] arr, int target) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int ans = n;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    static int[] findOccOptimal(int[] arr, int target) {
        int lb = lowerBond(arr, target);
        if (lb == arr.length || arr[lb] != target)
            return new int[]{-1, -1};
        int ub = upperBond(arr, target);
        return new int[]{lb, ub - 1};
    }

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

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 8, 8, 11, 13};
        int target = 8;
        Arrays.stream(findOcc(arr, target)).forEach(System.out::println);
        System.out.println("----------------");
        Arrays.stream(findOccOptimal(arr, target)).forEach(System.out::println);
        System.out.println("----------------");
        Arrays.stream(findOccWithBinarySearch(arr, 8)).forEach(System.out::println);
    }
}
