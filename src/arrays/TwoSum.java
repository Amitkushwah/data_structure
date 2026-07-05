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

    public static void main(String[] args) {
        int[] arr = {2,6,5,8,11};
        int target = 14;
        int[] ans = twoSum(arr, target);
        System.out.println(ans[0]+" "+ans[1]);
    }
}
