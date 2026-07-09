package arrays;

import java.util.Arrays;

public class NextPermutation {
    static void nextPermutation(int[] arr) {
        int n = arr.length;
        int ind = -1;

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                ind = i;
                break;
            }
        }
        if (ind == -1) {
            reverse(arr, 0, n - 1);
            return;
        }
        for (int i = n - 1; i > ind; i--) {
            if (arr[i] > arr[ind]) {
                int temp = arr[ind];
                arr[ind] = arr[i];
                arr[i] = temp;
                break;
            }
        }
        reverse(arr, ind + 1, n - 1);
    }

    static void reverse(int[] arr, int a, int b) {
        while (a < b) {
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
            a++;
            b--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 4, 3, 0, 0};
        nextPermutation(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }
}
