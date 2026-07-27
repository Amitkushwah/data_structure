package arrays;

import java.util.Arrays;

public class MergeTwoArraysWithoutUsingSpace {
    static void mergeArrays(int[] arr1, int[] arr2){
        int n = arr1.length;
        int m = arr2.length;
        int left = n-1;
        int right = 0;

        while(left >= 0 && right < m){
            if(arr1[left] > arr2[right]){
                int temp = arr1[left];
                arr1[left] = arr2[right];
                arr2[right] = temp;
                left--;
                right++;
            }
            else break;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }

    public static void main(String[] args) {
        int[] arr1 = {2,4,6,8};
        int[] arr2 = {1,3,5,7,9};
        mergeArrays(arr1, arr2);
        Arrays.stream(arr1).forEach(System.out::println);
        System.out.println("-----------------");
        Arrays.stream(arr2).forEach(System.out::println);
    }
}
