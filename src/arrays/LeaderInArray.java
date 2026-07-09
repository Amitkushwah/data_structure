package arrays;

import java.util.ArrayList;
import java.util.List;

public class LeaderInArray {
    static List<Integer> leader(int[] arr) {
        int n = arr.length;
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            boolean leader = true;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[i]) {
                    leader = false;
                    break;
                }
            }
            if (leader)
                ans.add(arr[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 3, 56, 4, 5, 6};
        List<Integer> ans = leader(arr);
        ans.forEach(System.out::println);
    }
}
