package arrays;

import java.util.ArrayList;
import java.util.List;

public class ReversePairs {
    static int divide(int[] arr, int low, int high) {
        int mid = (low + high) / 2;
        int count = 0;
        if (low == high) return count;
        count += divide(arr, low, mid);
        count += divide(arr, mid + 1, high);
        count += countPairs(arr, low, mid, high);
        merge(arr, low, mid, high);
        return count;
    }

    static void merge(int[] arr, int low, int mid, int high) {
        int left = low;
        int right = mid + 1;
        List<Integer> temp = new ArrayList<>();

        while (left <= mid && right <= high) {
            if (arr[left] < arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }
        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }

    static int countPairs(int[] arr, int low, int mid, int high) {
        int right = mid + 1;
        int count = 0;
        for (int i = low; i <= mid; i++) {
            while (right <= high && arr[i] > 2 * arr[right]) {
                right++;
            }
            count += (right - (mid + 1));
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {40, 25, 19, 12, 9, 6, 2};
        System.out.println(divide(arr, 0, arr.length - 1));
    }
}
