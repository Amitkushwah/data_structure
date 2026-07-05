package arrays;

import java.util.Arrays;

public class Sort012 {
    static void sort012(int[] arr) {
        Arrays.sort(arr);
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 1, 0, 2, 1, 2, 1, 0};
        sort012(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }

}
