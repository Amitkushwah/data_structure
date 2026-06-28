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

    static void rotateByKOptimal(int[] arr, int k, String direction){
        int n = arr.length;
        k = k % n;
        if(direction.equals("left")) {
            reverse(arr, 0, k - 1);
            reverse(arr, k, n - 1);
            reverse(arr, 0, n - 1);
        }
        else if(direction.equals("right")) {
            reverse(arr, 0, n - 1);
            reverse(arr, 0, k - 1);
            reverse(arr, k, n - 1);
        }
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
        int[] arr = {1,4,5,3,5,6,7};
        String direction = "right";
//        rotateByK(arr, 3);
        rotateByKOptimal(arr, 3, direction);
        Arrays.stream(arr).forEach(System.out::println);
    }
}
