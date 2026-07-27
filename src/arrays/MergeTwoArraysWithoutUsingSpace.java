package arrays;

import java.util.Arrays;

public class MergeTwoArraysWithoutUsingSpace {
    static void mergeArrays(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int left = n - 1;
        int right = 0;

        while (left >= 0 && right < m) {
            if (arr1[left] > arr2[right]) {
                int temp = arr1[left];
                arr1[left] = arr2[right];
                arr2[right] = temp;
                left--;
                right++;
            } else break;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }

    static void mergeArraysOptimal2(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int len = n + m;
        int gap = len / 2 + len % 2;

        while (gap > 0) {
            int left = 0;
            int right = gap;
            while (right < len) {
                if(left < n && right >= n){
                    swapIfGrater(arr1, arr2, left, right - n);
                }
                else if(left >= n){
                    swapIfGrater(arr2, arr2, left - n, right - n);
                }
                else {
                    swapIfGrater(arr1, arr1, left, right);
                }
                left++;
                right++;
            }
            if(gap == 1) break;
            gap = (gap/2) + (gap%2);
        }
    }
    private static void swapIfGrater(int[] arr1, int[] arr2, int ind1, int ind2){
        if(arr1[ind1] > arr2[ind2]){
            int temp = arr1[ind1];
            arr1[ind1] = arr2[ind2];
            arr2[ind2] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 4, 6, 8};
        int[] arr2 = {1, 3, 5, 7, 9};
        mergeArrays(arr1, arr2);
        Arrays.stream(arr1).forEach(System.out::println);
        Arrays.stream(arr2).forEach(System.out::println);
        System.out.println("--------------------");
        mergeArraysOptimal2(arr1, arr2);
        Arrays.stream(arr1).forEach(System.out::println);
        Arrays.stream(arr2).forEach(System.out::println);
    }
}
