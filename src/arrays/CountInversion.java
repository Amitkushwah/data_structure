package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountInversion {
    static int countInversion(int[] arr) {
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j])
                    count++;
            }
        }
        return count;
    }

    static int divide(int[] arr, int low, int high){
        int count = 0;
        if(low == high)
            return count;
        int mid = (low + high) / 2;
        count += divide(arr, low, mid);
        count += divide(arr, mid + 1, high);
        count += merge(arr, low, mid, high);
        return count;
    }

    static int merge(int[] arr, int low, int mid, int high){
        int left = low;
        int right = mid + 1;
        List<Integer> temp = new ArrayList<>();
        int count = 0;

        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else {
                temp.add(arr[right]);
                count += (mid - left + 1);
                right++;
            }
        }

        while(left <= mid){
            temp.add(arr[left]);
            left++;
        }
        while (right <= high){
            temp.add(arr[right]);
            right++;
        }

        for(int i = low; i <= high; i++){
            arr[i] = temp.get(i - low);
        }

        return count;
    }

    static int mergeSort(int[] arr){
        return divide(arr, 0, arr.length - 1);
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 4, 1};
        System.out.println(countInversion(arr));
        System.out.println("----------------");
        System.out.println(mergeSort(arr));
    }
}
