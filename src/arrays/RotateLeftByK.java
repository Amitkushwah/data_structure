package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateLeftByK {
    static int[] rotateByK(int[] arr, int k){
        int n = arr.length;
        k = k % n;
        List<Integer> l = new ArrayList<>();

        for(int i = 0; i < n; i++){
            l.add(arr[i]);
        }

        for(int i = k; i < n; i++){
            arr[i-k] = arr[i];
        }

        for(int i = n - k; i < n; i++){
            arr[i] = l.get(i - (n - k));
        }
        return arr;
    }

    static int[] rotateByKOptimal(int[] arr, int k){
        int n = arr.length;
        k = k % n;
        reverse(arr, 0, k - 1);
        reverse(arr, k, n -1);
        reverse(arr, 0, n -1);
        return arr;
    }

    static void reverse(int[] arr, int start, int end){
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,4,5,3,5,6};
//        rotateByK(arr, 3);
        rotateByKOptimal(arr, 3);
        Arrays.stream(arr).forEach(System.out::println);
    }
}
