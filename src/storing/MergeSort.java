package storing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {
    static void divide(int[] arr, int low, int high){
        if(high == low)
            return;
        int mid = (high+low)/2;
        divide(arr, low, mid);
        divide(arr, mid+1, high);
        merge(arr, low, mid, high);
    }
    static void merge(int[] arr, int low, int mid, int high){
        List<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid+1;
        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else {
                temp.add(arr[right]);
                right++;
            }
        }
        while (left <= mid){
            temp.add(arr[left]);
            left++;
        }
        while (right <= high){
            temp.add(arr[right]);
            right++;
        }
        for (int i = low; i <= high; i++)
                arr[i] = temp.get(i - low);
    }
    static void mergeSort(int[] arr){
        divide(arr, 0, arr.length-1);
    }

    public static void main(String[] args) {
        int[] arr = {4,65,7,34,67,9,8,12,3};
        mergeSort(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }
}
