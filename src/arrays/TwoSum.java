package arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    static int[] twoSum(int[] arr, int target) {
        int n = arr.length;
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++)
                if (arr[i] + arr[j] == target)
                    return new int[]{i, j};
        return new int[]{-1, -1};
    }

    static int[] twoSumBetter(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i];
            int more = target - a;
            if (map.containsKey(more)) {
                return new int[]{i, map.get(more)};
            }
            map.put(a, i);
        }
        return new int[]{-1, -1};
    }

    static boolean twoSumOptimal(int[] arr, int target) {
        int n = arr.length;
        int left = 0, right = n - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target)
                return true;
            else if (sum < target)
                left++;
            else
                right--;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;
        int[] ans = twoSum(arr, target);
        System.out.println(ans[0] + " " + ans[1]);
        int[] ans2 = twoSumBetter(arr, target);
        System.out.println(ans2[0] + " " + ans2[1]);
        System.out.println(twoSumOptimal(arr, target));
    }
}
