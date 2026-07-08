package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AlternateNumbers {
    static int[] alternateNo(int[] arr) {
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        for (int i = 0; i < arr.length; i++)
            if (arr[i] < 0)
                neg.add(arr[i]);
            else
                pos.add(arr[i]);
        for (int i = 0; i < arr.length / 2; i++) {
            arr[2 * i] = pos.get(i);
            arr[2 * i + 1] = neg.get(i);
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {1, -3, 4, 5, -2, 6, -7, -4};
        alternateNo(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }
}
