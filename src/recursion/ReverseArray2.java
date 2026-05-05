package recursion;

import java.util.Arrays;

public class ReverseArray2 {
    public static int[] arr = new int[]{2,5,8,3,4};
    public static int n = arr.length;
    public static void reverseArray(int i){
        if(i >= n/2)
            return;
        swap(i, n-i-1);
        reverseArray(i+1);
    }

    public static void swap(int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(arr));
        reverseArray(0);
        System.out.println(Arrays.toString(arr));

    }
}
