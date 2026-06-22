package storing;

import java.util.Arrays;

public class SelectionSort {
    static int[] selectionSort(int arr[]){
        int n = arr.length;
        for(int i = 0; i <= n- 2; i++){
            int min = i;
            for(int j = i; j <= n-1; j++){
                if(arr[j] < arr[min])
                    min = j;
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {12,4,5,34,6,45,38};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }
}
