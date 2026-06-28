package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveZeroToLast {
    static void moveZero(int[] arr){
        int n = arr.length;
        List<Integer> temp = new ArrayList<>();
        for(int i = 0; i < n; i++)
            if(arr[i] != 0)
                temp.add(arr[i]);
        for(int i = 0; i < temp.size(); i++)
            arr[i] = temp.get(i);
        for(int i = temp.size(); i < n; i++)
            arr[i] = 0;
    }

    public static void main(String[] args) {
        int[] arr = {1,0,5,6,0,0,3,0,2};
        moveZero(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }
}
