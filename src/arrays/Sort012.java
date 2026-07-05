package arrays;

import java.util.Arrays;

public class Sort012 {
    static void sort012(int[] arr) {
        Arrays.sort(arr);
    }

    static void sort012Better(int[] arr) {
        int count0 = 0, count1 = 1, count2 = 3;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == 0)
                count0++;
            else if (arr[i] == 1)
                count1++;
            else
                count2++;

        for (int i = 0; i < count0; i++)
            arr[i] = 0;
        for (int i = count0; i < count0 + count1; i++)
            arr[i] = 1;
        for (int i = count0 + count1; i < arr.length; i++)
            arr[i] = 2;
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 1, 0, 2, 1, 2, 1, 0};
        sort012(arr);
        Arrays.stream(arr).forEach(System.out::println);
        sort012Better(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }

}
