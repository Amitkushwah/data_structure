package arrays;

import java.util.Arrays;

public class RotateLeftByOne {
    static int[] rotate(int[] arr){
        int temp = arr[0];
        for(int i = 1; i < arr.length; i++){
            arr[i - 1] = arr[i];
        }
        arr[arr.length-1] = temp;
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {3,5,2,6,4};
        rotate(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }
}
