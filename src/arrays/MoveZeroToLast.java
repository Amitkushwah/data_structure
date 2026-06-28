package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveZeroToLast {
    static void moveZero(int[] arr) {
        int n = arr.length;
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < n; i++)
            if (arr[i] != 0)
                temp.add(arr[i]);
        for (int i = 0; i < temp.size(); i++)
            arr[i] = temp.get(i);
        for (int i = temp.size(); i < n; i++)
            arr[i] = 0;
    }

    static void moveZeroOptimal(int[] arr) {
        int j = -1;
        int n = arr.length;
        for (int i = 0; i < n; i++)
            if (arr[i] == 0) {
                j = i;
                break;
            }
        if (j == -1)
            return;
        for (int i = j + 1; i < n; i++)
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 5, 6, 0, 0, 3, 0, 2};
//        moveZero(arr);
        moveZeroOptimal(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }
}
