package storing;

import java.util.Arrays;

public class InsertionSort {
    static int[] insertionSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i <= n-1; i++){
            int j = i;
            while (j > 0 && arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {3,65,7,9,2,43,1};
        System.out.println(Arrays.toString(insertionSort(arr)));
    }
}
