package arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    static int majorityElement(int[] arr) {
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j])
                    count++;
            }
            if (count >= n / 2)
                return arr[i];
        }
        return -1;
    }

    static int majorityElementBetter(int[] arr) {
        int n = arr.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> data : map.entrySet()) {
            if (data.getValue() >= n / 2)
                return data.getKey();
        }

        return -1;
    }

    static int majorityElementOptimal(int[] arr) {
        int n = arr.length;
        int el = -1;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (count == 0) {
                count++;
                el = arr[i];
            } else if (arr[i] == el) {
                count++;
            } else
                count--;
        }
        int count1 = 0;
        for (int j : arr) {
            if (j == el)
                count1++;
        }
        if (count1 >= n / 2)
            return el;
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {7, 7, 5, 7, 5, 1, 5, 7, 5, 5, 7, 7, 5, 5, 5, 5, 5};
        System.out.println(majorityElement(arr));
        System.out.println(majorityElementBetter(arr));
        System.out.println(majorityElementOptimal(arr));
    }
}
