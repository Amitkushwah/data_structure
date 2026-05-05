package recursion;

import java.util.Arrays;

public class ReverseArray {
    static int[] arr = new int[]{2,4,1,5};
    public static void reverseArray(int l, int r){
        if(l >= r)
            return;
        swap(l, r);
        reverseArray(l+1, r-1);
    }
    public static void swap(int a, int b){
        arr[a] = arr[a]+arr[b];
        arr[b] = arr[a]-arr[b];
        arr[a] = arr[a]-arr[b];
    }

    public static void main(String[] args) {
        int n = arr.length;
        System.out.println(Arrays.toString(arr));
        reverseArray(0, n-1);
        System.out.println(Arrays.toString(arr));
    }
}
