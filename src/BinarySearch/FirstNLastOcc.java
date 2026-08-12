package BinarySearch;

import java.util.Arrays;

public class FirstNLastOcc {
    static int[] findOcc(int[] arr, int target){
        int n = arr.length;
        int first = -1;
        int last = -1;
        for(int i = 0; i < n; i++){
            if(arr[i] == target){
                if(first == -1)
                    first = i;
                last = i;
            }
        }
        return new int[]{first, last};
    }

    public static void main(String[] args) {
        int[] arr = {2,4,6,8,8,8,11,13};
        Arrays.stream(findOcc(arr, 8)).forEach(System.out::println);
    }
}
