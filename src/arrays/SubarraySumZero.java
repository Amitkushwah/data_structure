package arrays;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumZero {
    static int subarraySumZero(int[] arr) {
        int n = arr.length;
        int maxi = 0;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum == 0)
                maxi = i + 1;
            else {
                if (map.containsKey(sum)) {
                    maxi = Math.max(maxi, i - map.get(sum));
                } else {
                    map.put(sum, i);
                }
            }
        }
        return maxi;
    }

    public static void main(String[] args) {
        int[] arr = {1, -1, 3, 2, -2, -8, 1, 7, 10, 23};
        System.out.println(subarraySumZero(arr));
    }
}
