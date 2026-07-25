package arrays;

import java.util.HashMap;
import java.util.Map;

public class SubarrayXorK {
    static int subarrayXorK(int[] arr, int k) {
        int xor = 0, count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for (int i : arr) {
            xor ^= i;
            int x = xor ^ k;
            if (map.containsKey(x)) {
                count += map.get(x);
            }
            map.put(xor, map.getOrDefault(xor, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 6, 4};
        int k = 6;
        System.out.println(subarrayXorK(arr, k));
    }
}
