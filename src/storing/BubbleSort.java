package storing;

import java.util.Arrays;

public class BubbleSort {
    static int[] bubbleSort(int arr[]){
        int n = arr.length;
        for(int i = n-1; i >= 0; i--){
            for(int j = 0; j <= i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {4,1,3,87,7,65,34};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }
}
